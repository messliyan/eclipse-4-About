/*
 *People.java2019年2月15日
 *
 */
package model;

import java.util.List;

/**
 *
 * @author 李佳斌
 */
public class People implements ITreeEntry{

	private String c_name;

	public People() {
		// TODO 自动生成的构造函数存根
	}

	public People(String c_name) {
		super();

		this.c_name = c_name;

	}


	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		return c_name;
	}

	@Override
	public void setName(String name) {
		// TODO 自动生成的方法存根
		this.c_name = name;
	}

	@Override
	public void setChildren(List children) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public List getChildren() {
		// TODO 自动生成的方法存根
		return null;
	}

}
