class Employee
{
String ename;
char grade;
double salary;
Employee(String ename,char grade,double salary)
{
this. ename=ename;
this. grade=grade;
this. salary=salary;
}
public static void main(String[] args)
{
Employee e=new Employee("Kishore",'A',500054.855896519);
System.out.println(e.ename);
System.out.println(e.grade);
System.out.println(e.salary);
}
}