interface Playable
{
void play();
}
class Guitar implements Playable
{
@Override
public void play()
{
System.out.println("GUITAR");
}
} 
class Piano implements Playable

{
@Override
public void play()
{
System.out.println("PIANO");
}
} 
public class main{
public static void main(String[] args)
{
Guitar g=new Guitar();
Piano p=new  Piano();
g.play();
p.play();
}
}
