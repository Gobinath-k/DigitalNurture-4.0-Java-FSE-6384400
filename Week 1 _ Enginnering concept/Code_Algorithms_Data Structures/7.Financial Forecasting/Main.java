import java.util.*;
class Main{

    public static double calculateFutureValue(double pv,double r,int n){
        if (n == 0) {
            return pv;
        }
       
        return calculateFutureValue(pv, r, n - 1) * (1 + r);
    }
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter the Present Value");
      double pv=sc.nextDouble();

      System.out.println("Eneter the Annual  Growth Rate");
      double r=sc.nextDouble()/100.0;

      System.out.println("Enter the no of Year");
      int n=sc.nextInt();

      double futureValue = calculateFutureValue(pv, r, n);
        System.out.printf("Future Value after %d years: %.2f", n, futureValue);

   }
}