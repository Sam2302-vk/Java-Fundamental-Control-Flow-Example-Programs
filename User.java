//Print the numbers from 1 to the user's number

import java.util.*;
public class User {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        for(int i=1; i<=num; i++){
            System.out.println(i);
        }
    }
}
