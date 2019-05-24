package log;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	public static void main(String[] args) {
		CriadorDeLogs s = new Logs();
		List<Integer> listaDeNumerosAleatorios = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			listaDeNumerosAleatorios.add((int) (Math.random() * 101));
		}
	
		s.enviarLog(listaDeNumerosAleatorios,"arquivo");
		s.enviarLog(listaDeNumerosAleatorios,"console");
	}

}
