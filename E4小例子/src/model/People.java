/*
 *People.java2019��2��15��
 *
 */
package model;

import java.util.List;

/**
 *
 * @author ��ѱ�
 */
public class People implements ITreeEntry{

	private String c_name;

	public People() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public People(String c_name) {
		super();

		this.c_name = c_name;

	}


	@Override
	public String getName() {
		// TODO �Զ����ɵķ������
		return c_name;
	}

	@Override
	public void setName(String name) {
		// TODO �Զ����ɵķ������
		this.c_name = name;
	}

	@Override
	public void setChildren(List children) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public List getChildren() {
		// TODO �Զ����ɵķ������
		return null;
	}

}
