/*
 *TreeViewerLabelProvider.java2019年2月15日
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
 *@author 李佳斌
 */
public class TreeViewerLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void dispose() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public Image getImage(Object element) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String getText(Object element) {
		ITreeEntry entry =(ITreeEntry) element;
		return entry.getName();
		// TODO 自动生成的方法存根
		
	}


	
}
