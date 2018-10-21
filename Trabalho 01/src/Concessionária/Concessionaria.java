package Concession�ria;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concessionaria implements NotaFiscal {

	public void emitirNF(LocalDate hoje) {
		hoje = LocalDate.now();
	}
//ed
	public static void main(String[] args) throws Exception {
		List<Item> lista = new ArrayList<Item>();

		Carro carro1 = new Carro("Fiat Punto", 37.100, "Verde", 2013);
		Peca peca1 = new Peca("cambio", 400.00, "nova", hoje.plusDays(365));
		Servico servico1 = new Servico("Troca de �leo", 200.00);
		Carro carro2 = new Carro("Ford Ecosport", 19.940, "Preto", 2004);
		Peca peca2 = new Peca("Kit freio", 400.00, "usada", hoje.plusDays(90));
		Servico servico2 = new Servico("Balanceamento", 60.00);

		lista.add(carro1);
		lista.add(carro2);
		lista.add(peca1);
		lista.add(peca2);
		lista.add(servico1);
		lista.add(servico2);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(
				"SISTEMA EMISSOR DE NOTA FISCAL\n1-Cadastrar produto\n2-Exibir itens cadastrados\n3-Emitir Nota Fiscal\n0-SAIR");
		int opcao = Integer.parseInt(br.readLine());

		switch (opcao) {

		case 0:
			break;
		case 1:
			for (int i = 0; i < lista.size(); i++) {
				Item item = (Item) lista.get(i);
				System.out.println(item.getNome());
			}
			break;
		case 2:
			break;
		default:
			System.out.println("Opcao invalida");
			break;
		}

		br.close();

	}

}
