###                        Implementacion como Markdown
###### *implementacion probado eclipse ide. vscode conflicto de clases, por operador new*
¨public class Paciente {
	private String nombre;
    private int prioridad;
    // 1 para critico, 2 para alta, 3 para media, 4 para baja
    public Paciente(){

    }
     public Paciente(String nombre, int prioridad) {
       this.nombre=nombre;
       this.prioridad=prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", prioridad=" + prioridad + "]";
	}

}¨