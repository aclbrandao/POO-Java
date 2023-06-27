package lista;

public class AssistenteAdministrativo extends Assistente {
    private String turno; // dia ou noite
    private double adicionalNoturno;

    public AssistenteAdministrativo(String nome, double salario, int matricula, String turno, double adicionalNoturno) {
        super(matricula, nome, salario);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        if (turno.equals("noite")) {
            return (getSalario() +this.getAdicionalNoturno()) * 12;
        } else {
            return getSalario() * 12;
        }
    }

    @Override
    public String toString() {
        return "Assistente Administrativo [Nome: " + getNome() +
               ", Salário: R$" + getSalario() +
               ", Matrícula: " + getMatricula() +
               ", Turno: " + turno +
               ", Adicional Noturno: R$" + adicionalNoturno +
               ", Ganho Anual: R$" + ganhoAnual() + "]";
    }
}

