package obi.journey.site

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class EstagioController {

    EstagioService estagioService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond estagioService.list(params), model:[estagioCount: estagioService.count()]
    }

    def show(Long id) {
        respond estagioService.get(id)
    }

    def create() {
        respond new Estagio(params)
    }

    def save(Estagio estagio) {
        if (estagio == null) {
            notFound()
            return
        }

        try {
            estagioService.save(estagio)
        } catch (ValidationException e) {
            respond estagio.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'estagio.label', default: 'Estagio'), estagio.id])
                redirect estagio
            }
            '*' { respond estagio, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond estagioService.get(id)
    }

    def update(Estagio estagio) {
        if (estagio == null) {
            notFound()
            return
        }

        try {
            estagioService.save(estagio)
        } catch (ValidationException e) {
            respond estagio.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'estagio.label', default: 'Estagio'), estagio.id])
                redirect estagio
            }
            '*'{ respond estagio, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        estagioService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'estagio.label', default: 'Estagio'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'estagio.label', default: 'Estagio'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
