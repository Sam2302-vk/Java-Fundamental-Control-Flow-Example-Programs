//print the numbers as down from the user's number

import java.util.*;
public class Down {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=num; i>=0 ;i--){
            System.out.println(i);
        }
    }
}
