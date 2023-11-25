class Trap
{
double area(int a, int b, int h)
{
double x=0.5*a+b*h;
return x;
}}
class Trap1
{
public static void main(String[] args)
{
Trap m=new Trap();
double z=m.area(8,4,5);
System.out.println(z);
}}