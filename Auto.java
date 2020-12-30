
public class Auto extends Vehiculo{

	private int puertas;
	private final int CANT_PUERTAS_MIN = 2;
	
	public Auto(String marca, String modelo, double precio, int puertas) {
		super(marca, modelo, precio);
		this.setPuertas(puertas);
	}

	private void setPuertas(int puertas) {
		if (CANT_PUERTAS_MIN >= puertas) {
			throw new IllegalArgumentException("Las puertas del vehiculo no pueden ser menores a 2");
		}
		this.puertas = puertas;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	@Override
	public String toString() {
		
		return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Puertas: " + this.getPuertas() + " // Precio: $" + this.getPrecio();  
	}

}
