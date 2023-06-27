package lista;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(int matricula, String nome, double salario) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: R$" + getSalario());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Ganho Anual: R$" + ganhoAnual());
    }
}
