package Classes;

public class Ranking implements Comparable<Ranking>{
    
    private String nome;
    private String valor;
    
    public Ranking(){}
    
    public Ranking(String nome, String valor){
        this.nome = nome;
        this.valor = valor;
    }
    
    @Override
    public int compareTo(Ranking outroRanking) {
        int a=0, b=0;
        if("ZERO".equals(outroRanking.valor)) a=0;
        else if("500 REAIS".equals(outroRanking.valor)) a=1;
        else if("MIL REAIS".equals(outroRanking.valor)) a=2;
        else if("2,5 MIL REAIS".equals(outroRanking.valor)) a=3;
        else if("5 MIL REAIS".equals(outroRanking.valor)) a=4;
        else if("10 MIL REAIS".equals(outroRanking.valor)) a=5;
        else if("12,5 MIL REAIS".equals(outroRanking.valor)) a=6;
        else if("25 MIL REAIS".equals(outroRanking.valor)) a=7;
        else if("50 MIL REAIS".equals(outroRanking.valor)) a=8;
        else if("100 MIL REAIS".equals(outroRanking.valor)) a=9;
        else if("125 MIL REAIS".equals(outroRanking.valor)) a=10;
        else if("250 MIL REAIS".equals(outroRanking.valor)) a=11;
        else if("500 MIL REAIS".equals(outroRanking.valor)) a=12;
        else if("1 MILHÃO DE REAIS".equals(outroRanking.valor)) a=13;

        if("ZERO".equals(this.valor)) b=0;
        else if("500 REAIS".equals(this.valor)) b=1;
        else if("MIL REAIS".equals(this.valor)) b=2;
        else if("2,5 MIL REAIS".equals(this.valor)) b=3;
        else if("5 MIL REAIS".equals(this.valor)) b=4;
        else if("10 MIL REAIS".equals(this.valor)) b=5;
        else if("12,5 MIL REAIS".equals(this.valor)) b=6;
        else if("25 MIL REAIS".equals(this.valor)) b=7;
        else if("50 MIL REAIS".equals(this.valor)) b=8;
        else if("100 MIL REAIS".equals(this.valor)) b=9;
        else if("125 MIL REAIS".equals(this.valor)) b=10;
        else if("250 MIL REAIS".equals(this.valor)) b=11;
        else if("500 MIL REAIS".equals(this.valor)) b=12;
        else if("1 MILHÃO DE REAIS".equals(this.valor)) b=13;

        if(b < a)
            return 1;
        else if(b > a)
            return -1;
        else
            return 0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }    
}
