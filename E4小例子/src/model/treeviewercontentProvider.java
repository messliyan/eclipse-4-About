/*
 *treeviewercontentProvider.java2019��2��15��
 *
 */
package model;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;


/**
 *
 * @author ��ѱ�
 */
public  class treeviewercontentProvider implements ITreeContentProvider{

	@Override
	public Object[] getElements(Object inputElement) {
		// TODO �Զ����ɵķ������
		if (inputElement instanceof List) {
			List input=(List) inputElement;
			return input.toArray();
		} 
		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		// TODO �Զ����ɵķ������
		ITreeEntry entry =(ITreeEntry) parentElement;
		List list=entry.getChildren();
		if (list==null)

		{		return new Object[0];
	}
		return list.toArray();
	}

	@Override
	public Object getParent(Object element) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		// TODO �Զ����ɵķ������
		ITreeEntry entry =(ITreeEntry) element;
		List list=entry.getChildren();
		return!(list==null||list.isEmpty());
	}
	
}


