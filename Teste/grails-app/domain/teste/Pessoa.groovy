package teste

class Pessoa {
    String nome;
    String email;
	
    static constraints = {
		nome (maxSize : 10);
		email(email: true);
    }
}
