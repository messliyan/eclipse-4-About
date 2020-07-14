package view;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ExampleView7 {
	@Inject
	private UISynchronize ui;
	private Button button;
//	@Inject @Optional
//	MWindow window;
//	@Inject 
//	public ExampleView(Composite parent) { 
//		 label = new Label(parent, SWT.NONE) ;
//		label.setText("Hello World!");
//		} 
//	@Inject 
//	@Named("math.random")
//	private Object random;
	@PostConstruct
	public void create(Composite parent) {
		 button = new Button(parent, SWT.PUSH);
		 button.setText("Do not push");
		 button.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO 自动生成的方法存根
				button.setEnabled(false);
				new Job("Button Pusher") {
					
					@Override
					protected IStatus run(IProgressMonitor monitor) {
						// TODO 自动生成的方法存根
						ui.asyncExec(new Runnable() {
							 @Override
							 public void run() {
							 button.setEnabled(true);
							 }
							 });
						 return Status.OK_STATUS;
					}
				}.schedule(1000);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO 自动生成的方法存根
				
			}
		});
	  
	}

	}


