package com.example.BFS;

public class Queue {
    final int SIZE = 20;
 int[] queArray;
int front;
int rear;
public Queue(){            // constructor
queArray = new int[SIZE];
front = 0;
rear = -1;
}
public void insert(int j){ // put item at rear of queue

if(rear == SIZE-1)
rear = -1;
queArray[++rear] = j;
}
public int remove(){      // take item from front of queue
int temp = queArray[front++];
if(front == SIZE)
front = 0;
return temp;
}
public boolean isEmpty() { // true if queue is empty
return ( rear+1==front || (front+SIZE-1==rear) );
}
<<<<<<< HEAD:Estructura-de-datos/Grafos/codigo/grafo/src/main/java/com/example/BFS/Queue.java

=======
>>>>>>> 41c61ee17404b3df6d2e1de862cb94df01e35c03:Estructura-de-datos/Grafos/implementacion/BFS/Queue.java

}
