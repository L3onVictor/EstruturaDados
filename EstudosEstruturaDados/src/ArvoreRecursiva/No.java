package ArvoreRecursiva;

public class No {
	private int info;
	private No dir;
	private No esq;

	public No(int info) {
		this.info = info;
		this.dir = null;
		this.esq = null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public No getDir() {
		return dir;
	}

	public void setDir(No dir) {
		this.dir = dir;
	}

	public No getEsq() {
		return esq;
	}

	public void setEsq(No esq) {
		this.esq = esq;
	}

}
