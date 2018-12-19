package obi.journey.site

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class UsuarioController {

    UsuarioService usuarioService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def login() {
      def usuario = Usuario.findByEmail(params.email);

      if(usuario) {
        if (usuario.senha == params.senha) {
            session.usuario = usuario;
            respond usuario, [view: '/index']
            return
        } else {
            respond usuario, [view: '/login', model: [message : 'alguma coisa']]
        }

        
      }
    }

    def checkLogin() {
      redirect(view: 'index', controller: 'usuario')
    }

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond usuarioService.list(params), model:[usuarioCount: usuarioService.count()]
    }

    def show(Long id) {
        respond usuarioService.get(id)
    }

    /*
    def login() {
        render(view: login)

        def usuario = Usuario.findByNome(params.nome)
        def senha = Usuario.findByNome(params.senha)

        if (usuario && senha) {
            session.usuario = usuario
            redirect(controller: 'usuario', action: 'index')
        }
        else{
            flash.message = g.message(code: 'login.error.message')
            flash.error = true
            render view: '/login', model: [active: 'usuario']
        }
    }
    */

    def create() {
        respond new Usuario(params)
    }

    def save(Usuario usuario) {
        if (usuario == null) {
            notFound()
            return
        }

        try {
            def estagio = new Estagio(nome: 'Iniciante')
            estagio = estagio.save()
            println estagio.properties
            usuario.nivel = estagio
            println usuario.properties
            usuarioService.save(usuario)
        } catch (ValidationException e) {
            respond usuario.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'usuario.label', default: 'Usuario'), usuario.id])
                redirect usuario
            }
            '*' { respond usuario, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond usuarioService.get(id)
    }

    def update(Usuario usuario) {
        if (usuario == null) {
            notFound()
            return
        }

        try {
            usuarioService.save(usuario)
        } catch (ValidationException e) {
            respond usuario.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'usuario.label', default: 'Usuario'), usuario.id])
                redirect usuario
            }
            '*'{ respond usuario, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        usuarioService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'usuario.label', default: 'Usuario'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'usuario.label', default: 'Usuario'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
