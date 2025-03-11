class Department
{
String name;
int id;
Department(String name,int id)
{
this.name=name;
this.id=id;
}
void display()
{
System.out.println("the empolyee name is "+  name +" and id is"+id);
}
}
class Employee{
Department d;

Employee(Department d)
{
this.d=d;
}
}
class Agregation
{
public static void main(String[] args)
{
Department d1=new Department("varsh",23);
d1.display();
Employee e=new Employee(d1);
}
}
