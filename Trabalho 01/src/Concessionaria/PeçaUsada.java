package Concessionaria;

import java.util.Date;

public class PeçaUsada extends Peça{

    private int tempoUso; //Tempo de uso em dias

    public PeçaUsada() {
        super();
    }

    public PeçaUsada(int codigo, double preco, Date garantia, int tempoUso) {
        super(codigo, preco, garantia);
        this.tempoUso = tempoUso;
    }

    public int getTempoUso() {
        return tempoUso;
    }

    public void setTempoUso(int tempoUso) {
        this.tempoUso = tempoUso;
    }
}
