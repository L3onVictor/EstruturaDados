package Encadeada;

public class Teste {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.add(0);
		lista.add(7);
		lista.add(8);
		lista.imprime();
		lista.remove(7);
		lista.imprime();
	}
	
}
