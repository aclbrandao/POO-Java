package lista;

public class Animal {
    private String nome;
    private String raca;

    public Animal() {
    	//os atributos possuem seus valores defaults
    	//assim podemos criar objetos sem precisar passar valores de atributos
    }
    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String caminha() {
        return (this.getNome() + " está caminhando.");
    }
}
