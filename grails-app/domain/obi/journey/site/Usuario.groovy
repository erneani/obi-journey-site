package obi.journey.site

class Usuario {
	int id
	String nome
	String email
	BigInteger experiencia
	int caminho
  	String senha
	String sexo
	String ocupacao

    static constraints = {
    nome(nullable:false, blank:false, maxSize: 128)
    email(nullable:false, blank:false, unique:true, email:true)
    senha(nullabe:false, blank:false)
	ocupacao(nullable: false, blank: false)
    }
}
