package watchFace.chronoFace.service;

import org.springframework.stereotype.Component;

@Component
public class ChronoService {

	public int refillCheck(int scriptNumber) {
		// TODO Auto-generated method stub
		return --scriptNumber;
	}

}
