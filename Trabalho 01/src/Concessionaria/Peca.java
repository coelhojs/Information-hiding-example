package Concessionaria;

import java.util.Date;

public abstract class Peça {
    private int codigo;
    private double preco;
    private Date garantia;

    public Peça() {
    }

    public Peça(int codigo, double preco, Date garantia) {
        this.codigo = codigo;
        this.preco = preco;
        this.garantia = garantia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getGarantia() {
        return garantia;
    }

    public void setGarantia(Date garantia) {
        this.garantia = garantia;
    }
}
