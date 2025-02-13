package AVLTree;

public class No {
	int info;
	int altura;
	No esq;
	No dir;

	public No(int info) {
		this.info = info;
		this.altura = 1;
		this.esq = null;
		this.dir = null;
	}
}
