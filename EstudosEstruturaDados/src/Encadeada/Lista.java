package Encadeada;

public class Lista {
	No ref;



	public void add(int info) {
		No novoNo = new No(info);
		if(this.ref == null) {
			ref = novoNo;
		}else {
			No refAtual = ref;
			
			while(refAtual.prox != null) {
				refAtual = refAtual.prox;
			}
			refAtual.prox = novoNo;
		}
				
	}
	public void imprime() {
		if(ref == null) {
			System.out.println("A lista está vazia!");
			return;
		}
		System.out.println();
		No aux = ref;
		while(aux != null) {
			System.out.print(aux.valor+" ");
			aux = aux.prox;
		}
	}
	public void remove(int valor) {
		if(ref == null) {
			System.out.println("A lista está vazia!");
			return;
		}
		if(ref.valor == valor) {
			ref = ref.prox;
			return;
		}
		for(No aux = ref; aux.prox != null; aux = aux.prox) {
			if(aux.prox.valor == valor) {
				aux.prox = aux.prox.prox;
				return;
			}
			if(aux.prox == null) {
				return;
			}
		}
		
		}
}
