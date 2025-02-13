package ArvoreRecursiva;

public class Teste {

	public static void main(String[] args) {
		Arvore avr = new Arvore();

		avr.insere(4);
		avr.insere(7);
		avr.insere(3);
		avr.insere(1);
		avr.insere(4);
		avr.insere(10);
		avr.insere(6);
		avr.emOrdem();
		avr.buscar(4);
	}

}
