/*
 *People.java2019��2��15��
 *
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ��ѱ�
 */
public class DepartmentEntity implements ITreeEntry<People>{
	private String d_name;
	private String d_id;
	private List<People> peoples = new ArrayList<People>();

	public DepartmentEntity(String d_name, String d_id) {
		super();
		this.d_name = d_name;
		this.d_id = d_id;
	}

	public String getD_id() {
		return d_id;
	}

	public void setD_id(String d_id) {
		this.d_id = d_id;
	}

	public DepartmentEntity() {
		// TODO �Զ����ɵĹ��캯�����
	}

	
	@Override
	public String getName() {
		// TODO �Զ����ɵķ������
		return d_name;
	}

	@Override
	public void setName(String name) {
		// TODO �Զ����ɵķ������
		this.d_name=name;
	}

	@Override
	public void setChildren(List<People> children) {
		// TODO �Զ����ɵķ������
		this.peoples=children;
	}

	@Override
	public List<People> getChildren() {
		// TODO �Զ����ɵķ������
		return peoples;
	}

	

}