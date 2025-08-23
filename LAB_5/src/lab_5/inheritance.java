package lab_5;

class Transport {
	public void ticketPrice()
	{
		System.out.println("ticket varies");
	}
}
	class train extends Transport
	{
		public void ticketPrice()
		{
			System.out.println("train ticket: 150");
		}
	}
	class bus extends Transport
	{
		public void ticketPrice()
		{
			System.out.println("bus ticket: 50");
		}
	}
	public class inheritance
	{
		public static void main(String[] args)
		{
			Transport t1=new bus();
			Transport t2=new train();
			t1.ticketPrice();
			t2.ticketPrice();
		}
	}
