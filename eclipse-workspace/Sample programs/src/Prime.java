
class Prime // program to print 10001 prime number 
{
	 
	public static void main(String args[])
	{
		int number=3,count=1;// first prime number is 2. so checking starts from 3 and count is set to 1
			while(count<10001)
				{
					if(checkprime(number)) // function to check whether a number is prime.
	
						count++;
					if(count==10001)
						System.out.println("The 10001 prime number  is :"+number);
					number++;
				}
	}

	public  static boolean checkprime(int n)//  method to check whether a number is prime. Returns 1 if prime
	{
	
			for(int k=2;k<=Math.sqrt(n);k++)// sufficient to check till the square root of the number
			{
				if(n%k==0)
					return false;// the number is composite
	
			}
			return true;// the number is prime if there are no divisors
	}

}