package Fila;

public class Fila {
	private No inicio;
	private No fim;

	public Fila() {
		this.inicio = null;
		this.fim = null;
	}

	public boolean isEmpty() {
		return inicio == null;
	}

	public void adicionar(int info) {
		No novo = new No(info, fim);
		if (inicio == null) {
			inicio = novo;
			fim = novo;
		} else {
			fim.setProx(novo);
			fim = novo;
		}
	}

	public void imprime() {
		if (isEmpty()) {
			System.out.println("Fila vazia");
			return;
		}
	No aux = inicio;
	while(aux != null) {
		System.out.print(aux.getInfo()+ " ");
		aux = aux.getProx();
	}
	System.out.println();
	}
	
	public void remove() {
		if(isEmpty()) {
			System.out.println("Lista Vazia, sem elemento para remover");
			return;
		}
		inicio = inicio.getProx();
	}

}
