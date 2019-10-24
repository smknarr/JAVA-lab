class Car
{
	String car_name;
	String car_model;
	String car_color;
	Car1(String name,String model,String color)
	{
		car_name=name;
		car_model=model;
		car_color=color;
	}
	void speed()
	{
		System.out.println("Speed : 20");
	}
	void printdetails()
	{	
		System.out.println("Car name :"+car_name);
		System.out.println("Car model :"+car_model);
		System.out.println("Car color :"+car_color);
	}
}
class FamilyCar extends Car
{
	int no_seats;
	int no_doors;
	double price;
	FamilyCar(String name, String model, String color,int seats,int doors,double p) {
		super(name, model, color);
		no_seats=seats;
		no_doors=doors;
		price=p;
	}
	void speed()
	{
		System.out.println("Speed : 50");
	}
	void printdetails()
	{	System.out.println("Family car details");
		super.printdetails();
		System.out.println("Car doors :"+no_doors);
		System.out.println("Car seats :"+no_seats);
		System.out.println("Car price :"+price);
	}
	public String toString()
	{
		return this.car_name;
	}
}
class SportsCar extends Car
{
	int no_seats;
	int no_doors;
	double price;
	SportsCar(String name, String model, String color,int seats,int doors,double p) {
		super(name, model, color);
		no_seats=seats;
		no_doors=doors;
		price=p;
	}
	void speed()
	{
		System.out.println("Speed : 50");
	}
	void printdetails()
	{	System.out.println("Sports car details");
		super.printdetails();
		System.out.println("Car doors :"+no_doors);
		System.out.println("Car seats :"+no_seats);
		System.out.println("Car price :"+price);
	}
	public String toString()
	{
		return this.car_name;
	}
}
public class c1 {

	public static void main(String[] args) 
	{
		FamilyCar f=new FamilyCar("dacia","old","pink",4,7,456456.435);
		SportsCar s=new SportsCar("merc","new","red",2,2,45644356.435);
		f.printdetails();
		s.printdetails();
		System.out.println(f);
		System.out.println(s);
	}

}