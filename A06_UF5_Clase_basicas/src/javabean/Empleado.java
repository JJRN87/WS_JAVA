package javabean;

public class Empleado {
	//ATRIBUTOS DE CLASE
	public static final double SALARIO_MININO = 15_000;
	public static final double SALARIO_MAXIMO = 1_000_000;
	// atributos de instancia o de objeto
	private int idEmpleado;
	private String nombre;
	private String apellidos;
	private double salario;
	private double complementos;
	private char genero;


	/*
	 * Construcores
	 */
	public Empleado() {
		super();
	}


	public Empleado(int idEmpleado, String nombre, String apellidos, double salario, double complementos, char genero) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.complementos = complementos;
		this.genero = genero;
	}





	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getComplementos() {
		return complementos;
	}


	public void setComplementos(double complementos) {
		this.complementos = complementos;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", salarioMensual=" + salario + ", complementos=" + complementos + ", genero=" + genero + "]";
	}

	
	
	// metodos con responsabilidad de la clase
	
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}
	
	public double salarioBrutoAnual() {
		return salario + complementos;
	}
	
	public double salarioMensual() {
		return salarioBrutoAnual() / 14;
	}
	
	public double salarioMensual (int meses) {
		return salarioBrutoAnual() / meses;
	}
	
	public String liberalGenero() {
		if (genero == 'H')
			return "Hombre";
		else
			return "Mujer";
	}
	
	/*
	 * menos de 20000 bajo; 20000-40000 medio y más de 40000 alto
	 */
	public String tipoSalario() {
		if (salarioBrutoAnual() < 20_000)
			return "Salario bajo";
		if (salarioBrutoAnual() >= 20_000 && salarioBrutoAnual() <=40_000)
			return "Salario medio";
		else
			return "Salario Alto";
		
	}
	
	public static double salarioEnPagas(double salario, int meses) {
		return salario / meses;
	}
	
}
