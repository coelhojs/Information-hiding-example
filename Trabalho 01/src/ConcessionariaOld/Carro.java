package ConcessionariaOld;

public class Carro extends Item {
	private String cor;
	private long ano;

	public Carro(String nome, double preco, String cor, long ano) {
		super(nome, preco);
		this.cor = cor;
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public long getAno() {
		return ano;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setAno(long ano) {
		this.ano = ano;
	}

}