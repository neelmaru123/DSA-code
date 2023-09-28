import java.util.*;

class GraphList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		GraphInp g1 = new GraphInp(n);
		g1.addEdge(0, 1);
		g1.addEdge(0, 2);
		g1.addEdge(1, 3);
		g1.addEdge(2, 4);
		g1.addEdge(3, 5);
		g1.addEdge(4, 5);
		g1.pt();

		g1.implimetBFS(0);
	}
}

class GraphInp {
	int size;
	int source, destination;

	GraphInp(int size) {
		this.size = size;
	}

	Map<Integer, List<Integer>> adjlist = new HashMap<>();

	void implimetBFS(int source) {
		Queue<Integer> q = new LinkedList<>();
		int visited[] = new int[adjlist.size()];
		q.add(source);
		while (!q.isEmpty()) {
			int temp = q.remove();
			List<Integer> v = adjlist.get(temp);
			System.out.print(temp+":");
			for (int i = 0; i < v.size(); i++) {
				if (visited[v.get(i)] == 0) {
					visited[v.get(i)] = 1;
					q.add(v.get(i));
				}
			}
		}
	}

	 void implimetDFS(int source) {
        Stack<Integer> S = new Stack<>();
       
        int visited[] = new int[nodes];

		
        q.add(source);
		while (!q.isEmpty()) {
			int temp = q.remove();
			List<Integer> v = adjlist.get(temp);
			System.out.print(temp+":");
			for (int i = 0; i < v.size(); i++) {
				if (visited[v.get(i)] == 0) {
					visited[v.get(i)] = 1;
					q.add(v.get(i));
				}
			}
		}
    }

	void addEdge(int sour, int dest) {
		if (!adjlist.containsKey(sour)) {
			adjlist.put(sour, new ArrayList<>());
		}
		adjlist.get(sour).add(dest);
	}

	void pt() {
		for (Map.Entry<Integer, List<Integer>> entry : adjlist.entrySet()) {
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}

class DFS{
	static Map<Integer,List<Integer>> adjlist = new HashMap<>();
	static Map<Integer,Boolean> visited = new HashMap<>();
	static void addedges(int u,int v,Boolean direction){

	}
	static void dfs(int start){

		visited.put(start, true);
		System.out.println(start+":");

		for(int neighbour : adjlist.getOrDefault(start,new ArrayList<>())){

			if(visited.getOrDefault(neighbour,false)){
				dfs(neighbour);
			}
		}
	}
}
