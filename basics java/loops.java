import java.util.Scanner;
public class loops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();
   int i = 10;
   int sum = 11;

   while (i<=n){
      sum = sum + i;
      i++;
   }
    System.out.println("sum is: " + sum);  
    sc.close();
  } 
} 




