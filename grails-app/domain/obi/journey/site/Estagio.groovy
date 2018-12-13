package obi.journey.site

class Estagio {
	int id_estagio
	String nome
	static belongsTo = [usuario:Usuario]

    static constraints = {
    	id_estagio(nullable:false, blank:false, unique:true)
    	nome(nullable:false, blank:false, maxSize: 128)
    }
}
