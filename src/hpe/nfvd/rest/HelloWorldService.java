package hpe.nfvd.rest;

import hp.nfvd.pojo.Employee;
import hp.nfvd.pojo.EmployeeDelegate;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
@Path("/hello")
public class HelloWorldService {
		@GET
		@Produces("text/html") 
		@Path("/{param}")
		public Response getMsg(@PathParam("param") String msg) {
	 			String output = "Jersey say : " + msg;
	 		return Response.status(200).entity(output).build();
	}	
		
		
		@POST
		@Path("/users")
		@Produces("application/json")
		public void saveDataProvided(Employee e){
			if(e.getName()==null || e.getId().equals(null)){
				e.setName("Default");
				e.setId(0);
			}else{
				EmployeeDelegate.getInstance().createEmployee(e);
			}
		}
		
}
