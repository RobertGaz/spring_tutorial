package orlanda;

import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music {
	
	@Override
	public String getTrack() {
		return "lalala";
	}

}
