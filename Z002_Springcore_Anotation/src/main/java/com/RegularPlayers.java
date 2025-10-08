package com;

import org.springframework.stereotype.Component;

@Component("reg")
public class RegularPlayers implements Players {

	@Override
	public void details() {
	
		System.out.println("this players will in team at the time of game");
		
	}

}
