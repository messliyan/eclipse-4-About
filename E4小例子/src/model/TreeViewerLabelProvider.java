/*
 *TreeViewerLabelProvider.java2019��2��15��
 *
 */
package model;

import java.security.KeyStore.Entry;

import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;


/**
 *
 *@author ��ѱ�
 */
public class TreeViewerLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void dispose() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public Image getImage(Object element) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public String getText(Object element) {
		ITreeEntry entry =(ITreeEntry) element;
		return entry.getName();
		// TODO �Զ����ɵķ������
		
	}


	
}
