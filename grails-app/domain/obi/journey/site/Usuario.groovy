package obi.journey.site

class Usuario {
	String nome
	String email
	BigInteger experiencia = new BigInteger(0)
	int caminho = 1
  	String senha
	static hasOne = [nivel: Estagio]
	String sexo
	String ocupacao

    static constraints = {
    nome(nullable:false, blank:false, maxSize: 128)
    email(nullable:false, blank:false, unique:true, email:true)
    senha(nullabe:false, blank:false, unique:true)
	 	ocupacao inList: ["Desenvolvedor","Estudante","Professor","Hobby"]
    }
}
