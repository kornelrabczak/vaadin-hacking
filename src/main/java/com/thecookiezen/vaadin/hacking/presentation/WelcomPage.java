package com.thecookiezen.vaadin.hacking.presentation;

import com.thecookiezen.vaadin.hacking.business.Producer;
import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import javax.inject.Inject;

/**
 * @author nikom
 */
@CDIUI
public class WelcomPage extends UI {

	@Inject
	private Producer serviceProducer;

	@Override
	protected void init(VaadinRequest request) {
		setSizeFull();
		String message = serviceProducer.produceOutput();
		Label label = new Label(message);
		setContent(new HorizontalLayout(label));
	}

}
