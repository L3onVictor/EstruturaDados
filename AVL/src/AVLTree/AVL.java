package AVLTree;

public class AVL {
	No raiz;

	public int altura(No n) {
		if (n == null) {
			return 0;
		}
		return n.altura;
	}

	public int fatorBalanceamento(No n) {
		if (n == null) {
			return 0;
		}
		return altura(n.esq) - altura(n.dir);
	}

	public boolean isEmpty() {
		return this.raiz == null;
	}

	private void insereRecursivo(int valor, No no) {
		if (valor <= no.info) {
			if (no.esq == null) {
				no.esq = new No(valor);
				return;
			}
			insereRecursivo(valor, no.esq);
		} else {
			if (no.dir == null) {
				no.dir = new No(valor);
					return;
			}insereRecursivo(valor, no.dir);
		}
	}
	
public void insere(int valor) {
	if(isEmpty()) {
		raiz = new No(valor);
		return;
	}
	else {
		insereRecursivo(valor, raiz);
	}
}
public String preOrdem() {
	
	if(isEmpty()) {
		return "AVL vazia";
	}
	StringBuilder sb = new StringBuilder();
	
	preOrdemRecursivo(raiz, sb);
	
	return sb.toString().trim();
}
public void preOrdemRecursivo(No no, StringBuilder sb) {
	if(no == null) {
		return;
	}
	sb.append(no.info).append(" ");
	preOrdemRecursivo(no.esq, sb);
	preOrdemRecursivo(no.dir, sb);
}
}
