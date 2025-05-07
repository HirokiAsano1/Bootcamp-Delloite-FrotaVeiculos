//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veiculos veiculo = new Veiculos("Marcateste","modeloteste",2010);
        veiculo.acelerar();
        veiculo.acelerar();
        veiculo.frear();
        System.out.println(veiculo.exibir_info());
        System.out.println();

        Caminhao caminhao = new Caminhao("marca teste2", "modeloteste2",2020,24);
        caminhao.acelerar();
        System.out.println(caminhao.exibir_info());
        System.out.println();

        Motorista motorista = new Motorista("Pedro","1221838");
        motorista.atribuir_veiculo(caminhao);
        motorista.dirigir();
        System.out.println();


        Frota frota = new Frota();
        frota.adicionar_motoristas(motorista);
        frota.adicionar_veiculo(caminhao);
        frota.adicionar_veiculo(veiculo);
        frota.Listar();
    }
}