class Cloth
{
String colour;
String size;
int cost;
Cloth(String colour, String size, int cost)
{
this. colour=colour;
this. size=size;
this. cost=cost;
}
public static void main(String[] args)
{
Cloth c=new Cloth("Black and White","xl",2000);
System.out.println(c.colour);
System.out.println(c.size);
System.out.println(c.cost);
}}