###### *implementacion probado en eclipse ide. conflicto de clases en vscode, por operador new*
´package prioridad;

import java.util.PriorityQueue;
//import java.util.LinkedList;

public class AppPrioridad {

	public static void main(String[] args) {
		PriorityQueue<Tarea> tareaPrioridad = new PriorityQueue<>();
		 Paciente paciente1 = new Paciente("Carlos", 1); // Critical
		 Paciente paciente2 = new Paciente("Jose", 2);//alto
		 Paciente paciente3 = new Paciente("Karina",3);//media
		 tareaPrioridad.add(new Tarea("Cirugia de Emergencia",paciente1));
		 tareaPrioridad.add(new Tarea("Examinación de Rayos X",paciente2));
		 tareaPrioridad.add(new Tarea("Analisis de Sangre",paciente3));
		 while(!tareaPrioridad.isEmpty()) {
			 Tarea tarea = tareaPrioridad.poll();
			 System.out.println("procesanto.." + tarea);
		 }
	}

}´