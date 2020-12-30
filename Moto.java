
public class Moto extends Vehiculo{
	
	private int cilindrada;
	private final int CILINDRADA_MIN = 50;
	
	public Moto(String marca, String modelo, double precio, int cilindrada) {
		super(marca, modelo, precio);
		this.setCilindrada(cilindrada);
	}

	private void setCilindrada(int cilindrada) {
		if (CILINDRADA_MIN >= cilindrada) {
			throw new IllegalArgumentException("La cilindrada no puede ser menor a 50");
		}
		this.cilindrada = cilindrada;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	
	@Override
	public String toString() {
		
		return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Cilindrada: " + this.getCilindrada() + "cc // Precio: $" + this.getPrecio();  
	}

}
