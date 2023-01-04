package orlanda;

public class MusicPlayer {

	private Music music;
	private int volume;
	
	public void turnOn() {
		System.out.println("orlanda player on");
	}
	
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
	public MusicPlayer(Music music) {
		this.music = music;
	}
	

	
	public void play() {
		System.out.println(this.music.getTrack());
	}
	
}
