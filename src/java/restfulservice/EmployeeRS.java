
package restfulservice;

import bean.Employee;
import dao.EmployeeDAO;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class EmployeeRS {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> geetAllEmployee(){
        List<Employee> list = new EmployeeDAO().getAllEmployee();
        return list;
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Employee saveEmployee(Employee e){
        Employee employee = new EmployeeDAO().saveEmployee(e);
        return employee;
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Employee updateEmployee(Employee e){
        Employee employee = new EmployeeDAO().updateEmployee(e);
        return employee;
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee deleteEmployee(@PathParam("id") int id){
        boolean status = new EmployeeDAO().deleteEmployee(id);
        if(status){
            Employee e = new Employee();
            return e;
        }
        return null;
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("id") int id){
        Employee e = new EmployeeDAO().getEmployee(id);
        return e;
    }
}
