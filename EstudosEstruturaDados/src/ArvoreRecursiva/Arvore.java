package ArvoreRecursiva;

public class Arvore {
	private No raiz;

	public void insere(int info) {
		if (raiz == null) {
			raiz = new No(info);
			return;
		}
		insereRecursivo(info, raiz);
	}

	private void insereRecursivo(int info, No no) {
		
		if (info > no.getInfo()) {
			if (no.getDir() == null) {
				no.setDir(new No(info));
				return;
			}
			insereRecursivo(info, no.getDir());
		} else {
			if (no.getEsq() == null) {
				no.setEsq(new No(info));
				return;
			}
			insereRecursivo(info, no.getEsq());
		}

	}

	public void emOrdem() {
		
		emOrdemRecursivo(raiz);
		System.out.println();
	}

	private void emOrdemRecursivo(No no) {
		if (no != null) {
			emOrdemRecursivo(no.getEsq());
			System.out.print(no.getInfo() + " ");
			emOrdemRecursivo(no.getDir());
		}
	}
	/*
	public void buscar(int info) {
		if(raiz == null) {
			System.out.println("Arvore vazia!");
		return;
		}
		No find = buscarRecursivo(info, raiz);
		
		if (find == null) {
			System.out.println("Valor não "+ info +" encontrado");
		
		return;
		}else {
			System.out.println("Valor "+ find.getInfo()+ " encontrado!");
		}
		
	}
	*/
	public void buscar(int info) {
        if (raiz == null) {
            System.out.println("Árvore vazia!");
            return;
        }
        if (!buscarRecursivo(info, raiz)) {
            System.out.println("Valor não encontrado.");
        }
    }
	/*
	private No buscarRecursivo(int info, No no) {
		if(no == null) {
			return null;
		}
		if(info == no.getInfo()) {
		return no;
		}
		
		if(info > no.getInfo()) {
			return buscarRecursivo(info, no.getDir());
		}
		else {
			return buscarRecursivo(info, no.getEsq());
		}
		
	}
	*/
	 private boolean buscarRecursivo(int info, No no) {
	        if (no == null) {
	            return false;
	        }
	        
	        if (info == no.getInfo()) {
	            System.out.println("O No: " + no.getInfo() + " Foi encontrado!");
	            return true;
	        }
	        
	        if (info > no.getInfo()) {
	            return buscarRecursivo(info, no.getDir());
	        } else {
	            return buscarRecursivo(info, no.getEsq());
	        }
	    }
}
