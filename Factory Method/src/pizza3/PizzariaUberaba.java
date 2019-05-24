package pizza3;

public class PizzariaUberaba extends Pizzaria {

	public Pizza criaPizza(String tipo) {
		if (tipo.equals("calabreza"))
			return new pizzaDeCalabresa();
		else if (tipo.equals("mussarela"))
			return new pizzaDeMussarela();
		else 
			return new pizzaUberabense();
	}
}

