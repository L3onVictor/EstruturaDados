package Fila;

public class Fila {
	private No inicio;
	private No fim;

	public void inserir(int info) {
		No no = new No(info);
		if (inicio == null) {
			inicio = no;
			fim = no;
		} else {
			fim.setProx(no);
			fim = no;
		}
	}

	public void imprime() {
		No aux = inicio;

		while (aux != null) {
			System.out.print(aux.getInfo() + " ");

			aux = aux.getProx();
		}
		System.out.println();
	}

	public void remove() {
		if(inicio == null) {
			System.out.println("A lista está vazia");
		return;
		}
			
			inicio = inicio.getProx();
		
		if(inicio == null) {
			fim = null;
			System.out.println("Lista Vazia");
		}
		
		
	}
}
