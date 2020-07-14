package view;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.osgi.service.prefs.BackingStoreException;

public class ExampleView4 {
	private Label label;
	@Inject @Optional
	MWindow window;
	@Inject
	@Preference(nodePath="com.packtpub.e4.application", 
	  value="greeting")
	private String greeting;
	
	@Inject
	@Preference(nodePath="com.packtpub.e4.application")
	private IEclipsePreferences prefs;
	
//	@Inject 
//	public ExampleView(Composite parent) { 
//		 label = new Label(parent, SWT.NONE) ;
//		label.setText("Hello World!");
//		} 
	@Inject @Optional
	@Named("math.random")
	private Object random;
	@PostConstruct
	public void create(Composite parent) {
	  label = new Label(parent, SWT.NONE);
//	  label.setText(window.getLabel() + " " + random);
	  label.setText(greeting+" "+window.getLabel()+" "+random);
	}
	@Inject
	@Optional
	public void receiveEvent(
	  @UIEventTopic("rainbow/colour") String data) { 
	  label.setText(data);
	  prefs.put("greeting", "I like " + data);
	  try {
		prefs.sync();
	} catch (BackingStoreException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	}
	@Inject
	@Optional
	void setText(@Preference(nodePath="com.packtpub.e4.application",
	  value="greeting") String text) {
	  if (text != null && label != null && !label.isDisposed()) {
	  // NB Run in UI thread!
	  label.setText(text);
	  }
	}
	}


