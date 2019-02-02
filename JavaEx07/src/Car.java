
public class Car {
	public String name;
	public String color;
	public int gear;
	public int velocity;
	
	public Car(String name, String color, int velocity) {
		System.out.println("-- Car class constructor");
		this.name = name;
		this.color = color;
		this.velocity = velocity;
		
		if(velocity == 0) gear =0;
		else gear = 1;
	}
	
	public int accel(int velocity)
	{
		return velocity + 10;
	}
}
