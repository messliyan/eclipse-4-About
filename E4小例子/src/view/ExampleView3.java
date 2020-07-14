package view;



import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.osgi.service.log.LogService;

public class ExampleView3 {
	@Inject @Optional
	MWindow window;
	private Label label;
	
	
	@PostConstruct 
	public void create( Composite parent) {
		 label = new Label(parent, SWT.NONE) ;
		label.setText(window.getLabel());
		
	}
	@Inject @Optional
	 public void setselect(@Named(IServiceConstants.ACTIVE_SELECTION) Object select) {
		// TODO 自动生成的方法存根
		if (select!=null) {
			label.setText(select.toString());
		} 
		System.err.println("3");
	}
	@Inject
	@Optional
	public void receiveEvent(
//	  @EventTopic("rainbow/colour") String data
			@UIEventTopic("rainbow/colour") String data
	  ) {
	  label.setText(data);
	}

@Inject 
 public void setselect() {
	// TODO 自动生成的方法存根
	System.err.println("2");
}
@Inject @Optional
public void setselect2(@Named(IServiceConstants.ACTIVE_SELECTION) Object select) {
	// TODO 自动生成的方法存根
	
	System.err.println("4");
}
	@Focus
	public void focus() {
		
	 label.setFocus();
	}


}


