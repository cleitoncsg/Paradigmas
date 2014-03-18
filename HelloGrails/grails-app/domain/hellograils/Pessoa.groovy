package hellograils

class Pessoa {

	String nome, email;

    static constraints = {
    	nome (maxSize: 10);
    	email(email: true);
    }
}
