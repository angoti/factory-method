package pizza2;

public class Pizzaria {
	private FabricaDePizza fabrica;
	
	public Pizzaria(FabricaDePizza fabrica) {
		super();
		this.fabrica = fabrica;
	}

	public Pizza pedido(String tipo) {
		Pizza pizza=fabrica.criaPizza(tipo);
		
		pizza.preparar();
		pizza.assar();
		pizza.embalar();
		
		return pizza;
	}
}
