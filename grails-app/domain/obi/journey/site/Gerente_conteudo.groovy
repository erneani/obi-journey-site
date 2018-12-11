package obi.journey.site

class Gerente_conteudo {
	int id_cont
	String tipo

    static constraints = {
    id_cont(nullable:false, blank:false, unique:true)
    tipo(nullable:false, blank:false, maxSize: 128)
    }
}
