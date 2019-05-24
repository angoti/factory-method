package log;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class LogArquivo implements Log {

	@Override
	public void gravarLog(List<Integer> lista) {
		try (PrintWriter out = new PrintWriter("log.txt")) {
			for (Integer integer : lista) {
				out.println(integer);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
