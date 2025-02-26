class Book{
String title;
String author;
public Book()
{
title="Atomic habits";
author="Riya";
System.out.println("The title is  "+title +" and the author name is "+author);
}
public Book(String mytitle , String  myauthor)
{
this.title=mytitle;
this.author=myauthor;
System.out.println("The title is "+title+" the author name is"+author);
}

public static void main(String[] args)
{
Book p1=new Book();
Book p2=new Book("Happy","Alice");


}
}



