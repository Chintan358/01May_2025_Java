package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cri")
public class Cricket implements Sports {

	@Autowired
	@Qualifier("ext")
	Players players;
	
	@Autowired
	@Qualifier("reg")
	Players players1;
	
	@Override
	public void players() {
		
		System.out.println("There are 11 Players in cricket");
		players.details();
		players1.details();
	}

}
