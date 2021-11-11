
public class Principal {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado pintor1=new Pintor("mujer","Ana",28,12321321,1,30,300.50);
		Empleado jardinero1= new Jardinero("hombre","Jose",32,123123123,10,200.90);
		Factura fac=new Factura(1,"2020/07/01",12,20);
		System.out.println("---------------------toString-------------");
		System.out.println(pintor1.toString());
		System.out.println(jardinero1.toString());
		System.out.println(fac.toString());
		
		System.out.println("----------------Calcular facturas--------------");
		System.out.println("Calcular factura jardinero : "+jardinero1.calcularFactura());
		System.out.println("Calcular factura pintor : "+pintor1.calcularFactura());
		System.out.println("Calcular factura  : "+fac.calcularFactura());
	}

}
