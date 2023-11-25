class Bike
{
String name;
String colour;
double cost;
Bike(String name,String colour,double cost)
{
this. name=name;
this. colour=colour;
this. cost=cost;
}
public static void main(String[] args)
{
Bike b=new Bike("BMW 1250GSA HP","White and Blue", 2500000.5552);
System.out.println(b.name);
System.out.println(b.colour);
System.out.println(b.cost);
}
}