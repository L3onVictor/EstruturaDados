package Encadeada;

public class No {
	private int info;
	private No prox;
	
	public No (int info) {
		this.info=info;
		this.prox = null;
	};
	public No (int info, No no) {
		this.info=info;
		this.prox=no;
	}
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	};
}
