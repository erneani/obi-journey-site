package obi.journey.site

class Prova {
	int id_prova
	String nome
	int ano
	int nivel
	BigInteger valor

    static constraints = {
    	id_prova(nullable:false, blank:false, unique:true)
    	nome(nullable:false, blank:false, maxSize: 128)
    	ano(nullable:false, blank:false)
    	nivel(nullable:false, blank:false)
    	valor(nullable:false, blank:false)
    }
}