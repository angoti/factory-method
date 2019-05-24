package log;

import java.util.List;

public abstract class CriadorDeLogs {
	public void enviarLog(List<Integer> lista, String tipo) {
		log(tipo).gravarLog(lista);
	}
	
	public abstract Log log(String tipo);//factory method
}
