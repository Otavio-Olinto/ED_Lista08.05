package view;

import otavioolinto.pilhas.PilhaStr;
import controller.HistoricoController;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da Biblioteca PilhaStr
		// E criando a pilha Histórico
		PilhaStr historico = new PilhaStr();
		
		// Instanciando os métodos da classe HistoricoController
		HistoricoController metodo = new HistoricoController();
		
		// Criando o método de leitura com o Scanner
		Scanner ler = new Scanner(System.in);
		int opc = 0;
		
		do {
			System.out.print("\nDigite a opção desejada"+
							 "\n1 - Adicionar endereço ao histórico"+
							 "\n2 - Remover último endereço adicionado"+
							 "\n3 - Consultar o último endereço visitado"+
							 "\n4 - Sair");
			opc = Integer.parseInt(ler.nextLine());
			boolean enderecoCerto = false;
			switch(opc) {
				
				case 1:
					do {
						
						System.out.print("Digite o endereço que deseja salvar: ");
						String endereco = ler.nextLine();
						
						enderecoCerto = metodo.inserirHistorico(historico, endereco);
						
					}while(!enderecoCerto);
					
					break;
					
				case 2:
					
					try {
						
						metodo.removerHistorico(historico);
						
					}catch(Exception exc) {
						
						System.err.println(exc.getMessage());
					}
					
					break;
					
				case 3:
					
					try {
						
						metodo.consultarHistorico(historico);
						
					}catch(Exception exc) {
						
						System.err.println(exc.getMessage());
					}
					
					break;
					
				case 4:
					
					System.out.println("Fim da aplicação!");
					break;
					
				default:
					
					System.out.println("Opção inválida.\nTente novamente!");
					break;					
				
			}
			
		}while(opc!=4);
		
		ler.close();
		
		System.exit(0);
	}

}
