import java.util.*;
public interface DFS{
  ArrayList<Integer> searchGraph(Graph graph,int source); // find vertices connected to source in graph
  boolean marked(int v); // returns if the vertex v is marked or not
  void mark(int v); // marks the vertex
  int count(Graph graph,int source); // count the number of verteces connected to source in graph
}
