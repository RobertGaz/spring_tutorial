package orlanda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Play {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
	
	
//		Music bean = context.getBean("musicBean", Music.class);
//		MusicPlayer player = new MusicPlayer(bean);
		
		MusicPlayer player = context.getBean("playerBean", MusicPlayer.class);
		player.play();
		
		System.out.println("volume: " + player.getVolume());
		
		context.close();
	}
}