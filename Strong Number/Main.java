import java.util.Scanner;
class Main{
	public static void main (String args[]){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int n1 = n;
      int sum = 0;
      while( n>0)
      {
        int a = n % 10;
        int p = 1;
        for( int i =1; i<= a; i++)
        {
          p = p * i ;
        }
        sum = sum + p;
        n = n / 10; 
      }
      if ( n1 == sum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}