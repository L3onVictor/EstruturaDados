package ListaCircular;

public class Teste {

	public static void main(String[] args) {
		Lista lista = new Lista();
		/*lista.insere(3);
		lista.insere(1);
		lista.insere(5);
		lista.insere(2);
		lista.insere(0);
		System.out.println(lista.imprime());
		lista.remove(3, false);
		System.out.println(lista.imprime());
		lista.remove(5, false);
		System.out.println(lista.imprime());
		lista.remove(0, false);
		System.out.println(lista.imprime());
		lista.remove(1, false);
		System.out.println(lista.imprime());
		lista.remove(2, false);
		System.out.println(lista.imprime());
	*/
		lista.insere(0);
		lista.insere(0);
		lista.insere(5);
		lista.insere(7);
		lista.insere(7);
		lista.insere(7);
		lista.insere(3);
		lista.insere(3);
		lista.insere(3);
		System.out.println(lista.imprime());
		lista.remove(3, true);
		System.out.println(lista.imprime());
		lista.remove(7, true);
		System.out.println(lista.imprime());
		lista.remove(7, true);
		System.out.println(lista.imprime());
		lista.remove(0, true);
		System.out.println(lista.imprime());
		lista.remove(5, false);
		System.out.println(lista.imprime());
		lista.insere(0);
		System.out.println(lista.imprime());
	}
	
}
