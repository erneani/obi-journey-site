package obi.journey.site

class Gerente { 
	String nome
	String senha
	String email

    static constraints = {
    	nome nullable:false, blank:false, maxSize:128
    	senha nullable:false, blank:false, maxSize:28
    	email nullable:false, blank:false, unique:true
    }
}
