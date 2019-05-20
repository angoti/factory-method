package imagens;

public class Cliente {
	public static void main(String[] args) {
		// suponha que uma tela exiba para o usu�rio duas op��es:
		// 1 - criar um objeto Imagem a partir do sufixo
		// 2 - criar um objeto Imagem a partir do cabe�alho do arquivo
		// em tempo de programa��o voc� ainda n�o sabe qual m�todo o usu�rio vai escolher
		// para simular este evento que ocorre em tempo de execu��o, vamos sortear o m�todo
		CriaImagem ci;
		if (Math.random() > 0.5)
			ci = new CriaImagemUsandoSufixo();
		else
			ci = new CriaImagemUsandoInfoCabecalho();
		
		Imagem img1 = ci.criaImagem("imagem1.jpg"); //criaImagem � o Factory Method
		Imagem img2 = ci.criaImagem("iamgem2.png");
		
		//c�digo para processar as imagens carregadas do arquivo
	}
}
