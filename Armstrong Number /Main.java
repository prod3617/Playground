import java.util.Scanner;
class Main{
	public static void main (String args[]){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int n1 = n, n2 = n ;
      int count = 0;
      int sum = 0;
      int b;
      while(n > 0)
      {
        count++;
        n = n / 10;
      }
      //System.out.println(count);
      while(n1 > 0)
      {
        int a = n1 % 10;
        b = a;
        for(int i = 1; i<count; i++)
        {
          b = b * a;
         // System.out.println(b);
        }
        //System.out.println(a);
        sum =sum + b;
        n1 = n1 / 10;
      }
      //System.out.println(sum);
      if ( n2 == sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}