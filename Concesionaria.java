import java.util.ArrayList;
import java.util.Collections;

public class Concesionaria {

	private ArrayList<Vehiculo> listaVehiculos;
	
	public Concesionaria() {
		this.listaVehiculos = new ArrayList<>();
	}
	
	public void listarProductos() {
		
	for (Vehiculo vehiculo :this.listaVehiculos) {
		
		System.out.println(vehiculo.toString());
		
		}
	System.out.println("=============================");
	}
	
	public void agregarProducto(Vehiculo vehiculo) {
		this.listaVehiculos.add(vehiculo);
	}
	
	public void vehiculoMasCaroYBarato() {
		System.out.println("Vehículo más caro: " + Collections.max(listaVehiculos).getMarca() + " " + Collections.max(listaVehiculos).getModelo());
		
		System.out.println("Vehículo más barato: " + Collections.min(listaVehiculos).getMarca() + " " + Collections.min(listaVehiculos).getModelo());
		
		System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: ");
		
		System.out.println("=============================");
	}
	
	public void ordenarVehiculosPorPrecio() {
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		
		Collections.sort(this.listaVehiculos, Collections.reverseOrder());
		
		for(Vehiculo vehiculo: this.listaVehiculos) {
			System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo());
		}
	}
}
