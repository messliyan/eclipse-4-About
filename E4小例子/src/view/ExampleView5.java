package view;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ExampleView5 {
	
	private Label label;
	@Inject @Optional
	MWindow window;
//	@Inject 
//	public ExampleView(Composite parent) { 
//		 label = new Label(parent, SWT.NONE) ;
//		label.setText("Hello World!");
//		} 
	@Inject 
	@Named("math.random")
	private double random;
	@PostConstruct
	public void create(Composite parent) {
	  label = new Label(parent, SWT.NONE);
	  label.setText(window.getLabel() + "" + random);
	  
	}

	}


