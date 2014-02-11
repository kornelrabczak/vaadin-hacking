package com.thecookiezen.vaadin.hacking.business;

import javax.ejb.Stateless;

/**
 * @author nikom
 */
@Stateless
public class Producer {

	public String produceOutput() {
		return "hello world :Q";
	}

}
