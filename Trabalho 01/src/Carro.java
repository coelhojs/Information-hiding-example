
//AvoidPublicFields OK
//DontReturnMutableCollectionsOrArrays
//AvoidUncheckedParametersOfSetters OK
//UseInterfacesAsReturnType 
//AvoidProtectedFields OK
//AvoidSettersForHeavilyUsedFields 
//AvoidManySetters
//AvoidManyGetters
//UseImmutableObjects
//DontExposeInternalStructureOfClass
//AvoidExposingImplementationDetailsInMethodN
//MakeClassesPublicIfNecessary
//CheckInterrelatednessOfLayer
//AvoidReturningCollectionsArrays

import java.time.LocalDate;

public class Carro implements Tanque {
	private int anoModelo;
	private double precoCompra, precoVenda;
	private boolean jaBateu, tanque, nivelCombustivel;
	private String cor, estadoProcedencia;
	private LocalDate ultimaRevisao, dataCompra, hoje;

	public Carro(int anoModelo, double precoCompra, boolean jaBateu, String cor, String estadoProcedencia,
			LocalDate ultimaRevisao, LocalDate dataCompra) {
		this.anoModelo = anoModelo;
		this.precoCompra = precoCompra;
		this.jaBateu = jaBateu;
		this.cor = cor;
		this.estadoProcedencia = estadoProcedencia;
		this.ultimaRevisao = ultimaRevisao;
		this.dataCompra = dataCompra;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public boolean isJaBateu() {
		return jaBateu;
	}

	public String getCor() {
		return cor;
	}

	public String getEstadoProcedencia() {
		return estadoProcedencia;
	}

	public LocalDate getUltimaRevisao() {
		return ultimaRevisao;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public LocalDate getHoje() {
		return hoje;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public void setJaBateu(boolean jaBateu) {
		this.jaBateu = jaBateu;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setEstadoProcedencia(String estadoProcedencia) {
		this.estadoProcedencia = estadoProcedencia;
	}

	public void setUltimaRevisao(LocalDate ultimaRevisao) {
		this.ultimaRevisao = ultimaRevisao;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public void setHoje(LocalDate hoje) {
		this.hoje = hoje;
	}

	public String abastecer(int quantidade) {
		{
			String resp;
			if (nivelCombustivel == tanque) {
				resp = "Tanque já está cheio!";
			} else if (nivelCombustivel < tanque) {
				double quantAbastecida;
				if (quantidade > tanque) {
					quantAbastecida = tanque - nivelCombustivel;
					resp = "Foi abastecido " + quantAbastecida;
				} else if (nivelCombustivel + quantidade <= tanque) {
					nivelCombustivel += quantidade;
					resp = "Foi abastecido" + quantidade;
				} else if (nivelCombustivel + quantidade > tanque) {
					quantAbastecida = tanque - nivelCombustivel;
					resp = "Foi abastecido" + quantAbastecida;
				} else {
					resp = "Tanque já está cheio!";
				}
			} else {
				resp = "Tanque já está cheio!";
			}
			return resp;
		}
	}

	public void setPrecoVenda(double precoCompra) {
		int idadeCarro = hoje.getYear() - anoModelo;

		if (jaBateu) {
			this.precoVenda = precoCompra - (((precoCompra / 5) / 12) * (idadeCarro * 12) * 0.75);
		} else if (idadeCarro <= 3) {
			this.precoVenda = precoCompra - ((precoCompra / 5) / 12) * (idadeCarro * 12);
		} else {
			this.precoVenda = precoCompra - ((precoCompra * 0.4) * (idadeCarro * 0.95));
		}
	}

	public void revisao() {
		this.ultimaRevisao = hoje;
	}

	public boolean aptoViajar(LocalDate ultimaRevisao) {
		long periodo = hoje.toEpochDay() - ultimaRevisao.toEpochDay();
		if (periodo >= 365) {
			return false;
		} else {
			return true;
		}
	}

}
