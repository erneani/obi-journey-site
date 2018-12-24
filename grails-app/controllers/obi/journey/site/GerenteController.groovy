package obi.journey.site

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class GerenteController {

    GerenteService gerenteService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def login() {
        render view:'login'
    }

    def authenticate() {
        def gerente = Gerente.findByEmail(params.email)
        def senha = Gerente.findBySenha(params.senha)

        if(gerente && senha) {
            session.gerente = gerente
            redirect(view:'index', model:[gerente: new Gerente(params)])
        }
        else {
            flash.error = "Email ou senha incorretos"
            render(view:'login', model:[active: 'usuario'])
        }
    }

    def logout() {
        if(session.gerente) {
            session.gerente = null
            redirect action:'login', model:[flash.message = "Você saiu!"]
        }

    }

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond gerenteService.list(params), model:[gerenteCount: gerenteService.count()]
    }

    def show(Long id) {
        respond gerenteService.get(id)
    }

    def create() {
        if(!session.gerente) {
            render view:'login'
        }

        respond new Gerente(params)
    }

    def save(Gerente gerente) {
        if (gerente == null) {
            notFound()
            return
        }

        try {
            gerenteService.save(gerente)
            respond gerente, [view:'login']
            return 
        } catch (ValidationException e) {
            respond gerente.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'gerente.label', default: 'Gerente'), gerente.id])
                redirect gerente
            }
            '*' { respond gerente, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond gerenteService.get(id)
    }

    def update(Gerente gerente) {
        if (gerente == null) {
            notFound()
            return
        }

        try {
            gerenteService.save(gerente)
        } catch (ValidationException e) {
            respond gerente.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'gerente.label', default: 'Gerente'), gerente.id])
                redirect gerente
            }
            '*'{ respond gerente, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        gerenteService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'gerente.label', default: 'Gerente'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'gerente.label', default: 'Gerente'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
