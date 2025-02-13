package AVLTree;

public class Teste {

	public static void main(String[] args) {
		AVL avl = new AVL();
		
		avl.insere(4);
		System.out.println(avl.preOrdem());
		avl.insere(7);
		System.out.println(avl.preOrdem());
		avl.insere(3);
		avl.insere(2);
		System.out.println(avl.preOrdem());
	}

}
