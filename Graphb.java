//program for BFS

import java.util.LinkedList;
import java.util.Queue;

class Graphb{
	private int V;
	private LinkedList<Integer> adj[];
	private Queue<Integer> queue;
	
	
		Graphb(int v){
		this.V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i]=new LinkedList<>();
		}
		queue = new LinkedList<Integer>();
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	void BFS(int n){
		boolean nodes[]=new boolean[V];
		int a=0;
		
		nodes[n]=true;
		queue.add(n);
		while(!queue.isEmpty()){
			n=queue.poll();
			System.out.println(n+" ");
			
			for(int i=0;i<adj[n].size();i++){
				a=adj[n].get(i);
				if(!nodes[a]){
					nodes [a]=true;
					queue.add(a);
				}
			}	
		}		
	}
	
	public static void main(String args[]){
	
		Graphb g =new Graphb(7);
		
		g.addEdge(0,6);
		g.addEdge(6,0);
		g.addEdge(0,5);
		g.addEdge(5,0);	
		g.addEdge(5,4);
		g.addEdge(4,5);	
		g.addEdge(0,1);
		g.addEdge(1,0);	
		g.addEdge(3,4);
		g.addEdge(4,3);	
		g.addEdge(1,2);
		g.addEdge(2,1);
		g.addEdge(6,5);
		g.addEdge(5,6);
		g.addEdge(5,0);	
		g.addEdge(0,5);	
		g.addEdge(5,2);
		g.addEdge(2,5);		
		g.addEdge(2,3);
		g.addEdge(3,2);
		
		
		System.out.println("The BFS traversal of the graph is as follows:");
		g.BFS(0);
	}
	
	
	}
	
	
	
	
	
	
