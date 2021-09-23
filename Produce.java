
public abstract class Produce 
{
	protected int price;
	
	private static int counter = 1_000;
	private static final int THOUSAND = 1_000;
	
	public Produce(int value)
	{
		this.price = value;
		++counter;
	}
	
	public Produce()
	{
		this(50);
	}
	
	public void eat()
	{
		System.out.println("chomp");
	}
	
	public abstract int calculatePrice();
	
	public String toString()
	{
		System.out.println("Price: ");
	}
	
}
