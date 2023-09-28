import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DFS {
    void implimetDFS(int arr[][]) {
        Stack<Integer> S = new Stack<>();
        int nodes = sc.nextInt();
        int source = sc.nextInt();
        int visited[] = new int[nodes];
        S.push(source);
        while (S.peek != null) {
            int v = S.pop();
            if (visited[v] == 0) {
                visited[v] = 1;
                for (int i = 0; i < nodes; i++) {
                    if (arr[i][0] == v) {
                        S.push(arr[i][0]);
                    }
                }
            }
        }
    }

    void implimetBFS(int arr[][]){
        Queue<Integer> q = new LinkedList<>();
        int nodes = sc.nextInt();
        int source = sc.nextInt();
        int visited[] = new int[nodes];
        q.add(source);
        while(!q.isEmpty()){
            int v = q.remove();
            for(int i=0;i<nodes;i++){
                if(arr[i][0] == v){
                    if(visited[v] == 0){
                        visited[v] = 1;
                        q.add(v);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
