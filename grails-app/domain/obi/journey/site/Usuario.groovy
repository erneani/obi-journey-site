package obi.journey.site

class Usuario {
	int id
	String nome 
	String email 
	int nivel
	BigInteger experiencia
	int caminho

    static constraints = {
    id(nullable: false, blank:false, unique:true)
    nome(nullable:false, blank:false, maxSize: 128)
    email(nullable:false, blank:false, unique:true, email:true)
    nivel(nullable:false, blank:false)
    experiencia(nullable:false, blank:false)
    caminho(nullable:false, blank:false)
    }
}