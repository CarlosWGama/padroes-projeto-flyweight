package exemplo.classes;

public class AvatarD  implements IAvatar {

	public AvatarD() {
		try {
			Thread.sleep(10); //Demora 1/100 de segundo para carregar
		} catch (Exception e) {
		   e.printStackTrace();
		}
	}
	
	public void exibeImagem(int x, int y) {
		System.out.println("Exibe avatar D na posição " + x + "," + y);
	}
}

