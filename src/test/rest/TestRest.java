package test.rest;

import hp.nfvd.pojo.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@Path("/testRest")
public class TestRest {

	@GET
	@Path("/Ok")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeDetails(){
		Employee e = new Employee();
		e.setAddress("sasasasa");
		e.setId(111);
		e.setName("Venkat");
		return e;
	}
	
	
}
