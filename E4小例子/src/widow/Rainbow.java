package widow;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.packtpub.e4.application.service.IStringService;
import com.packtpub.e4.application.service.StringService;

public class Rainbow {
	@Inject
	EventBroker eventBroker;
	
	@Inject
	private IStringService stringService;
	@Inject
	private ESelectionService selectionService;
	private static final Object[] rainbow = { "Red", "Orange",
			 "Yellow", "Green", "Blue", "Indigo", "Violet" };
	@PostConstruct
	public void create(Composite parent) {
		ListViewer lvListViewer=new ListViewer(parent,SWT.NONE);
		lvListViewer.setContentProvider(new ArrayContentProvider());
		lvListViewer.setInput(rainbow);
//		lvListViewer.addSelectionChangedListener(event-> 
//			selectionService.setSelection(event.getSelection())
//		
//		);
		lvListViewer.addSelectionChangedListener(event->
		{ 
			 IStructuredSelection sel = (IStructuredSelection)
					 event.getSelection();
					 Object colour = sel.getFirstElement();
					 eventBroker.post("rainbow/colour",
					 stringService.process(colour.toString()));
//					 Map<String, Object> properties = new HashMap<String,Object>();
//					 properties.put("message","Hello World");
//					 properties.put(IEventBroker.DATA,"E4 Data Object");
//					 eventAdmin.postEvent(new Event("topic/name",properties));	 
					 
			
		});
	}
}
