import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculos> veiculos;
    private List <Motorista> motoristas;

    public Frota() {
        this.veiculos = new ArrayList<>();
        this.motoristas = new ArrayList<>();
    }

    public void adicionar_veiculo(Veiculos veiculo)
    {
        this.veiculos.add(veiculo);
    }

    public void adicionar_motoristas(Motorista motorista)
    {
        this.motoristas.add(motorista);
    }

    public void Listar()
    {
        if(!veiculos.isEmpty()){
            System.out.println("Frota de Veiculos: ");
            for (Veiculos v : veiculos)
            {
                System.out.println(v.exibir_info());
                System.out.println();
            }
        }
        else {
            System.out.println("Esta Frota não possui Veiculos");
        }

        if (!motoristas.isEmpty()){
            System.out.println("Frota de Motoristas: ");
            for (Motorista m:motoristas )
            {
                System.out.println(m.getNome());
            }
        }

        else {
            System.out.println("Esta frota não possui motoristas");
        }
    }
}
