package obi.journey.site

class Prova {
	String nome
	int ano
	int nivel
	BigInteger valor

    static constraints = {
    	nome(nullable:false, blank:false, maxSize: 128, unique:true)
    	ano(nullable:false, blank:false)
    	nivel(nullable:false, blank:false)
    	valor(nullable:false, blank:false)
    }
}