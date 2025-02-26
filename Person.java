public class Person
{
public String name="alice";
public int age=30;

public void introduce()
{
System.out.println("my name is "+name+" and my age is "+age);
}
public static void main(String[] args)
{
Person p=new Person();
p.introduce();
}
}
