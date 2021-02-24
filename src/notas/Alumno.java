package notas;

public class Alumno extends Miembro {
	
	private int numNotasAsig = 0;
	private double[] notas = new double[3];

	public Alumno(String nombre, String apellido, String DNI) {
		
		super(nombre, apellido, DNI);
		
	}
	
	public boolean setNotas(double nota1, double nota2, double nota3) {
		boolean salida = false;
		
		if(numNotasAsig == 0) {
			notas[numNotasAsig++] = nota1;
			notas[numNotasAsig++] = nota2;
			notas[numNotasAsig++] = nota3;
			System.out.println(notas[numNotasAsig-1]);
	
			salida = true;
		}
		
		return salida;
	}
	
	
	public boolean setNotas(double nota1, double nota2) {
		boolean salida = false;
		
		if(numNotasAsig < 2) {
			notas[numNotasAsig++] = nota1;
			notas[numNotasAsig++] = nota2;
			System.out.println(notas[numNotasAsig]);
	
			salida = true;
		}
		
		return salida;
	}
	
	
	public boolean setNotas(double nota1) {
		boolean salida = false;
		
		if(numNotasAsig < 3) {
			notas[numNotasAsig++] = nota1;
			System.out.println(notas[numNotasAsig]);
	
			salida = true;
		}
		
		return salida;
	}
	
	
	/**
	 * @return the numNotasAsig
	 */
	public int getNumNotasAsig() {
		return numNotasAsig;
	}
	
	
	public double calculaMedia() {
		
		return ((notas[0]+notas[1]+notas[2])/numNotasAsig) ;
	}
	
	public String getNotas() {
		
		StringBuilder build = new StringBuilder();

		for(int i=0; i<numNotasAsig; i++) {
			build.append("\tnotas"+ (i+1) +": "+notas[i]);
		}
		
		build.append("\n");
		
		return build.toString();

	}
	
	public String getNotasDetallada() {
		
		StringBuilder build = new StringBuilder();

		build.append("\tNumero de notas: "+numNotasAsig+"\n");
		
		for(int i=0; i<numNotasAsig; i++) {
			build.append("\tnotas"+ (i+1) +": "+notas[i]);
		}
		
		build.append("La media es: "+this.calculaMedia()+"\n");
		
		return build.toString();

	}
	

	
	

}
