package dao;

import bean.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBConnect;

public class EmployeeDAO {

    public List<Employee> getAllEmployee() {

        List<Employee> list = new ArrayList<>();
        try {
            ResultSet rs = DBConnect.getConnection().createStatement().executeQuery("select * from employee");
            while (rs.next()) {
                list.add(new Employee(rs.getInt("emp_id"), rs.getString("emp_name"), rs.getDouble("salary"), rs.getInt("cell")));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Employee saveEmployee(Employee e) {

        String sql = "insert into employee (emp_name, salary, cell) values ('" + e.getEmp_name()+ "','" + e.getSalary()+ "','" + e.getCell()+ "')";
        try {
            int value = DBConnect.getConnection().createStatement().executeUpdate(sql);
            if (value > 0) {
                return e;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public Employee updateEmployee(Employee e) {

        String sql = "update employee set emp_name='" + e.getEmp_name()+ "', salary='" + e.getSalary()+ "', cell='" + e.getCell()+ "' where emp_id='" + e.getEmp_id()+ "'";
        try {
            int value = DBConnect.getConnection().createStatement().executeUpdate(sql);
            if (value > 0) {
                return e;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean deleteEmployee(int id) {

        String sql = "delete from employee where emp_id='" + id + "'";
        try {
            int value = DBConnect.getConnection().createStatement().executeUpdate(sql);
            if (value > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Employee getEmployee(int id) {

        Employee e = new Employee();
        try {
            ResultSet rs = DBConnect.getConnection().createStatement().executeQuery("select * from employee where emp_id='" + id + "'");
            while (rs.next()) {
                e.setEmp_id(rs.getInt("emp_id"));
                e.setEmp_name(rs.getString("emp_name"));
                e.setSalary(rs.getDouble("salary"));
                e.setCell(rs.getInt("cell"));
            }
            return e;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
