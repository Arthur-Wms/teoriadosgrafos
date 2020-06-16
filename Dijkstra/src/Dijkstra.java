import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Dijkstra {

	public static void computePaths(Vertice inicial) {
		inicial.minDistancia = 0.0;
		PriorityQueue<Vertice> verticeOrdem = new PriorityQueue<Vertice>();			//Ordenar 
		verticeOrdem.add(inicial);

		while (!verticeOrdem.isEmpty()) {		//Enquanto a lista de adjacencias ordenadas não estiver vazia
			Vertice u = verticeOrdem.poll(); 	//Atribui o valor prioritario da lista á U o retirando da lista

			for (int i = 0; i < u.adjacencias.length; i++) {
				Vertice d = u.adjacencias[i].destino;				//zerid
				double weight = u.adjacencias[i].distancia;			//75
				double distanceThroughU = u.minDistancia + weight;	//0 + 75
				if (distanceThroughU < d.minDistancia) {
					verticeOrdem.remove(d);
					d.minDistancia = distanceThroughU;
					d.previous = u;
					verticeOrdem.add(d);							//atribuindo os custos de viagem
				}
			}
		}
	}


	public static List<Vertice> getShortestPathTo(Vertice target) {

		List<Vertice> path = new ArrayList<Vertice>();

		for (Vertice vertex = target; vertex != null; vertex = vertex.previous)
			path.add(vertex);

		Collections.reverse(path);

		return path;
	}

	public static void main(String[] args) {

		Vertice v0 = new Vertice("Arad");
		Vertice v1 = new Vertice("Zerind");
		Vertice v2 = new Vertice("Sibiu");
		Vertice v3 = new Vertice("Timisoara");
		Vertice v4 = new Vertice("Oraclea");
		Vertice v5 = new Vertice("Fagaras");
		Vertice v6 = new Vertice("Rinnicu Vilcea");
		Vertice v7 = new Vertice("Lugoj");
		Vertice v8 = new Vertice("Dobreta");
		Vertice v9 = new Vertice("Pitesti");
		Vertice v10 = new Vertice("Cralova");
		Vertice v11 = new Vertice("Mehadla");
		Vertice v12 = new Vertice("Neamt");
		Vertice v13 = new Vertice("Giurgiu");
		Vertice v14 = new Vertice("Urzicenl");
		Vertice v15 = new Vertice("Vaslui");
		Vertice v16 = new Vertice("Hirsova");
		Vertice v17 = new Vertice("Iasl");
		Vertice v18 = new Vertice("Eforle");
		Vertice v19 = new Vertice("Bucharest");
		
		v0.adjacencias = new Adj[] { new Adj(v1, 75), new Adj(v2, 140), new Adj(v3, 118) };
		v1.adjacencias = new Adj[] { new Adj(v0, 75), new Adj(v4, 71) };
		v2.adjacencias = new Adj[] { new Adj(v0, 140), new Adj(v4, 151), new Adj(v5, 99), new Adj(v6, 80) };
		v3.adjacencias = new Adj[] { new Adj(v0, 118), new Adj(v7, 111) };
		v4.adjacencias = new Adj[] { new Adj(v1, 71), new Adj(v2, 151) };
		v5.adjacencias = new Adj[] { new Adj(v2, 99), new Adj(v19, 211) };
		v6.adjacencias = new Adj[] { new Adj(v2, 80), new Adj(v9, 97), new Adj(v10, 146) };
		v7.adjacencias = new Adj[] { new Adj(v3, 111), new Adj(v11, 70) };
		v8.adjacencias = new Adj[] { new Adj(v11, 75), new Adj(v10, 120) };
		v9.adjacencias = new Adj[] { new Adj(v6, 97), new Adj(v10, 138), new Adj(v19, 101) };
		v10.adjacencias = new Adj[] { new Adj(v9, 138), new Adj(v8, 120) };
		v11.adjacencias = new Adj[] { new Adj(v7, 70), new Adj(v8, 75) };
		v12.adjacencias = new Adj[] { new Adj(v17, 87) };
		v13.adjacencias = new Adj[] { new Adj(v19, 70) };
		v14.adjacencias = new Adj[] { new Adj(v19, 85), new Adj(v15, 142), new Adj(v16, 98) };
		v15.adjacencias = new Adj[] { new Adj(v14, 142), new Adj(v17, 92) };
		v16.adjacencias = new Adj[] { new Adj(v18, 86), new Adj(v14, 98) };
		v17.adjacencias = new Adj[] { new Adj(v15, 92), new Adj(v12, 87) };
		v18.adjacencias = new Adj[] { new Adj(v16, 86) };
		v19.adjacencias = new Adj[] { new Adj(v9, 101), new Adj(v5, 210), new Adj(v13, 90), new Adj(v14, 85) };


		Vertice[] vertices = { v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19 };
		computePaths(v0);			//ponto de partida

		
			System.out.println("Distancia ate " + v19 + ": " + v19.minDistancia);		//destino
			List<Vertice> path = getShortestPathTo(v15);
			System.out.println("Percorre por: " + path);
		
	}
}