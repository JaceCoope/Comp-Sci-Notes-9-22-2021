
public class Vegetable extends Produce
{
	int numberOf;

	public Vegetable(int price, int numberOf) 
	{
		super(price);
		this.numberOf = numberOf;
	}

	@Override
	public int calculatePrice() 
	{
		return numberOf * price;
	}
}
