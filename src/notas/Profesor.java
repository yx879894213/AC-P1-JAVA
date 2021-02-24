package notas;

import java.util.ArrayList;

public class Profesor extends Miembro {
	
	private final double NOTFOUND = -1;
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	
	public Profesor(String nombre, String apellido, String DNI) {
		
		super(nombre, apellido, DNI);
	
	}
	
	
	public boolean addAlumno(Alumno alumno) {

		return alumnos.add(alumno);

	}
	
	
	public boolean setNotas(String DNI, double nota1, double nota2, double nota3) {
	
		for (Alumno a : alumnos) {
			if( a.getDNI().equals(DNI) )
				return(a.setNotas(nota1, nota2, nota3));
		}
		
		return false;
	}
	
	
	public boolean setNotas(String DNI, double nota1, double nota2) {
		
		for (Alumno a : alumnos) {
			if( a.getDNI().equals(DNI) )
				return(a.setNotas(nota1, nota2));
		}
		
		return false;
	}
	
	
	public boolean setNotas(String DNI, double nota1) {
		
		for (Alumno a : alumnos) {
			if( a.getDNI().equals(DNI) )
				return(a.setNotas(nota1));
		}
		
		return false;
	}
	
	public double calculaMedia(String DNI) {
		
		for (Alumno a : alumnos) {
			if( a.getDNI().equals(DNI) )
				return(a.calculaMedia());
		}
		
		return NOTFOUND;
		
	}
	
	public String listAlumns() {
		
		StringBuilder build = new StringBuilder();
		
		for (Alumno a : alumnos) {
			build.append("\tNombre: "+a.getNombre()+"\tApellido: "+a.getApellido()+"\tDNI: "+a.getDNI()+"Nota media: "+a.calculaMedia()+"\n");
		}
		
		return build.toString();
		
	}
	
	public String mejorAlumn() {
		
		Alumno aux = alumnos.get(0);
		
		for (Alumno a : alumnos) {
			if(( a.getNumNotasAsig() == 3 && a.calculaMedia() > aux.calculaMedia() ) || aux.getNumNotasAsig() !=3)
				aux = a;
		}
		
		StringBuilder build = new StringBuilder();

		build.append("\tNombre: "+aux.getNombre()+"\tApellido: "+aux.getApellido()+"\tDNI: "+aux.getDNI()+"Nota media: "+aux.calculaMedia()+"\n");
		
		return build.toString();

	}

	
	
}
