package randomFunction;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;

public final class RandomFunction extends ContextFunction {
@Override
public Object compute(final IEclipseContext context) {
	// TODO �Զ����ɵķ������
	return Math.random(); 
}
}
