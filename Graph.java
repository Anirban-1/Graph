import java.util.*;
public abstract class Graph{
  ArrayList <Integer> adjList[];
  private int V,E;
  public Graph(int V,int E){
    this.V=V;
    this.E=E;
    adjList = new ArrayList[V];
    for(int i=0;i<V;i++)adjList[i]=new ArrayList<Integer>();
  }
  public int V(){
    return this.V;
  }
  public int E(){
    return this.E;
  }
  public ArrayList <Integer> adj(int V){
    return adjList[V];
  }
  public abstract void addEdge(int v,int w);
}
