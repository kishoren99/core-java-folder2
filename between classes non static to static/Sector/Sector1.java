class Sector
{
double area(int r, double t)
{
double  z=0.5*r*r*t;
return z;
}}
class Sector1
{
public static void main(String[] args)
{
Sector m=new Sector();
double z=m.area(45,95.343);
System.out.println(z);
}}