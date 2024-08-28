//print the number from 1 to 3 ,demonstrate that the block executed atleast once

import java.util.*;
public class Block {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++ ;
        }
        while(i<=num);

    }
}
