package exemplo.classes;

import java.util.HashMap;
import java.util.Map;

public class FactoryFlyweight {

	private Map<String, IAvatar> avatares = new HashMap<String, IAvatar>();
	
	public IAvatar getAvatar(String chave) {
		
		IAvatar avatar;
		
		if (avatares.containsKey(chave)) {
			avatar = avatares.get(chave);
		} else {
			switch(chave) {
				case "A": avatar = new AvatarA(); break;
				case "B": avatar = new AvatarB(); break;
				case "C": avatar = new AvatarC(); break;
				default: avatar = new AvatarD(); break;
			}
			avatares.put(chave, avatar);
		}
		
		return avatar;
	}
	
}
