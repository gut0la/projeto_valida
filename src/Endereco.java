public class Endereco {

    private String cidade;
    private String bairro;
    private String numero;
    private String complemento;


    public Endereco(
            String cidade,
            String bairro,
            String numero,
            String commplemento
    ){
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = commplemento;
    }

    // exibir os endereços
    public void apresentaLogradouro(){
        System.out.println("Endereço:" + cidade + "," + bairro + ", Num:" + numero);
        if (!complemento.isEmpty()){
            System.out.println(", Compl" + complemento);
        }
        System.out.println();
    }

    // metodo pra atualizar
    public void atualizaLocal(
            String novaCidade,
            String novoBairro,
            String novoNumero,
            String novoComplemento
    ){
    this.cidade = novaCidade;
    this.bairro = novoBairro;
    this.numero = novoNumero;
    this.complemento = novoComplemento;
    }
}
