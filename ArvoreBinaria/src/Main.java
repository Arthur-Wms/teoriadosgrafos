
public class Main {

	public static void main(String[] args) {

		Arvore.inserir(10);
		Arvore.inserir(4);
		Arvore.inserir(15);
		Arvore.inserir(5);
		Arvore.inserir(2);
		Arvore.inserir(8);
		Arvore.inserir(22);

			System.out.println();
		Arvore.ordem(Arvore.raiz);
			System.out.println();
		Arvore.preordem(Arvore.raiz);
			System.out.println();
		Arvore.posordem(Arvore.raiz);
			System.out.println();

	}
}
