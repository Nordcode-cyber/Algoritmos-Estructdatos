public class Nodo12 {
    int iData; // data item (key)
		double dData; // data item
		Nodo12 leftChild; // this node’s left child
	    Nodo12 rightChild; // this node’s right child
		public void displayNode(){ // display ourself
		System.out.print('{');
		System.out.print(iData);
		System.out.print(",");
		System.out.print(dData);
		System.out.print("}");
		}
   
}
