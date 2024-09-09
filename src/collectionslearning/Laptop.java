package collectionslearning;

public class Laptop {
	int price;
	int gb;
	boolean touch;
	
	public String toString()
	{
		return " "+ this.price +":"+ this.gb +":"+ this.touch;
	}
	public Laptop(int price, int gb, boolean touch)
	{
	this.price = price;
	this.gb = gb;
	this.touch = touch;
	}

}
