public class Listasim {
    private Node primero;	// ref to primero link
	private Node ultimo;	// ref to ultimo link
	public Listasim(){
	primero = null;	// no links on list yet
	ultimo = null;
    }
    public boolean isEmpty(){
        return primero==null;
    }
    public void ingreso_primero(long dd){
        Node nuevo_enlace = new Node(dd);
        if (isEmpty())
           ultimo =nuevo_enlace;
        nuevo_enlace.next = primero;
        primero = nuevo_enlace;
    }
    public void ingreso_ultimo(long dd){
        Node nuevo_enlace = new Node(dd);
        if( isEmpty() )	// if empty list,
	        primero = nuevo_enlace;	// primero --> newLink
	    else
	        ultimo.next = nuevo_enlace;	// old ultimo --> newLink
	    ultimo = nuevo_enlace;

    }
    public long borrar_primero(){
	long aux = primero.dData;
	if(primero.next == null)
		ultimo = null;
	primero = primero.next;
	return aux;
	}
    public void mostrarListasim()	{
	System.out.print("List (primero-->ultimo): ");
	Node actual = primero;
	// start at beginning
	while(actual != null)
	// until end of list,
	{
	actual.mostrar_enlace();
	// print data
	actual = actual.next;
	// move to next link
	}
	System.out.println("");
	}
    
}
