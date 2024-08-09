package view;

import controller.NegativeController;

public class Principal {

	public static void main(String[] args) {
		NegativeController negative = new NegativeController();
		int[] vet = {1, 4, -10, -2, 12, -3, 21, 0, -19};
		int tamanho = vet.length;
		int qtd = 0;
		int resultado = negative.verificaNegativo(vet, qtd, tamanho);
		System.out.println(resultado);
	}

}
