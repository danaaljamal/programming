package employees;

public class Staff {
	String name;
	int experienceYear;
	double baseSalary;
	String emp_id;
	String Department;
	Staff(){
		
	}
	Staff(String name,int experienceYear,double baseSalary,String emp_id,String Department){
		this.baseSalary=baseSalary;
		this.Department=Department;
		this.emp_id=emp_id;
		this.experienceYear=experienceYear;
		this.name=name;
	}
}
