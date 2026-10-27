class IfSalary{
	
	
	
	public static void main(String [] args) {
		int employeeSalary = 50000;
		double tax = 0.0;
		double netSalary;
		
		
			System.out.println("Basic salary : " + employeeSalary);
			
			if(employeeSalary > 100000 ) {
				tax = employeeSalary * 0.03;
				
			}else if(employeeSalary < 100000) {
				tax = employeeSalary * 0.01;
				
			}
			
			netSalary = employeeSalary - tax;
			System.out.println(
					"Employee Basic Salary : " + employeeSalary + "\n" +
					"Tax : " + tax + "\n" +
					"NetSalary : " + netSalary
				);
		
	}
}