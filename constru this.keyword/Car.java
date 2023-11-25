class Car
{
String car_name;
String fuel_type;
double car_cost;
Car(String car_name, String fuel_type, double car_cost)
{
this. car_name=car_name;
this. fuel_type=fuel_type;
this. car_cost=car_cost;
}
public static void main(String[] args)
{
Car c=new Car("BMW", "Diesel Engine", 8543232.4343);
System.out.println(c.car_name);
System.out.println(c.car_cost);
System.out.println(c.fuel_type);
}
}