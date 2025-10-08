package com;

import org.springframework.stereotype.Component;

@Component("ext")
public class ExtraPlayers implements Players {

	@Override
	public void details() {
		System.out.println("Extra players will play if regular player are not avalble to play");
	}

}
