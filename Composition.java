class Battery
{
int capacity;
void display()
{
System.out.println("Capacity");
}
}
class Mobile
{
Mobile() 
{
Battery b=new Battery();
b.display();
}
}
class Composition
{
public static void main(String[] args)
{
Mobile m=new Mobile();
}
}