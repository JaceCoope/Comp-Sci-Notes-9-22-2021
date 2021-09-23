import java.util.Arrays;

public class Fruit extends Produce 
{
	
	int[] weights = new int[10];
	
	public Fruit (int value, int[] values)
	{
		super(value);
		this.weights = values;
	}
	
	public Fruit()
	{
		assignValues();
		super.price = 6;
	}

	private void assignValues() 
	{
		this.weights[0] = 1;
		
	}

	@Override
	public String toString() 
	{
		String str = super.toString()
		+ " B [values=" + Arrays.toString(weights) + "]";
		
		return str;
	}

	@Override
	public int calculatePrice() 
	{
		// implement
		int totalWeight = 0;
		for (int i = 0; i < weights.length; i++)
		{
			totalWeight += weights[i];
		}
		return totalWeight * super.price;
	}
	
	
	
}
