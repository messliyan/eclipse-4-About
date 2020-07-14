/*
 *DateFactory.java2019年2月15日
 *
 */
package model;
/**
 *
 *@author 李佳斌
 */


import java.util.ArrayList;
import java.util.List;

public class DateFactory {
public static List<CompanyEntiy>createTreeData(){
	
	List<CompanyEntiy> companyEntiys=new ArrayList<>();
	sql sql=new sql();
	companyEntiys=sql.list();
	for (CompanyEntiy companyEntiy : companyEntiys) {
		List<DepartmentEntity> departmentEntities=sql.listbyid(companyEntiy.getC_id());
		//存放本公司的部门
		companyEntiy.setChildren(departmentEntities);
		for (DepartmentEntity departmentEntity : departmentEntities) {
			//遍历公司部门
			departmentEntity.setChildren(sql.listbydapartid(departmentEntity.getD_id()));
		}
	}
	
	
	sql.colse();
	return companyEntiys;	
	
}
}
