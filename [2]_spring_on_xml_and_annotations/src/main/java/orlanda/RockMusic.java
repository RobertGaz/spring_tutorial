package orlanda;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
	
	@Override
	public String getTrack() {
		return "dzhhh dzhhh";
	}
	
}
