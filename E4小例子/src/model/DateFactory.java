/*
 *DateFactory.java2019��2��15��
 *
 */
package model;
/**
 *
 *@author ��ѱ�
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
		//��ű���˾�Ĳ���
		companyEntiy.setChildren(departmentEntities);
		for (DepartmentEntity departmentEntity : departmentEntities) {
			//������˾����
			departmentEntity.setChildren(sql.listbydapartid(departmentEntity.getD_id()));
		}
	}
	
	
	sql.colse();
	return companyEntiys;	
	
}
}
