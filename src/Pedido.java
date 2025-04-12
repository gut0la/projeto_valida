import java.util.ArrayList;

public class Pedido {
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private String cliente;
    private String vendedor;
    private String loja;
    private ArrayList<Item> itens;


    public Pedido(
            int id,
            Date dataCriacao,
            Date dataVencimentoReserva,
            String cliente,
            String vendedor,
            String loja
    ){
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataVencimentoReserva = dataVencimentoReserva;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = new ArrayList<>();
    }


    public void adicionarItem(Item item){
        itens.add(item);
    }

    public double calculaValorTotal(){
        double total = 0;
        for(Item item : itens){
            total += item.getValor();
        }
        return total;
    }

    public void gerarDescricaoVenda(){
        System.out.println("Pedido" + id + ": Cliente:" + cliente + ", Vendedor" + vendedor + ", Loja:" + loja);
    }


    // getter
    public Date getDataVencimentoReserva(){
        return dataVencimentoReserva;
    }

    public void setDataVencimentoReserva(){
        this.dataPagamento = dataPagamento;
    }

    public Date getDataPagamento(){
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento){
        this.dataPagamento = dataPagamento;
    }

    public int getId(){
        return id;
    }
}
