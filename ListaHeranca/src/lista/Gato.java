package lista;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public String mia() {
        return (super.getNome() + " está miando.");
    }

    @Override
    public String toString() {
        return "Gato [Nome: " + super.getNome() + ", Raça: " + super.getRaca() + ", "+this.mia()+"]";
    }
}

