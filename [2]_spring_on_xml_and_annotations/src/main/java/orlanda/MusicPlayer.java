package orlanda;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class MusicPlayer {


	private Music music;
	
	@Value("${musicPlayer.volume}")
	private int volume;
	
	@PostConstruct
	public void turnOn() {
		System.out.println("orlanda player on");
	}
	
	@PreDestroy
	public void turnOff() {
		System.out.println("orlanda player off");
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	// IoC
	public void setMusic(Music music) {
		this.music = music;
	}
	
	// IoC
	@Autowired
	public MusicPlayer(@Qualifier("classicalMusic") Music music) {
		this.music = music;
	}
	

	
	public void play() {
		System.out.println(this.music.getTrack());
	}
	
}
