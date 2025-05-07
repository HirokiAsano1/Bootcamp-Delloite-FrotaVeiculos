public class Veiculos {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade;

    public Veiculos(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(){
        this.velocidade += 10;
    }
    public void frear()
    {
        if(this.velocidade > 0)
        {
            this.velocidade -= 10;
        }
        else
        {
            this.velocidade = 0;
        }
    }


    public String exibir_info() {
        return "Veiculo:" + "\n" +
                "marca= " + marca + "\n" +
                 "modelo= " + modelo + "\n" +
                "ano= " + ano + "\n" +
                "velocidade= " + velocidade + "\n"
                ;
    }




}
