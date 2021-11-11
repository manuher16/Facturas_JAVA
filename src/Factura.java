
public class Factura implements ICalcular {
	public enum Servicio{JARDINERIA,PINTURA};
	private Servicio servicio;
	private String fecha;
	private int idCliente;
	private double precioHora;
	private int unidadesServicio;
	public Factura(int servicio,String fecha,int idCliente,int unidadesServicio) {
		this.fecha=fecha;
		this.idCliente=idCliente;
		this.unidadesServicio=unidadesServicio;
		this.precioHora=servicio;
		if(servicio==1) {
			this.servicio = Servicio.JARDINERIA;
			
		}
		if(servicio==2) {
			this.servicio = Servicio.PINTURA;
		}
		// TODO Auto-generated constructor stub
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public double getPrecioHora() {
		return precioHora;
	}
	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(int servicio) {
		if(servicio==1) {
			this.servicio = Servicio.JARDINERIA;
		}
		if(servicio==2) {
			this.servicio = Servicio.PINTURA;
		}
	}
	

	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getUnidadesServicio() {
		return unidadesServicio;
	}
	public void setUnidadesServicio(int unidadesServicio) {
		this.unidadesServicio = unidadesServicio;
	}
	@Override
	public double calcularFactura() {
		// TODO Auto-generated method stub
		return this.precioHora*this.unidadesServicio;
	}
	@Override
	public String toString() {
		return "Factura [;" + servicio + ", " + fecha + ", " + idCliente + ", " + precioHora + ", " + unidadesServicio
				+ ", " + getIdCliente() + ", " + getPrecioHora() + ", " + getServicio() + ", " + getFecha() + ", "
				+ getUnidadesServicio() + ", " + calcularFactura() + ", " + getClass() + ", " + hashCode() + ", "
				+ super.toString() + "]";
	}

}
