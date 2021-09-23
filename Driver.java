
public class Driver {

	public static void main(String[] args) 
	{
		//Produce p = new Produce();
		Produce f = new Fruit();
		f.eat();
		Bananas l = new Bananas();
		l.makeSomebodyFall();
		
		Produce b = new Bananas();
		//b.makeSomebodyFall();
		
		Bananas b1 = (Bananas) new Fruit();
		b1.eat();
	}

}
