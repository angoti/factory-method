package log;

public class Logs extends CriadorDeLogs {

	@Override
	public Log log(String tipo) {
		if (tipo.equals("arquivo"))
			return new LogArquivo();
		else if (tipo.equals("console"))
			return new LogConsole();
		return null;
	}

}
