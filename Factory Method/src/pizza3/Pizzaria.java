package pizza3;

public abstract class Pizzaria {

	abstract Pizza criaPizza(String tipo);

	public Pizza pedido(String tipo) {
		Pizza pizza = criaPizza(tipo);

		pizza.preparar();
		pizza.assar();
		pizza.embalar();

		return pizza;
	}
}
