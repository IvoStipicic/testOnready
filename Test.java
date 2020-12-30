
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concesionaria onready = new Concesionaria();
		
		Auto peugeot206 = new Auto("Peugeot","206",200000,4);
		onready.agregarProducto(peugeot206);
		Moto motoHonda = new Moto("Honda","Titan",60000,125);
		onready.agregarProducto(motoHonda);
		Auto peugeot208 = new Auto("Peugeot","208",250000,5);
		onready.agregarProducto(peugeot208);
		Moto motoYamaha = new Moto("Yamaha","YBR",80500.50,160);
		onready.agregarProducto(motoYamaha);
		
		onready.listarProductos();
		onready.vehiculoMasCaroYBarato();
		onready.ordenarVehiculosPorPrecio();
	}
	
}
