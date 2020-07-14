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
		// TODO 自动生成的构造函数存根
	}

	
	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		return d_name;
	}

	@Override
	public void setName(String name) {
		// TODO 自动生成的方法存根
		this.d_name=name;
	}

	@Override
	public void setChildren(List<People> children) {
		// TODO 自动生成的方法存根
		this.peoples=children;
	}

	@Override
	public List<People> getChildren() {
		// TODO 自动生成的方法存根
		return peoples;
	}

	

}