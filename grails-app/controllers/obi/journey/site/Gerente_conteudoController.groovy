package obi.journey.site

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class Gerente_conteudoController {

    Gerente_conteudoService gerente_conteudoService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond gerente_conteudoService.list(params), model:[gerente_conteudoCount: gerente_conteudoService.count()]
    }

    def show(Long id) {
        respond gerente_conteudoService.get(id)
    }

    def create() {
        respond new Gerente_conteudo(params)
    }

    def save(Gerente_conteudo gerente_conteudo) {
        if (gerente_conteudo == null) {
            notFound()
            return
        }

        try {
            gerente_conteudoService.save(gerente_conteudo)
        } catch (ValidationException e) {
            respond gerente_conteudo.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'gerente_conteudo.label', default: 'Gerente_conteudo'), gerente_conteudo.id])
                redirect gerente_conteudo
            }
            '*' { respond gerente_conteudo, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond gerente_conteudoService.get(id)
    }

    def update(Gerente_conteudo gerente_conteudo) {
        if (gerente_conteudo == null) {
            notFound()
            return
        }

        try {
            gerente_conteudoService.save(gerente_conteudo)
        } catch (ValidationException e) {
            respond gerente_conteudo.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'gerente_conteudo.label', default: 'Gerente_conteudo'), gerente_conteudo.id])
                redirect gerente_conteudo
            }
            '*'{ respond gerente_conteudo, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        gerente_conteudoService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'gerente_conteudo.label', default: 'Gerente_conteudo'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'gerente_conteudo.label', default: 'Gerente_conteudo'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
