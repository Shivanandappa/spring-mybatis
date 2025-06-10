package in.jayanth.springmybatis.dao;

import org.apache.ibatis.session.SqlSession;

import in.jayanth.springmybatis.entity.Employee;
import in.jayanth.springmybatis.util.MyBatisUtil;

@Repository
public class EmployeeMapper {
	
	public list<Employee> getAllEmployees(){
		
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		list<Employee> employeeList = session.selectList("getAllEmployees");
		session.commit();
		session.close();
		return employeeList;
				
	}
	
	public void saveEmployee(Employee employee) {
		
		SqlSession session = MyBatisUtil.getSqlSessionFactory();
		session.insert("insertEmployee",employee);
		session.commit();
		session.close();
		
	}
}
