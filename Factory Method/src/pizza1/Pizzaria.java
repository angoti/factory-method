package pizza1;

public class Pizzaria {
	Pizza pedido(String tipo) {
		Pizza pizza=null;
		if (tipo.equals("calabreza"))
			pizza = new pizzaDeCalabresa();
		else if (tipo.equals("mussarela"))
			pizza = new pizzaDeMussarela();
		else 
			pizza = new pizzaDaCasa();
		
		pizza.preparar();
		pizza.assar();
		pizza.embalar();
		
		return pizza;
	}
}
