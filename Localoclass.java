class Outerclass
{
void display()
{
class Localclass
{
void display()
{
System.out.println("local class");
}
}
Localclass l=new Localclass();
l.display();

}
public static void main(String[] args)
{
Outerclass o=new Outerclass();
o.display();
}
}
