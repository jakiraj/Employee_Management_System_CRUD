package bean;

public class Employee {
    private int emp_id;
    private String emp_name;
    private double salary;
    private int cell;

    public Employee() {
    }

    public Employee(int emp_id, String emp_name, double salary, int cell) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.salary = salary;
        this.cell = cell;
    }  
    
    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }
}
