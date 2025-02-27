class Employee
{
private int id;
private int salary;
public void setSalary(int mysalary)
{
this.salary=mysalary;

}

public int getSalary()
{

if(salary>=10000)
{
 
 System.out.print("The salary is "+salary);
}
 return salary;

}
public static void main(String[] args)
{
Employee e=new Employee();

e.setSalary(20000);
e.getSalary();
}
}