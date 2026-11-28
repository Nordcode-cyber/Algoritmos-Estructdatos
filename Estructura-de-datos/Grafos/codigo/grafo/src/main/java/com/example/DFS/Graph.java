package com.example.DFS;

public class Graph {
<<<<<<< HEAD:Estructura-de-datos/Grafos/codigo/grafo/src/main/java/com/example/DFS/Graph.java
    private final int MAX_VERTS = 20; 
    Vertex vertexList[]; // list of vertices 
     int adjMat[][];      // adjacency matrix 
    int nVerts;          // current number of vertices  
     StackX theStack; 
 

=======
  private final int MAX_VERTS = 20; 
    Vertex vertexList[]; 
     int adjMat[][];     
    int nVerts;           
     StackX theStack; 
>>>>>>> 41c61ee17404b3df6d2e1de862cb94df01e35c03:Estructura-de-datos/Grafos/implementacion/DFS/Graph.java
    public Graph(){               // constructor 
       vertexList = new Vertex[MAX_VERTS]; 
       adjMat = new int[MAX_VERTS][MAX_VERTS]; 
       nVerts = 0; 
       for(int j=0; j<MAX_VERTS; j++)      
          for(int k=0; k<MAX_VERTS; k++)  
             adjMat[j][k] = 0; 
       theStack = new StackX(); 
<<<<<<< HEAD:Estructura-de-datos/Grafos/codigo/grafo/src/main/java/com/example/DFS/Graph.java
       }  // end constructor 
=======
       } 
>>>>>>> 41c61ee17404b3df6d2e1de862cb94df01e35c03:Estructura-de-datos/Grafos/implementacion/DFS/Graph.java
    public void addVertex(char lab){ 
       vertexList[nVerts++] = new Vertex(lab); 
    }
     public void addEdge(int start, int end){ 
       adjMat[start][end] = 1; 
       adjMat[end][start] = 1; 
       } 
         public void displayVertex(int v){ 
       System.out.print(vertexList[v].label); 
       } 
        public void dfs(){  
<<<<<<< HEAD:Estructura-de-datos/Grafos/codigo/grafo/src/main/java/com/example/DFS/Graph.java
       vertexList[0].wasVisited = true;  // mark it 
       displayVertex(0);                 // display it 
       theStack.push(0);                 // push it 
   
       while( !theStack.isEmpty() ){      // until stack empty,  
          // get an unvisited vertex adjacent to stack top  
=======
       vertexList[0].wasVisited = true;  
       displayVertex(0);              
       theStack.push(0);              
       while( !theStack.isEmpty() ){     
>>>>>>> 41c61ee17404b3df6d2e1de862cb94df01e35c03:Estructura-de-datos/Grafos/implementacion/DFS/Graph.java
          int v = getAdjUnvisitedVertex( theStack.peek() );  
          if(v == -1)                  
             theStack.pop(); 
          else                       
             { 
             vertexList[v].wasVisited = true;  
             displayVertex(v);               
             theStack.push(v);               
             } 
          }  
          for(int j=0; j<nVerts; j++)
             vertexList[j].wasVisited = false; 
       }  // end dfs 
        public int getAdjUnvisitedVertex(int v){ 
       for(int j=0; j<nVerts; j++) 
          if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)  
             return j; 
       return -1; 
       }  // end getAdjUnvisitedVert() 
}
