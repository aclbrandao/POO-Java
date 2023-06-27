package lista;

public class Rica extends Pessoa {
    private double dinheiro;

    public Rica(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void fazCompras() {
        System.out.println(super.getNome()+ " é rica tem "+ super.getIdade() +" de idade e possui:$"+ this.getDinheiro() +" para ir ao shopping fazer compras!!");
    }
}

