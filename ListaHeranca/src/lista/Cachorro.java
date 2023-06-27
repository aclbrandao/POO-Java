package lista;

public class Cachorro extends Animal {
	
    public Cachorro(String nome) {
        super(nome);
    }

    public String late() {
        return (super.getNome() + " está latindo.");
    }

    @Override
    public String toString() {
        return "Cachorro [Nome: " + super.getNome() + ", Raça: " + super.getRaca() + ", "+ this.late()+"]";
    }
}

