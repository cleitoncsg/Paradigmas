package teste

class Animal {
	String nomeAnimal;
	char sexo;

    static constraints = {
    	nomeAnimal(maxSize: 20);
    	sexo (sexo: true);
    }
}
