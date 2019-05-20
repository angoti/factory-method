package imagens;

public class CriaImagemUsandoSufixo extends CriaImagem {

	@Override
	Imagem criaImagem(String nomeArquivo) {
		if (nomeArquivo.endsWith("jpg"))
			return new JPGImagem();
		else if (nomeArquivo.endsWith("png"))
			return new PNGImagem();
		else
			return null;
	}

}
