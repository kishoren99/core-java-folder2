class School
{
String name;
char grade;
int strength;
School(String name,char grade,int strength)
{
this. name=name;
this. grade=grade;
this. strength=strength;
}
public static void main(String[] args)
{
School s=new School("JAIN VIDYALAYA", 'B',2500);
System.out.println(s.name);
System.out.println(s.grade);
System.out.println(s.strength);
}
}