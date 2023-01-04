package orlanda;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Play {

	public static void main(String[] args) {
	  
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
		player.play();
		
		System.out.println("volume: " + player.getVolume());
		
		context.close();
	}
}