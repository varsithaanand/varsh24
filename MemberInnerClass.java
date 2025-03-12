class Computer
{
private String brand="Windows";
class Processor
{
void display()
{
System.out.println("processor");
}
}
public static void main(String[] args)
{
Computer c=new Computer();
Computer.Processor p=c.new Processor();
}
