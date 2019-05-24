package pizza2;

public class Sistema {
	public static void main(String[] args) {
		FabricaDePizza fabricaDePizza = new FabricaDePizza();
		Pizzaria pizzaria = new Pizzaria(fabricaDePizza);
		Pizza pizza = pizzaria.pedido("calabreza");
	}
}
