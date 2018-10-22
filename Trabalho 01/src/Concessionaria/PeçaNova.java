package Concessionaria;

import java.util.Date;

public class PeçaNova extends Peça {

    private Date dataFabricacao;

    public PeçaNova() {
        super();
    }

    public PeçaNova(int codigo, double preco, Date garantia, Date dataFabricacao) {
        super(codigo, preco, garantia);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }


}
