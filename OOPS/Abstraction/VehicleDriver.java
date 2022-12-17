/* it is a design process of hiding the emplementation
and by showing only functionalities (method declaration) */
abstract class Vehicle 
{
  abstract public int getWheels();
}

class Bike extends Vehicle
{
  public int getWheels()
  {
  	return 2;
  }
}

class Bus extends Vehicle
{
	public int getWheels()
	{
		return 6;
	}
}

class VehicleDriver
{
	public static void main(String[] args) 
	{
		// Vehicle v1=new Vehicle(); // CTE
		Vehicle v2=new Bike();
		System.out.println(v2.getWheels()); //2
		Bus b1=new Bus();
		System.out.println(b1.getWheels()); //6
	}
}