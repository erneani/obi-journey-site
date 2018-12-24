package obi.journey.site

class Gerente { 
	String nome
	String senha
	String email

    static constraints = {
    	nome(nullable:false, blank:false, maxSize:128)
    	senha(nullabel:false, blank:false, maxSize:28)
    }
}
