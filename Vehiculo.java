
public class Vehiculo implements Comparable<Vehiculo>{

	private String marca;
	private String modelo;
	private double precio;
	private final int PRECIO_MIN = 0;
	
	public Vehiculo(String marca, String modelo, double precio) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPrecio(precio);
	}

	private void setMarca(String marca) {
		if (marca == null) {
			throw new IllegalArgumentException("La marca no puede estar vacia");
		}
		this.marca = marca;
	}

	private void setModelo(String modelo) {
		if (modelo == null) {
			throw new IllegalArgumentException("Falta ingresar marca");
		}
		this.modelo = modelo;
	}

	private void setPrecio(double precio) {
		if (PRECIO_MIN > precio) {
			throw new IllegalArgumentException("El precio del vehiculo no puede ser menor o igual a 0");
		}
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPrecio() {
		return precio;
	}
	
	@Override
	public int compareTo(Vehiculo vehiculo) {
		return (int) ((int)this.precio - vehiculo.getPrecio());
	}
	
}
