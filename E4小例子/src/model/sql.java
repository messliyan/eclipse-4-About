package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class sql {

	private Connection conn;
	private ResultSet rs = null;

	public sql() {

		try {
			// 注册驱动

			Class.forName("com.mysql.jdbc.Driver");

			// 得到链接
			conn = DriverManager.getConnection(
					"jdbc:mysql://172.16.44.35:3306/company", "root", "123456");
			if (conn != null) {
			//	System.out.println("连接成功");
			} else {
				System.out.println("连接失败");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Connection getConn() { // 获取连接方法
		return conn;
	}

	public void insert(String sql) {// 增删改
		try {
			Statement stm = conn.createStatement();
			stm.executeUpdate(sql);
			//System.out.println("操作成功");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public   List<CompanyEntiy> list() { // 查询 返回公司
		List<CompanyEntiy> CompanyEntiys = new ArrayList<>();
		try {
			Statement stm = conn
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			rs = stm.executeQuery("select * from company "
					+ ";");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
			try {
				while (rs.next()) {
					CompanyEntiy CompanyEntiy=new CompanyEntiy(//查询所有公司
						rs.getString("c_name"),rs.getString("c_id"));
					// System.out.print(rs.getString("U_age"));
					CompanyEntiys.add(CompanyEntiy);
				}
			} catch (SQLException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			

		return CompanyEntiys;
	}
	public   List<People> listbydapartid(String id) { 
		
		 List<People> peoples = new ArrayList<>();
		try {
			Statement stm = conn
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			rs = stm.executeQuery("select * from people where d_id="+id
					+ ";");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
			try {
				while (rs.next()) {
					People people=new People(//查询所有公司
						rs.getString("p_name"));
					// System.out.print(rs.getString("U_age"));
					peoples.add(people);
				}
			} catch (SQLException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		
			 
		return peoples;
		
	}
	public   List<DepartmentEntity> listbyid(String id) { 
		
		 List<DepartmentEntity> departmentEntities = new ArrayList<>();
		try {
			Statement stm = conn
					.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
			rs = stm.executeQuery("select * from department where c_id="+id
					+ ";");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
			try {
				while (rs.next()) {
					DepartmentEntity departmentEntity=new DepartmentEntity(//查询所有公司
						rs.getString("d_name"),rs.getString("d_id"));
					// System.out.print(rs.getString("U_age"));
					departmentEntities.add(departmentEntity);
				}
			} catch (SQLException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		
			 
		return departmentEntities;
		
	}
	public void colse(){
		try {
			rs.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

