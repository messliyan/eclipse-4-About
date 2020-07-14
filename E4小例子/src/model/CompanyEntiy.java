/*
 *People.java2019年2月15日
 *
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 李佳斌
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
		// TODO 自动生成的构造函数存根
	}

	


	public CompanyEntiy(String c_name, String c_id) {
		super();
		this.c_name = c_name;
		this.c_id = c_id;
	}

	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		return c_name;
	}



	@Override
	public void setChildren(List<DepartmentEntity> children) {
		// TODO 自动生成的方法存根
		this.dapartments=children;
	}

	@Override
	public List<DepartmentEntity> getChildren() {
		// TODO 自动生成的方法存根
		return dapartments;
	}

	@Override
	public void setName(String name) {
		// TODO 自动生成的方法存根
		this.c_name=name;
	}

}
