import java.util.List;
import java.util.Scanner;

public class MainCofre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		int opcao;

		do {
			ExibirMenu();
			opcao = scanner.nextInt();
			System.out.println();

			switch (opcao) {
			case 1:
				int opcaoMoeda;
				ExibirMenuMoedas();
				opcaoMoeda = scanner.nextInt();
				System.out.println();

				switch (opcaoMoeda) {
				case 1:
					System.out.println("Moeda Dólar.");
					System.out.println();
					System.out.print("Digite o valor para a Moeda Dólar:");

					double valorDolar = scanner.nextDouble();

					Dolar dolar = new Dolar(valorDolar, "Dólar");
					dolar.Converter();
					cofrinho.Adicionar(dolar);
					System.out.println("Moeda Dólar adicionada com sucesso no Cofre.");
					break;

				case 2:
					System.out.println("Moeda Euro.");
					System.out.println();
					System.out.print("Digite o valor para a Moeda Euro:");

					double valorEuro = scanner.nextDouble();

					Euro euro = new Euro(valorEuro, "Euro");
					euro.Converter();
					cofrinho.Adicionar(euro);
					System.out.println("Moeda Euro adicionada com sucesso no Cofre.");
					break;

				case 3:
					System.out.println("Moeda Real.");
					System.out.println();
					System.out.print("Digite o valor para a Moeda Real:");

					double valorReal = scanner.nextDouble();

					Real real = new Real(valorReal, "Real");
					real.Converter();
					cofrinho.Adicionar(real);
					System.out.println("Moeda Real adicionada com sucesso no Cofre.");
					break;
				}

				break;
			case 2:
				System.out.println("Remover Moedas do Cofre.");
				System.out.println();
				break;
			case 3:
				System.out.println("Listagem de Moedas do Cofre");
				System.out.println();

				List<Moeda> moedas = cofrinho.ListarMoedas();

				if (moedas.isEmpty()) {
					System.out.println("O Cofre está Vazio");
				} else {
					for (Moeda moeda : moedas) {
						System.out.println("Moeda:" + moeda.GetDescricao() + "- Valor:" + moeda.GetValor());
					}
				}
				break;
			case 4:
				System.out.println("Calcular Dinheiro Convertido para Real");
				System.out.println();

				List<Moeda> moedasTotais = cofrinho.ListarMoedas();

				double resultado = 0;
				if (moedasTotais.isEmpty()) {
					System.out.println("O Cofre está Vazio");
				} else {

					for (Moeda moeda : moedasTotais) {
						resultado =+ moeda.GetValor();
					}

				}

				System.out.println("- Valor Total em R$:" + resultado);

				break;
			case 0:
				System.out.println("Saindo do programa.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}

			if (opcao != 0) {
				System.out.println("Pressione Enter para continuar...");
				scanner.nextLine();
				scanner.nextLine();
			}
		} while (opcao != 0);

		scanner.close();
	}

	public static void ExibirMenu() {
		System.out.println("Menu de Opções:");
		System.out.println("1-) Adicionar Moedas de Diferentes Valores e Países em seu Cofrinho");
		System.out.println("2-) Remover Moedas Específicas do Cofrinho");
		System.out.println("3-) Listar Todas as Moedas que estão Dentro do Cofrinho");
		System.out.println("4-) Calcular quanto dinheiro existe no cofrinho convertido para Real");
		System.out.println("0-) Sair");
		System.out.print("Digite o Número da Opção Desejada: ");
	}

	public static void ExibirMenuMoedas() {
		System.out.println("Menu Moedas:");
		System.out.println("1-) Adicionar Moeda do tipo Dólar.");
		System.out.println("2-) Adicionar Moeda do tipo Euro.");
		System.out.println("3-) Adicionar Moeda do tipo Real.");
		System.out.print("Digite o Número da Opção Desejada: ");
	}
}
