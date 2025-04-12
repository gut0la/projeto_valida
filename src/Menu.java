import java.util.ArrayList;

public class Menu {
    public static void main(String[] args){
        // criando o gerente
        ArrayList<Double> salarioRecebido = new ArrayList<>();
        salarioRecebido.add(4100.0);
        salarioRecebido.add(4200.0);
        salarioRecebido.add(4300.0);
        Gerente gerente = new Gerente("Ana", 40, "Loja Sul", 4000.0, salarioRecebido, "Rio de Janeiro", "123", "Apto 10", "Prox Unipar");


        System.out.println("=== GERENTE ===");
        gerente.apresentarGerente();

        // cria itens
        Item item1 = new Item(1, "Tenis", "Calçado", 200.0);
        Item item2 = new Item(2, "Camiseta", "Roupa", 50.0);

        System.out.println("\n === Itens ===");
        item1.gerarDescricao();
        item2.gerarDescricao();

        // criar pedido
        Pedido pedido = new Pedido(1, new Date(10, 4, 2025), new Date(15, 4, 2025), "Carlos", "Roberto", "Havainas");
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        System.out.println("\n=== Pedido ===");
        pedido.gerarDescricaoVenda();

        // processando pedido
        ProcessaPedido processador = new ProcessaPedido();
        System.out.println("\n=== Processamento ===");
        processador.processar(pedido);
    }
}