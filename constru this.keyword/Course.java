class Course
{
String name;
String univ;
double cost;
Course(String name,String univ,double cost)
{
this. name=name;
this. univ=univ;
this. cost=cost;
}
public static void main(String[] args)
{
Course c=new Course("BE MECHANICAL ENGG","VTU", 40000);
System.out.println(c.name);
System.out.println(c.univ);
System.out.println(c.cost);
}
}