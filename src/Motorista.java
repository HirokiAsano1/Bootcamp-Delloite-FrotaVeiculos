public class Motorista {
    private String nome;
    private String cnh;
    private Veiculos veiculo_atual;

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
        this.veiculo_atual = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Veiculos getVeiculo_atual() {
        return veiculo_atual;
    }

    public void setVeiculo_atual(Veiculos veiculo_atual) {
        this.veiculo_atual = veiculo_atual;
    }

    public void atribuir_veiculo(Veiculos veiculo)
    {
        this.veiculo_atual=veiculo;
    }

    public void remover_veiculo()
    {
        this.veiculo_atual= null;
    }

    public void dirigir()
    {
        if(this.veiculo_atual != null){
            System.out.println(this.nome +" esta dirigindo um : " + this.veiculo_atual.exibir_info());
        }
        else
        {
            System.out.println(this.nome +" não esta dirigindo um veiculo");
        }

    }
}
