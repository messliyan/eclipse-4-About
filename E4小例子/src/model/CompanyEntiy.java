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
public class CompanyEntiy implements ITreeEntry<DepartmentEntity>{
	private String c_name;
	private String c_id;
	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	private List<DepartmentEntity> dapartments = new ArrayList<DepartmentEntity>();

	public CompanyEntiy() {
		// TODO �Զ����ɵĹ��캯�����
	}

	


	public CompanyEntiy(String c_name, String c_id) {
		super();
		this.c_name = c_name;
		this.c_id = c_id;
	}

	@Override
	public String getName() {
		// TODO �Զ����ɵķ������
		return c_name;
	}



	@Override
	public void setChildren(List<DepartmentEntity> children) {
		// TODO �Զ����ɵķ������
		this.dapartments=children;
	}

	@Override
	public List<DepartmentEntity> getChildren() {
		// TODO �Զ����ɵķ������
		return dapartments;
	}

	@Override
	public void setName(String name) {
		// TODO �Զ����ɵķ������
		this.c_name=name;
	}

}
