package lista;

public class AssistenteTecnico extends Assistente {
	private double bonusSalario;
    public AssistenteTecnico(double bonusSalario, String nome, double salario, int matricula) {
        super(matricula, nome, salario);
        this.bonusSalario=bonusSalario;
    }

    @Override
    public double ganhoAnual() {
        return (this.getSalario() + this.getBonusSalario()) *12;
    }

	public double getBonusSalario() {
		return bonusSalario;
	}

	public void setBonusSalario(double bonusSalario) {
		this.bonusSalario = bonusSalario;
	}
	
	 @Override
	    public String toString() {
	        return "Assistente Técnico [Nome: " + getNome() +
	               ", Salário: R$" + getSalario() +
	               ", Matrícula: " + getMatricula() +
	               ", Ganho Anual: R$" + ganhoAnual() + "]";
	    }
    
}
