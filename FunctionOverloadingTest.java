
public class FunctionOverloadingTest 
{
	public static void main(String[] args) 
	{
		Bike b1 =new Bike();
		b1.bike();
		b1.bike("BMW",2000);
		b1.bike("BMW",2000,"Black");
		b1.bike("BMW",2000,"Black","Auto Senser");
		b1.bike("BMW",2000,"Black","Auto Senser",30);
	}
}

class Bike
{
	void bike() 
	{
		System.out.println("----------------There are one Bike is Available---------------- ");
	}
	void bike(String name, int prize) 
	{
		System.out.println("The bike name is  : "+name+" and prize "+prize);
	}
	void bike(String name, int prize, String color) 
	{
		System.out.println("The bike name is  : "+name+" prize "+prize+" and Available Color is "+color);
	}
	
	void bike(String name, int prize, String color , String feature) 
	{
		System.out.println("The bike name is  : "+name+"  prize "+prize+" Available Color "+color+ " and Feature is "+feature);
	}
	void bike(String name, int prize, String color , String feature,int average) 
	{
		System.out.println("The bike name is  : "+name+"  prize "+prize+" Available Color "+color+ "  Feature "+feature+" and Average "+average);
	}
}