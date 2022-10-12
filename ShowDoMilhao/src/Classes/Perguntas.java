package Classes;

public class Perguntas {
    
    private String pergunta, op1, op2, op3, op4;
    private int nivel, correta;
    
    public Perguntas(){}
    
    public Perguntas(String pergunta, String op1, String op2, String op3, String op4, int correta, int nivel){
        this.pergunta = pergunta;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.correta = correta;
        this.nivel = nivel;
    }   
    
    
    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCorreta() {
        return correta;
    }

    public void setCorreta(int correta) {
        this.correta = correta;
    }
    
    
    
    
    
}
