class TV
{
String name;
String type;
double cost;
TV(String name,String type,double cost)
{
this. name=name;
this. type=type;
this. cost=cost;
}
public static void main(String[] args)
{
TV t=new TV("LG","OLED C2X 65inch",250000);
System.out.println(t.name);
System.out.println(t.type);
System.out.println(t.cost);
}
}