package controller;

public class NegativeController {

	public NegativeController() {
		super();
	}
	
	public int verificaNegativo(int[] vet, int qtd, int tamanho) {
		//Condição de Parada
		if(tamanho == 0) {
			return qtd;
		} else {
			if(vet[tamanho - 1] < 0) {
				qtd = qtd + 1;
			}
			return verificaNegativo(vet, qtd, (tamanho - 1)); //Chamada da Função 
		}
	}

}
