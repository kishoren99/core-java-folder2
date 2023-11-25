class Home
{
String name;
String colour;
String cost;
Home(String name, String colour, String cost)
{
this. name=name;
this. colour=colour;
this. cost=cost;
}
public static void main(String[] agrs)
{
Home h=new Home("Samruddhi Nivasa", "White And Brown", "2.5 crores");
System.out.println(h.name);
System.out.println(h.colour);
System.out.println(h.cost);
}
}