import java.util.*;
public class GraphMatrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter no of elements to insert: ");
		n = sc.nextInt();
		MatrixInp m1 = new MatrixInp(n);
		m1.adjMethod();
	}
}


class MatrixInp{
	Scanner sc = new Scanner(System.in);

	int adj[][];
	int source,destination;
	int size;
	MatrixInp(int size){
		this.size = size;
		adj = new int[size][size];
	}
	void adjMethod(){
		for(int i=0;i<size*2;i++){
			System.out.print("Enter source: ");
			source = sc.nextInt();
			System.out.println("Enter destination: ");
			destination = sc.nextInt();
			adj[source][destination] = 1;
			adj[destination][source] = 1;
		}

		for(int i =0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(adj[i][j]);
			}
			System.out.println();
		}
	}
}