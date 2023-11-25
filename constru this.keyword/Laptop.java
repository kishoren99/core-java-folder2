class Laptop
{
String brand;
String os;
double cost;
Laptop(String brand, String os, double cost)
{
this. brand=brand;
this. os=os;
this. cost=cost;
}
public static void main(String[] args)
{
Laptop l=new Laptop("iMAC","i7 24GB RAM", 2562460.54595);
System.out.println(l.brand);
System.out.println(l.os);
System.out.println(l.cost);
}
}