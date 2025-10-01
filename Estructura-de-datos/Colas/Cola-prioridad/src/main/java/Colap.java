package main.java;

public class Colap {
    private int maxSize;
    private long[] queArray;
    private int nItems;
    public Colap(int s){ // constructor
    maxSize = s;
    queArray = new long[maxSize];
    nItems = 0; 
}
public void insert(long item){ // insert item
    int j;
    if(nItems==0) // if no items,
	    queArray[nItems++] = item; // insert at 0
    else{
	for(j=nItems-1; j>=0; j--){
		if( item > queArray[j] ) // if new item larger,
			queArray[j+1] = queArray[j]; 
			else 
				break; // done shifting
	} // end for
queArray[j+1] = item; 
nItems++;
} // end else (nItems > 0)
} // end insert()
public long remove(){ // remove minimum item
 return queArray[--nItems]; 
 }
 public long peekMin() // peek at minimum item
{ return queArray[nItems-1]; }
//-------------------------------------------------------------
public boolean isEmpty() 
{ return (nItems==0); }

public boolean isFull() // true if queue is full
{ return (nItems == maxSize); }
//-------------------------------------------------------------
} // end class PriorityQ
    

