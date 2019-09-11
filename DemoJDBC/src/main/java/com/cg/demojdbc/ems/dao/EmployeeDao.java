/**
 * 
 */
package com.cg.demojdbc.ems.dao;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.demojdbc.ems.exception.EmployeeException;
import com.cg.demojdbc.ems.exception.MyException;
import com.cg.demojdbc.ems.model.Employee;
import com.cg.demojdbc.ems.util.DBUtil;

/**
 * @author Admin
 *
 */
public class EmployeeDao implements IEmployeeDao {
	
	//prep -work 1- Connection
	private static Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;
	
	static {
		try {
			connection=DBUtil.getConnection();
		}catch(MyException exception) {
			System.out.println("Connection Not Obtained at EmployeeDao.");
		}
	}
	
	@Override
	public Employee addEmployee(Employee employee) throws EmployeeException {
		String sql="Insert into my_emp(emp_name, emp_sal) values(?,?)";
		try {
			//Obtain ps
			ps=connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			//Set the ps placeholder
			ps.setString(1, employee.getEmpName());
			ps.setBigDecimal(2, employee.getEmpSal());
			//execute query
			int noOfRec=ps.executeUpdate();	
			BigInteger generatedId=BigInteger.valueOf(0L);
			rs=ps.getGeneratedKeys();
			if(rs.next()) {
				generatedId=BigInteger.valueOf(rs.getLong(1));
				System.out.println("Auto Generated Id: "+generatedId);
			}
			employee.setEmpId(generatedId);
		} catch (SQLException e) {
			System.out.println("Error at addEmployee Dao method: "+e);
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				}catch(SQLException e) {
					System.out.println("Error at addEmployee Dao method: "+e);
				}
			}
		}
		return employee;
	}

	@Override
	public List<Employee> listAllEmployee() throws EmployeeException {
		String sql="Select * from my_emp;";
		List<Employee> empList=new ArrayList<Employee>();
		try {
			ps=connection.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Employee emp=new Employee();
				emp.setEmpId(BigInteger.valueOf(rs.getLong("emp_id")));
				emp.setEmpName(rs.getString("emp_Name"));
				emp.setEmpSal(rs.getBigDecimal("emp_Sal"));
				empList.add(emp);
			}
		} catch (SQLException e) {
			System.out.println("Error at addEmployee Dao method: "+e);
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				}catch(SQLException e) {
					System.out.println("Error at addEmployee Dao method: "+e);
				}
			}
		}
		return empList;
	}

}
