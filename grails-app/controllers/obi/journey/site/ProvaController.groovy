package obi.journey.site

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ProvaController {

    ProvaService provaService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond provaService.list(params), model:[provaCount: provaService.count()]
    }

    def show(Long id) {
        respond provaService.get(id)
    }

    def create() {
        respond new Prova(params)
    }

    def save(Prova prova) {
        if (prova == null) {
            notFound()
            return
        }

        try {
            provaService.save(prova)
        } catch (ValidationException e) {
            respond prova.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'prova.label', default: 'Prova'), prova.id])
                redirect prova
            }
            '*' { respond prova, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond provaService.get(id)
    }

    def update(Prova prova) {
        if (prova == null) {
            notFound()
            return
        }

        try {
            provaService.save(prova)
        } catch (ValidationException e) {
            respond prova.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'prova.label', default: 'Prova'), prova.id])
                redirect prova
            }
            '*'{ respond prova, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        provaService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'prova.label', default: 'Prova'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'prova.label', default: 'Prova'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
