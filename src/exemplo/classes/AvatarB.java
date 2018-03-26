package exemplo.classes;

public class AvatarB  implements IAvatar {

	public AvatarB() {
		try {
			Thread.sleep(10); //Demora 1/10 de segundo para carregar
		} catch (Exception e) {
		   e.printStackTrace();
		}
	}
	
	public void exibeImagem(int x, int y) {
		System.out.println("Exibe avatar B na posição " + x + "," + y);
	}
}

