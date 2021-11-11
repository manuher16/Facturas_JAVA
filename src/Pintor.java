
public class Pintor extends Empleado implements ICalcular{
	private int metroPintado;
	private double precioMetro;
	public enum Pintura{EXTERIOR,INTERIOR};
	private Pintura pintura;
	public Pintor(String genero,String nombre,int edad,int telefono ,int pintura, int metroPintado,double precioMetro ) {
		super(genero,nombre,edad,telefono);
		this.metroPintado=metroPintado;
		this.precioMetro=precioMetro;
		if(pintura==1) {
			this.pintura=Pintura.EXTERIOR;
		}
		if(pintura==2) {
			this.pintura=Pintura.INTERIOR;
		}
		// TODO Auto-generated constructor stub
	}
	public int getMetroPintado() {
		return metroPintado;
	}
	public void setMetroPintado(int metroPintado) {
		this.metroPintado = metroPintado;
	}
	public Pintura getPintura() {
		return pintura;
	}
	public void setPintura(boolean pintura) {
		if(pintura) {
			this.pintura=Pintura.EXTERIOR;
		}
		if(!pintura) {
			this.pintura=Pintura.INTERIOR;
		}
	}
	public double getPrecioMetro() {
		return precioMetro;
	}
	public void setPrecioMetro(double precioMetro) {
		this.precioMetro = precioMetro;
	}
	@Override
	public double calcularFactura() {
		// TODO Auto-generated method stub
		return this.precioMetro*this.metroPintado;
	}
	@Override
	public String toString() {
		return "Pintor [;" + this.metroPintado + ", " + this.precioMetro + ", " + this.pintura + ", " + this.nombre + ", " + this.edad + ", "
				+ this.getTelefono() + ", " + this.getGenero() + "]";
	}

}
