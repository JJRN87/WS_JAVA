package javabean;

public class Empleado_HastaLaClase06_11 {
	//Creación de clase empleado, primeros ejercicios
	
	//atributos de instancia u objeto
	private int idEmpleado;
	private String nombre;
	private String apellidos;
	private double salarioMensual;
	private double complementos;
	private char genero;
	
	/*CONSTRUCTORES
	 * 
	 */
	
	// CONSTRUCTOR SIN PARAMETROS PARA QUE TE DEJE LANZAR EMP1, todo javaBEAN tiene que tener el constructor sin parametros
	public Empleado_HastaLaClase06_11 ()  {
		
	}
	
	
	
	
	
	// CONSTRUCTOR CON PARAMETROS CREADO MANUAL
	/*public Empleado (int IdEmpleado, String Apellidos, double salarioMendual) {
		this.idEmpleado = idEmpleado;
		this.apellidos = apellidos;
		this.salarioMensual = salarioMensual;
	}
	*/
	/*
	 * los getter and setter son los siguientes
	 */
	
	// POR OTRO LADO SE CONSTRUYE TAMBIEN LOS SOURCE CONSTRUCTORES
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public Empleado_HastaLaClase06_11(int idEmpleado, String nombre, String apellidos, double salarioMensual, double complementos,
			char genero) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salarioMensual = salarioMensual;
		this.complementos = complementos;
		this.genero = genero;
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
	public double getSalarioMensual() {
		return salarioMensual;
	}
	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
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
				+ ", salarioMensual=" + salarioMensual + ", complementos=" + complementos + ", genero=" + genero + "]";
	}
	
	
	
	
	/*
	@Override
	public String toString() {	
		return "Empleado [idEmpleado : " + this.getIdEmpleado() + " : " + this.getNombre() + "....]";
	}
	// * OJO ESTE DEL OVERRIDE (constructor) TIENE UNA COSA PARA HACERLO SIN NECESIDAD DE EQUIVOCARSE, QUE ES SOURCE/GENERATE TO STRING SI NO HABRÍA QUE HACER OVERRIDe manual
	 
	*/
	// Al poner private, no llegas a los datos desde el TEST EMPLEADO, y no se pueden modificar. por lo tanto, al hacer emp1. no saldría estas clases
	// De esta manera no se puede acceder, y se tendría en (setAtributo y getAtributo)
	
	
	// al poner public, realmente estas haciendo que se pueda ver la clase en cuestión y puedas editarlo
	// UN METODO LO EJECUTA UNA VARIABLE DE LA PROPIA CLASE QUE APUNTA AL OBJETO****
	
	/*
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	OJO, ESTO ES COMPLICADO Y ES LA DEMOSTACCIÓN DE COMO VA.  EN PRINCIPIO JAVA TIENE EL GETTER AND SETTER QUE TE LOS SACA DE TODOS
	**SE SACA EN SOURCE- BOTON DERECHO/SOURCER/GENERAR GETTERANDSETTER
	*/
	
	
	//metodos responsabilidad de la clase
	
	public String nombreCompleto () {
		return nombre + " " + apellidos;	
	}
	public double salarioAnual() {
		return salarioMensual * 14;
	}
	public double salarioAnual(int meses) {
		return salarioMensual * meses;
	}
	public String literalGenero() {
		if (genero == 'H')
			return "Hombre";
		else
			return "Mujer";	
	}
	
	public double salarioBrutoMensual() {
		return salarioMensual + complementos;
	}
	
	
}
