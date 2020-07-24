import pack.Demo; 
import java.util.*;

public class Calc {
public static void main(String[] args)
  { Demo obj = new Demo();
      //Calc app=new Calc();
      Scanner sc = new Scanner(System.in);
    int a,b,ch;
    System.out.println("Hello");
    sc=new Scanner(System.in);
    System.out.println("Enter the two numbers");
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println("Enter the choice 1.add 2.subtract 3.multiply 4.divide");
    ch = sc.nextInt();
    
    switch(ch)
    {   case 1:System.out.println("the sum is "+obj.add(a,b));
        break;
        case 2:System.out.println("the difference is "+obj.dif(a,b));
        break;
        case 3:System.out.println("the product is "+obj.mul(a,b));
        break;
        case 4:   try{
                      System.out.println("the quotient is "+obj.div(a,b));
                      }catch(Exception e)
                      {System.out.println("Cannot divide by zero");}  
                  break;
        default:System.out.println("error");
    }
  
    sc.close();
  }
}
