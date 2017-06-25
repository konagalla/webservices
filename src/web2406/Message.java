package web2406;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/home")
public class Message {

	@Path("/msg")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Employee showMsg(Address adr){
		Employee emp=new Employee();
		emp.setEmpId(25);
		emp.setEmpName("navi's");
		emp.setEmpSal(25.212);
		return emp;
	}

}
