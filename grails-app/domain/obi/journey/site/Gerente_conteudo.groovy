package obi.journey.site

class Gerente_conteudo {
	String tipo

    static constraints = {
   		tipo(nullable:false, blank:false, maxSize: 128)
    }
}
