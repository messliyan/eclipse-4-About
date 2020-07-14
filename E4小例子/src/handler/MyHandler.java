package handler;

import javax.inject.Named;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MyHandler {
	 @Execute 
	 public static void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell s
		,@Named("e5.commandparameter.value")
	 String hello,ParameterizedCommand command,IEclipseContext context){   
		 context.set("myactivePartId", 
				  "com.example.e4.rcp.todo.part.todooverview");
		
		 MessageDialog.openInformation(s, "��������","������"+ hello);//需要有
	 }  
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������ 
		Display display = new Display();
				Shell shell = new Shell(display);
				shell.open();
//				MyHandler.execute(shell);
				while ( !shell.isDisposed() ) { 
			if ( ! display.readAndDispatch() ) display.sleep();
			
		}
	}

}
