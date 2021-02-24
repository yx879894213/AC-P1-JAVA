package notas;

public class Miembro {

	private String nombre;
	private String apellido;
	private String DNI;
	
	public Miembro() {
		super();
	}
	
	public Miembro(String nombre, String apellido, String DNI) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
		
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}


	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}	
	
	public void calificando() {
		Alumno al1 = new Alumno("Xiao", "Yang", "X8755405H");
		al1.setNotas(10.0, 10.0, 9.0);
	}
	
	
	
}
