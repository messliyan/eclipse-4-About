package view;



import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class ExampleView {
	private Label label;
	@Inject 
	public ExampleView(Composite parent) { 
		 label = new Label(parent, SWT.NONE) ;
		label.setText("Hello World!");
		} 
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());
		new ExampleView(shell);
		shell.open();
		while ( !shell.isDisposed() ) 
		{ if ( ! display.readAndDispatch() ) 
			display.sleep(); } }



	}


