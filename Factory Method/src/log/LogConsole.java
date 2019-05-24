package log;

import java.util.List;

public class LogConsole implements Log {

	@Override
	public void gravarLog(List<Integer> lista) {
		for (Integer integer : lista) {
			System.out.println(integer);
		}

	}

}
