package view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.osgi.service.log.LogService;

import model.CompanyEntiy;
import model.DateFactory;
import model.TreeViewerLabelProvider;
import model.treeviewercontentProvider;

public class ExampleView2 {
	@Inject
	@Optional
	LogService log;
	private Label label;
	// use field injection for the service
	@Inject
	ESelectionService selectionService;

	@PostConstruct
	public void create(Composite parent, EMenuService menu) {

		TreeViewer treeViewer = new TreeViewer(parent, SWT.BORDER);
		treeViewer.setContentProvider(new treeviewercontentProvider());
		treeViewer.setLabelProvider(new TreeViewerLabelProvider());
		List<CompanyEntiy> input = DateFactory.createTreeData();
		treeViewer.setInput(input);
//		menu.registerContextMenu(treeViewer.getControl(), "com.packtpub.e4.application.popupmenu.table");
		menu.registerContextMenu(treeViewer.getControl(), "com.packtpub.e4.application.popupmenu.popuptable");
		// viewer is a JFace Viewer
		log.log(LogService.LOG_ERROR, "log.log(LogService.LOG_ERROR, selection.getClass() + \"\");");
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				// TODO 自动生成的方法存根
				IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
				selectionService.setSelection(selection.getFirstElement());
				log.log(LogService.LOG_ERROR, selection.getClass() + "");

			}

		});
		label = new Label(parent, SWT.NONE);
		label.setText("Hello World!");
		log.log(LogService.LOG_ERROR, "Hellow");
	}

	@Focus
	public void focus() {
		log.log(LogService.LOG_ERROR, "focuse");
		label.setFocus();
		log.log(LogService.LOG_ERROR, "log.log(LogService.LOG_ERROR, selection.getClass() + \"\");");
	}

}
