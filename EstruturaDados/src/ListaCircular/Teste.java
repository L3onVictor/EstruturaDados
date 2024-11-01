package ListaCircular;

public class Teste {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.insere(7);
		lista.insere(4);
		lista.insere(10);
		lista.insere(2);
		lista.insere(10);
		lista.insere(7);
		lista.insere(7);
		lista.insere(5);
		lista.remove(4, false);
		lista.remove(7, true);
		lista.remove(10, true);;
		System.out.println(lista.imprime());
		

	}

}
