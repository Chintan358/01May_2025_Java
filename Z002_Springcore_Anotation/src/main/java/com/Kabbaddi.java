package com;

import org.springframework.stereotype.Component;

@Component
public class Kabbaddi implements Sports {

	@Override
	public void players() {
	
		System.out.println("There are 7 players in kabbaddi");
	}

}
