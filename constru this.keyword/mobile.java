class mobile
{
String mobile_name;
String mobile_colour;
double mobile_cost;
mobile(String mobile_name, String mobile_colour, double mobile_cost)
{
this.mobile_name=mobile_name;
this.mobile_colour=mobile_colour;
this.mobile_cost=mobile_cost;
}
public static void main(String[] args)
{
mobile m=new mobile("iphone","white", 50000.55);
System.out.println(m.mobile_name);
System.out.println(m.mobile_colour);
System.out.println(m.mobile_cost);
} 
}