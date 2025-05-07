public class Carro extends Veiculos {
    private int num_portas;

    public Carro(String marca, String modelo, int ano, int num_portas) {
        super(marca, modelo, ano);
        this.num_portas = num_portas;
    }

    public int getNum_portas() {
        return num_portas;
    }

    public void setNum_portas(int num_portas) {
        this.num_portas = num_portas;
    }

    @Override
    public String exibir_info() {
        return super.exibir_info() +"\n"+
                "num_portas=" + num_portas;
    }
}
