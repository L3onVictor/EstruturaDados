package ListaCircular;

public class Lista {
	No ref;

	public Lista() {
		this.ref = null;
	}

	public boolean listaVazia() {
		if (ref == null)
			return true;
		return false;
	}

	public void insere(int info) {
		No novo = new No(info);
		if (listaVazia()) {
			this.ref = novo;
			ref.setProx(ref);
			return;
		}
		if (info < ref.getProx().getValor()) {
			novo.setProx(ref.getProx());
			ref.setProx(novo);
			return;
		}

		if (info >= ref.getValor()) {
			novo.setProx(ref.getProx());
			ref.setProx(novo);
			ref = novo;
			return;
		}

		for (No aux = ref.getProx(); aux != ref; aux = aux.getProx()) {
			if (info < aux.getProx().getValor()) {
				novo.setProx(aux.getProx());
				aux.setProx(novo);
				return;
			}
		}
	}

	public void remove(int info, boolean duplicados) {
		if (listaVazia()) {
			System.out.println("Lista vazia");
			return;
		}
		
		if(info == ref.getValor()) {
			if(ref == ref.getProx()) {
				ref = null;
				return;
			}
			No aux = ref.getProx();
			No ant = ref;
			
			while(ant.getProx() != ref) {
				ant = ant.getProx();
			}
				ant.setProx(aux);
				ref = ant;
			}
		
		No auxAnt = ref;
		No auxAtual = ref.getProx();
		boolean find = false;
		
		while(auxAtual != ref) {
			if (info == auxAtual.getValor()) {
				auxAnt.setProx(auxAtual.getProx());
				find = true;
				if (!duplicados) {
					return;
				} 
			}else {
					auxAnt = auxAtual;
				}
			auxAtual = auxAtual.getProx();
				
			}
		if (!find) {
			System.out.println("Resultado não encontrado");
			return;
		}
	}

	public String imprime() {

		if (listaVazia()) {
			return "lista vazia";
		}
		if (ref.getProx() == ref) {
			return String.valueOf(ref.getValor());
		}

		StringBuilder sb = new StringBuilder();
		No aux = ref.getProx();
		while (true) {
			sb.append(aux.getValor()).append(" ");
			aux = aux.getProx();
			if (aux == ref.getProx()) {
				break;
			}
		}
		return sb.toString().trim();
	}
}
