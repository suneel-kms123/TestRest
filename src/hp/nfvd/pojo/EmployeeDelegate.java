package hp.nfvd.pojo;

public class EmployeeDelegate {

	private static EmployeeDelegate _instance=null;
	
	protected EmployeeDelegate(){
		
	}
	
	public static EmployeeDelegate getInstance(){
		if(_instance==null){
			_instance = new EmployeeDelegate();
		}		
		return _instance;
	}

	
	public void createEmployee(Employee e){
		
	}
	
	
}
