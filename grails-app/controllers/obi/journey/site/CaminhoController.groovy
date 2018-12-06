package obi.journey.site

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class CaminhoController {

    CaminhoService caminhoService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond caminhoService.list(params), model:[caminhoCount: caminhoService.count()]
    }

    def show(Long id) {
        respond caminhoService.get(id)
    }

    def create() {
        respond new Caminho(params)
    }

    def save(Caminho caminho) {
        if (caminho == null) {
            notFound()
            return
        }

        try {
            caminhoService.save(caminho)
        } catch (ValidationException e) {
            respond caminho.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'caminho.label', default: 'Caminho'), caminho.id])
                redirect caminho
            }
            '*' { respond caminho, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond caminhoService.get(id)
    }

    def update(Caminho caminho) {
        if (caminho == null) {
            notFound()
            return
        }

        try {
            caminhoService.save(caminho)
        } catch (ValidationException e) {
            respond caminho.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'caminho.label', default: 'Caminho'), caminho.id])
                redirect caminho
            }
            '*'{ respond caminho, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        caminhoService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'caminho.label', default: 'Caminho'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'caminho.label', default: 'Caminho'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
