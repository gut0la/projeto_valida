import java.util.ArrayList;

public class Gerente extends Endereco {
    private String nome;
    private int idade;
    private String loja;
    private double salarioBase;
    private ArrayList<Double> salarioRecebido;

    public Gerente(String nome, int idade, String loja, double salarioBase, ArrayList<Double> salarioRecebido, String cidade, String bairro, String numero, String complemento){
        super(cidade, bairro, numero, complemento);
        this.nome = nome;
        this.idade = idade;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
        this.loja = loja;
    }

    // calcular média de salario
    public double calculaMedia(){
        double soma = 0;
        for (Double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.size();
    }

    public double calcularBonus() {
        return salarioBase * 0.35;
    }


    // exibe os dados de gerente
    public void apresentarGerente() {
        System.out.println("Gerente: " + nome + ", Idade: " + idade + ", Loja: " + loja);
        apresentaLogradouro();
        System.out.println("Media salarial: " + calculaMedia());
        System.out.println("Bonus: " + calcularBonus());
    }
}