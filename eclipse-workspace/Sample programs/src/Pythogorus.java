
 class Pythogorus                           //To print the values of pythogorean triplet which sums up to 1000
 {
	 
	 public static void main(String args[])
	 {
		int c;
		for(int a=1;a<=1000/3;a++)        // a+b+c=1000 .Therefore,assuming  a<b .Then a should be <= 1000/3
		
	     for(int b=a+1;b<=1000/2;b++) // looping through possibilities of b
			 {
				 c=1000-a-b;               //Assigning value to c
						 if(a*a + b*b == c*c)
							 System.out.println("\n The numbers a,b,c\n"+a+"\n"+b+"\n"+c);
			 }
		 }
	 }
