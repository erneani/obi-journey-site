package obi.journey.site

class Estagio {
	String nome
	static belongsTo = [caminho:Caminho]

    static constraints = {
    	nome(nullable:false, blank:false, maxSize: 128)
    }
}
