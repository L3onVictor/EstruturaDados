package Pilha;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha no = new Pilha();
		no.push(7);
		no.push(3);
		no.push(2);
		no.push(8);
		no.imprime();
		no.pop();
		no.imprime();
		no.pop();
		no.pop();
		no.pop();
		no.imprime();
		no.push(2);
		no.imprime();
	}

}
