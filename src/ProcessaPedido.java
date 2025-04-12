public class ProcessaPedido {

    public void processar(Pedido pedido){
        System.out.println("Processando pedido " + pedido.getId());

        Date dataAtual = new Date(12, 4, 2025);
        if (dataAtual.isBefore(pedido.getDataVencimentoReserva())){
            pedido.setDataPagamento(dataAtual);
            System.out.println("Pagamento Confirmado em: " + dataAtual);
        } else {
            System.out.println("Reserva vencida! Vencimento: " + pedido.getDataVencimentoReserva());
        }
    }
}
