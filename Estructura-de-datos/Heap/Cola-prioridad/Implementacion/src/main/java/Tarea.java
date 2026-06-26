
public class Tarea implements Comparable<Tarea>{
    private String descripcion;
    private Paciente paciente;
public Tarea(){

}
public Tarea(String descripcion, Paciente paciente ){
    this.descripcion=descripcion;
    this.paciente=paciente;    
}
public Paciente getPaciente() {
    return paciente;
   }
	@Override
	public int compareTo(Tarea tarea) {
		 // Tarea es comparada basa en la prioridad del paciente
	      return Integer.compare(this.paciente.getPrioridad(), tarea.getPaciente().getPrioridad());
	}
	 @Override
	    public String toString() {
	        return "Tarea: " + descripcion + " para " + paciente;
	    }

}