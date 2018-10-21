
//AvoidPublicFields
//DontReturnMutableCollectionsOrArrays
//AvoidUncheckedParametersOfSetters
//UseInterfacesAsReturnType
//AvoidProtectedFields
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

public class Carro {
	private int anoFabricacao, anoModelo, portaMala;
	private double precoCompra, precoVenda, tanque;
	private boolean jaBateu;
	private String cor, pneusMarca, estadoProcedencia;
	private LocalDate ultimaRevisao, dataCompra, dataPneus, hoje;

	public void abastecer(double litros) {

	}

	public double setPrecoVenda(double precoCompra) {
		if (jaBateu) {

		} else if (anoFabricacao <= 3) {
			// - Divida o valor do carro zero km (exemplo: R$35.000) por 5, ​para saber o
			// valor anual de depreciação (R$35.000 / 5 = R$7.000);
			// - Divida esse valor (R$7.000) por 12, que é o número de meses do ano; ​
			// ​- O valor obtido (R$583,33) representa o quanto o carro vai desvalorizar a
			// cada mês. Ou seja, depois de sair da concessionária, você pode considerar
			// que, a cada mês, o carro em questão depreciará aproximadamente R$580. A conta
			// é fácil, não é? ​
		} else {

		}
		return this.precoVenda;
	}

	public void revisao() {

	}

	public boolean aptoViajar(LocalDate ultimaRevisao) {
		int periodo = ultimaRevisao.getDayOfYear() - hoje.getDayOfYear();
		if (periodo >= 1) {
			return false;

		} else {
			return true;
		}
	}

	public tanqueCheio() {
		
	}
}
