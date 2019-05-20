package imagens;

public class Cliente {
	public static void main(String[] args) {
		// suponha que uma tela exiba para o usuário duas opções:
		// 1 - criar um objeto Imagem a partir do sufixo
		// 2 - criar um objeto Imagem a partir do cabeçalho do arquivo
		// em tempo de programação você ainda não sabe qual método o usuário vai escolher
		// para simular este evento que ocorre em tempo de execução, vamos sortear o método
		CriaImagem ci;
		if (Math.random() > 0.5)
			ci = new CriaImagemUsandoSufixo();
		else
			ci = new CriaImagemUsandoInfoCabecalho();
		
		Imagem img1 = ci.criaImagem("imagem1.jpg"); //criaImagem é o Factory Method
		Imagem img2 = ci.criaImagem("iamgem2.png");
		
		//código para processar as imagens carregadas do arquivo
	}
}
