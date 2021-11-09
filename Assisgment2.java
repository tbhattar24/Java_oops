class Employee{
   void sal(){
       }
       }
class Manager extends Employee
      {
	int salary;
	int incentive;
	Manager(int salary,int incentive)
	{
		this.salary=salary;
		this.incentive=incentive;
		
	}
	public void sal()
	{
		System.out.println("the salary of manager is: "+(salary+incentive));
	}
       }
class Labour extends Employee
      {
	int lab_salary;
	int overtime;
	Labour(int lab_salary,int overtime)
	{
		this.lab_salary=lab_salary;
		this.overtime=overtime;
		
	}
	public void sal()
	{
		System.out.println("the salary of labour is: "+(lab_salary+overtime));
	}
      }
public class  MainEmp
      {
	public static void main(String[] args)
	{
		Manager mngr = new Manager(15000,5000);
		Labour lab = new Labour(1000,500);
		mngr.sal();
		lab.sal();
	}
      }
