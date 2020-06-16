
public class Vertice implements Comparable<Vertice> {

	public final String name;
	public Adj[] adjacencias;
	public double minDistancia = Double.POSITIVE_INFINITY;
	public Vertice previous;

	public Vertice(String argName) {
		name = argName;
	}

	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Vertice other) {
		return Double.compare(minDistancia, other.minDistancia);
	}

}
