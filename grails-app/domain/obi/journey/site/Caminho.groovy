package obi.journey.site

class Caminho {
	int id_caminho
	String nome
	int nivel
	int estagio
	
    static constraints = {
    	id_caminho(nullable:false, blank:false, unique:true)
    	nome(nullable:false, blank:false, maxSize: 128)
    	nivel(nullable:false, blank:false)
    	estagio(nullable:false, blank:false)
    }
}
