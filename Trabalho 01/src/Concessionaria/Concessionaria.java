package Concessionaria;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concessionaria implements NotaFiscal {
	static BufferedReader br;

	public static void submenu(List lista) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int opcao, item;
		
		System.out.println("-----------------------------------");
		System.out.println("  MENU DE ITENS\n");
		System.out.println("1 - Adicionar item a fatura");
		System.out.println("2 - Remover da fatura");
		System.out.println("3 - Finalizar venda");
		System.out.println("0 - SAIR");
		System.out.println("-----------------------------------");
		System.out.print("Digite a opcao: ");
		
		opcao = Integer.parseInt(br.readLine());
		
		switch (opcao) {
		case 1:
			System.out.println("-----------------------------------");
			System.out.println("  ADICIONAR ITEM\n");
			System.out.println("Qual o tipo do item?");
			System.out.println("1 - Peca");
			System.out.println("2 - Servico");
			System.out.println("3 - Carro");
			
			System.out.println("\nDigite o tipo: ");
			item = Integer.parseInt(br.readLine());
			
			if (item == 1) {
				System.out.print("\nDigite o nome: ");
				String nome = br.readLine();
				
				System.out.print("\nDigite o valor: ");
				double valor = Double.parseDouble(br.readLine());
				
				System.out.print("Nova ou usada? Digite: ");
				String tipo = br.readLine();
				
				System.out.print("\nDigite o tempo de garantia: ");
				int tempo = Integer.parseInt(br.readLine());
				
				Peca novo = new Peca(nome, valor, tipo, hoje.plusDays(tempo));
				lista.add(novo);
				
			} else if (item == 2) {
				System.out.print("\nDigite o tipo de servico: ");
				String tipo = br.readLine();
				
				System.out.print("\nDigite o valor: ");
				double valor = Double.parseDouble(br.readLine());

				Servico novo = new Servico(tipo, valor);
				lista.add(novo);
				
			} else if (item == 3) {
				System.out.print("\nDigite o modelo: ");
				String modelo = br.readLine();
				
				System.out.print("\nDigite o valor: ");
				double valor = Double.parseDouble(br.readLine());
				
				System.out.print("\nDigite a cor: ");
				String cor = br.readLine();
				
				System.out.print("\nDigite o ano: ");
				int ano = Integer.parseInt(br.readLine());
				
				Carro novo = new Carro(modelo, valor, cor, ano);
				lista.add(novo);
			} else {
				break;
			}
			
			System.out.println("\n\n\n!! ITEM ADICIONADO!!\n");
			break;
		case 2:
			System.out.println("-----------------------------------");
			System.out.println("  REMOVER ITEM\n");
			System.out.print("Digite o código do item: ");
			
			item = Integer.parseInt(br.readLine());
			
			if(item < lista.size()) {
				lista.remove(item);
			}
			
			System.out.println("!! ITEM REMOVIDO !!\n");
			break;
		case 3:
			// Finalizar venda?
			break;
		default:
			break;
		}
		
	}

	public void emitirNF(LocalDate hoje) {
		hoje = LocalDate.now();
	}

	public static void main(String[] args) throws Exception {
		int opcao;
		List<Item> lista = new ArrayList<Item>();

		Carro carro1 = new Carro("Fiat Punto", 37.100, "Verde", 2013);
		Peca peca1 = new Peca("cambio", 400.00, "nova", hoje.plusDays(365));
		Servico servico1 = new Servico("Troca de oleo", 200.00);
		Carro carro2 = new Carro("Ford Ecosport", 19.940, "Preto", 2004);
		Peca peca2 = new Peca("Kit freio", 400.00, "usada", hoje.plusDays(90));
		Servico servico2 = new Servico("Balanceamento", 60.00);

		lista.add(carro1);
		lista.add(carro2);
		lista.add(peca1);
		lista.add(peca2);
		lista.add(servico1);
		lista.add(servico2);
		
		
		do {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("\n-----------------------------------");
			System.out.println("  SISTEMA EMISSOR DE NOTA FISCAL\n");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Exibir itens cadastrados");
			System.out.println("0 - SAIR");
			System.out.println("-----------------------------------");
			System.out.print("Digite a opcao: ");
			
			opcao = Integer.parseInt(br.readLine());
			
			
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			
			
			switch (opcao) {
			case 1:
				// Automaticamente cadastrado
				break;
			case 2:
				System.out.println("-----------------------------------");
				System.out.println("  LISTA DE ITENS CADASTRADOS\n");
				for (int i = 0; i < lista.size(); i++) {
					Item item = (Item) lista.get(i);
					System.out.println(i + " - " + item.getNome() + " (" + item.getClass().getSimpleName() + ")");
				}
				System.out.println("-----------------------------------");
				
				submenu(lista);
				break;
			default:
				System.out.println("!! OPCAO INVALIDA !!\n");
				break;
			}
			
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		} while (opcao != 0);

		br.close();

	}
}
