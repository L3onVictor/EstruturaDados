package Pilha;

public class Pilha {
private No topo;

public Pilha() {
	this.topo = null;
}

public boolean isEmpry() {
	return topo == null;
}

/*
public void push(int info) {
	No novo = new No(info);
	novo.setProx(topo);
	topo = novo;
}
*/

// Outra forma de implementar o Push

public void push(int info) {
	No novo = new No(info, this.topo);
	topo = novo;
}
public void pop() {
	if(isEmpry()) {
		System.out.println("Pilha vazia");
	}else {
		topo = topo.getProx();
	}
}
public void imprime() {
	if(isEmpry()) {
		System.out.println("Pilha vazia");
		return;
	}
	
	No aux = topo;
	
	while(aux != null) {
		System.out.print(aux.getInfo() + " ");
		aux = aux.getProx();
	}
	System.out.println();
}

}
