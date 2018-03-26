package exemplo;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import exemplo.classes.AvatarA;
import exemplo.classes.AvatarB;
import exemplo.classes.AvatarC;
import exemplo.classes.AvatarD;
import exemplo.classes.FactoryFlyweight;
import exemplo.classes.IAvatar;

public class Main {

	private static FactoryFlyweight fabrica = new FactoryFlyweight();
	private static int recriado = 0;
	
	public static void main(String[] args) {
		
		TimerTask timerTask = new TimerTask() { 
		    public void run() { 
		    	long tempoI = System.currentTimeMillis();
		        recriarMapa();
		        long tempoF = System.currentTimeMillis();
		        double total = (tempoF - tempoI) / 1000;
		        System.out.println("Demorou: " + total + "segundos");
		        System.out.println("Mapa criado pela " + ++recriado + " vez");
		    } 
		}; 

		Timer timer = new Timer(); 
		int segundos = 15;
		timer.scheduleAtFixedRate(timerTask, 0, segundos * 1000);

	}
	
	public static void recriarMapa() {
		//Possíveis avatar
		String [] avatares = {"A", "B", "C", "D"};
		Random random = new Random();
		
		for (int x = 0; x <= 99; x++) {
			for (int y = 0; y <= 99; y++) {
				
				//Seleciona um aleatória
				int selecionadoPosicao = random.nextInt(avatares.length);
				String selecionado = avatares[selecionadoPosicao];
				
				IAvatar avatar = fabrica.getAvatar(selecionado);
				//Exibe avatar na posição X e Y
				avatar.exibeImagem(x, y);
			}
		}	
	}

}
