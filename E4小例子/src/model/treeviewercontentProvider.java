/*
 *treeviewercontentProvider.java2019年2月15日
 *
 */
package model;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;


/**
 *
 * @author 李佳斌
 */
public  class treeviewercontentProvider implements ITreeContentProvider{

	@Override
	public Object[] getElements(Object inputElement) {
		// TODO 自动生成的方法存根
		if (inputElement instanceof List) {
			List input=(List) inputElement;
			return input.toArray();
		} 
		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		// TODO 自动生成的方法存根
		ITreeEntry entry =(ITreeEntry) parentElement;
		List list=entry.getChildren();
		if (list==null)

		{		return new Object[0];
	}
		return list.toArray();
	}

	@Override
	public Object getParent(Object element) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		// TODO 自动生成的方法存根
		ITreeEntry entry =(ITreeEntry) element;
		List list=entry.getChildren();
		return!(list==null||list.isEmpty());
	}
	
}


