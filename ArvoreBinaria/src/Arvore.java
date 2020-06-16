
public class Arvore {

	public static No raiz;

	public static void inserir(int valor) {
		inserir(raiz, valor);
	}

	public static void inserir(No novo, int dado) {
		if (novo == null) {
			System.out.println("Raiz " + dado);
			raiz = new No(dado);
		} else {
			if (dado < novo.dado) {
				if (novo.filhos[0] != null) {
					inserir(novo.filhos[0], dado);
				} else {
					System.out.println("Inserindo " + dado + " a esquerda de " + novo.dado);
					novo.filhos[0] = new No(dado);
				}

			} else {
				if (novo.filhos[1] != null) {
					inserir(novo.filhos[1], dado);
				} else {
					System.out.println("Inserindo " + dado + " a direita de " + novo.dado);
					novo.filhos[1] = new No(dado);
				}
			}
		}
	}

	public static void preordem(No no) {
		if (no != null) {
			System.out.print(no.dado + ", ");
			preordem(no.filhos[0]);
			preordem(no.filhos[1]);

		}
	}

	public static void posordem(No no) {
		if (no != null) {
			posordem(no.filhos[0]);
			posordem(no.filhos[1]);
			System.out.print(no.dado + ", ");

		}

	}

	public static void ordem(No no) {
		if (no != null) {
			ordem(no.filhos[0]);
			System.out.print(no.dado + ", ");
			ordem(no.filhos[1]);

		}
	}

	public static void buscaSimples(No r, int i) {
		if (r == null) {
			System.out.println("Null");
		} else {
			if (r.dado > i) {
				buscaSimples(r.filhos[0], i);
			} else {
				if (r.dado < i) {
					buscaSimples(r.filhos[1], i);
				} else {
					System.out.println("No: " + r + "com valor: " + r.dado);
				}
			}
		}
	}
	
	public static void buscaProfundidade(No base) {
		if (base.filhos == null) {
			System.out.println(base.dado);
		}
		for (No filho : base.filhos) {
			System.out.println(base.dado);
			buscaProfundidade(filho);
		}
	}
}
