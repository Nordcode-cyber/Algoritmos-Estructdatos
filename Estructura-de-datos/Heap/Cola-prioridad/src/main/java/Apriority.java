import java.util.PriorityQueue;
public class Apriority {
   
	public static void main(String[] args) {
		PriorityQueue<Tarea> tareaPrioridad = new PriorityQueue<>();
		 Paciente paciente1 = new Paciente("Carlos", 1); // Critical
		 Paciente paciente2 = new Paciente("Jose", 2);//alto
		 Paciente paciente3 = new Paciente("Karina",3);//media
		 Paciente paciente4 = new Paciente("Maria",4);
		 tareaPrioridad.add(new Tarea("Fractura aplastamiento",paciente1));
		 tareaPrioridad.add(new Tarea("Fractura leve via publica",paciente2));
		  tareaPrioridad.add(new Tarea("Hemodialisis",paciente3));
		 tareaPrioridad.add(new Tarea("Examinacion rayos X",paciente4));
		 while(!tareaPrioridad.isEmpty()) {
			 Tarea tarea = tareaPrioridad.poll();
			 System.out.println("procesando.." + tarea);
		 }
	}

}
    

