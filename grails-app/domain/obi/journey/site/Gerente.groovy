package obi.journey.site

class Gerente {
	int id_gerente 
	String nome
	int id_conteudo

    static constraints = {
    	id_gerente(nullable:false, blank:false, unique:true)
    	nome(nullable:false, blank:false, maxSize: 128)
    	id_conteudo(nullable:false, blank:false, unique:true)
    }
}
