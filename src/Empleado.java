
public class Empleado implements ICalcular {
	protected String nombre;
	protected int edad;
	public enum Genero{HOMBRE, MUJER};
	private Genero genero;
	private int telefono;
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Genero getGenero() {
		return this.genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Empleado(String genero,String nombre,int edad,int telefono) {
		this.nombre=nombre;
		this.edad=edad;
		this.telefono=telefono;
		if(genero=="mujer") {
			this.genero=Genero.MUJER;
		}
		if(genero=="hombre") {
			this.genero=Genero.HOMBRE;
		}
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Empleado [;" + nombre + ", " + edad + ", " + genero + ", " + telefono + ", " + telefono + "]";
	}
	@Override
	public double calcularFactura() {
		// TODO Auto-generated method stub
		return 0;
	}

}
