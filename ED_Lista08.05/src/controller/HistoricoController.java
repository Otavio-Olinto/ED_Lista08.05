package controller;

import otavioolinto.pilhas.PilhaStr;

public class HistoricoController {

	public HistoricoController() {
		super();
	}
	
	public boolean inserirHistorico(PilhaStr historico, String endereco) {
		
		boolean certo = false;
		
		if(endereco.contains("http")&&endereco.contains("://www.")&&endereco.contains(".co")) {
			certo = true;
			
			historico.push(endereco);
		}else {
			System.out.println("\n");
			System.out.println("Endereço inválido, tente novamente");
		}
		return certo;
	}
	
	public void removerHistorico(PilhaStr historico)throws Exception {
		
		if(historico.isEmpty()) throw new Exception("Não há histórico para remover");
		System.out.println("\n");
		System.out.println("Endereço "+historico.pop()+" removido do histórico");
	}
	
	public void consultarHistorico(PilhaStr historico)throws Exception {
		
		if(historico.isEmpty()) throw new Exception("Não há histórico para consultar");
		System.out.println("\n");
		System.out.println("Último endereço acessado: "+historico.top());
	}

}
