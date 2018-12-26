package obi.journey.site

class Caminho {
	String nome
    String descricao
    String estoria
	int nivel
	int estagios
	
    static constraints = {
    	id_caminho(nullable:false, blank:false, unique:true)
    	nome(nullable:false, blank:false, maxSize: 128)
    	nivel(nullable:false, blank:false)
    	estagio(nullable:false, blank:false)
    }
}
