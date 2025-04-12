public class Date {

    private int dia, mes, ano;

    // converte data pra string
    public Date(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean isBefore(Date outra){
        if (this.ano != outra.ano) return this.ano < outra.ano;
        if(this.mes != outra.mes) return this.mes < outra.mes;
        return this.dia < outra.dia;
    }


    // Getters
    public int  getDia() { return dia; }
    public int geMes() { return mes; }
    public int getAno() { return ano; }
}
