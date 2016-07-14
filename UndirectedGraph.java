/*
  THIS CLASS IS FOR REPRESENTATION OF UNDIRECTED UNWEIGHTED GRAPH
*/
import java.util.*;
public class UndirectedGraph extends Graph implements DFS{
  private boolean [] marked;
  UndirectedGraph(int V,int E){
    super(V,E);
    marked = new boolean[this.V()];
  }
  public ArrayList<Integer> searchGraph(Graph graph,int source){
    return graph.adj(source);
  }
  public void mark(int v){
    marked[v]=true;
  }
  public boolean marked(int s){
    return marked[s];
  }
  public int count(Graph graph,int s){
    return graph.adj(s).size();
  }
  public void addEdge(int v,int w){
    adjList[v].add(w);
    adjList[w].add(v);
  }
}
