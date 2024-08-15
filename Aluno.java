package aula2.diogo;

public class Aluno {
    public String nome = null;
    public double p1;
    public double p2;
    public double ado;
    public double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getAdo() {
        return ado;
    }

    public void setAdo(double ado) {
        this.ado = ado;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia() {
        this.media = (p1 + p2 + ado)/3;
    }
}
