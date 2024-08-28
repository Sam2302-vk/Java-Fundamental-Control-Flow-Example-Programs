//Check whether the number is positive or negative or zero

import java.util.*;
public class Demo {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(num>0){
        System.out.println("Positive");
    }
    else if(num==0){
        System.out.println("Zero");
    }
    else{
        System.out.println("Negative");
    }
  }
}
