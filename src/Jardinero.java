
public class Jardinero  extends Empleado implements ICalcular {
	private int yardasTrabjadas;
	private double precioYarda;
	public Jardinero(String genero,String nombre,int edad,int telefono, int yardaTarbajadas, double precioYarda) {
		super(genero,nombre,edad,telefono);
		this.precioYarda=precioYarda;
		this.yardasTrabjadas=yardaTarbajadas;
		// TODO Auto-generated constructor stub
	}
	public int getYardasTrabjadas() {
		return yardasTrabjadas;
	}
	public void setYardasTrabjadas(int yardasTrabjadas) {
		this.yardasTrabjadas = yardasTrabjadas;
	}
	public double getPrecioYarda() {
		return precioYarda;
	}
	public void setPrecioYarda(double precioYarda) {
		this.precioYarda = precioYarda;
	}

	public double calcularFactura() {
		// TODO Auto-generated method stub
		return this.precioYarda*this.yardasTrabjadas;
	}
	@Override
	public String toString() {
		return "Jardinero [;" + this.yardasTrabjadas + ", " + this.precioYarda + ", " + this.nombre + ", " + this.edad + ", " + this.getTelefono()
				+ ", " + this.getGenero() + "]";
	}

}
