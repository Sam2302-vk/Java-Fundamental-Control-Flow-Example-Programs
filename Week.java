//Week based on the number

import java.util.*;
public class Week {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int weekNum=sc.nextInt();
        String weekDay;
        switch(weekNum){
            case 1:
               weekDay="Monday";
            break;

            case 2:
              weekDay="Tuesday";
              break;

              case 3:
              weekDay="Wednesday";
              break;

              case 4:
              weekDay="Thursaday";
              break;

              case 5:
              weekDay="Friday";
              break;

              case 6:
              weekDay="Saturday";
              break;

              case 7:
              weekDay="Sunday";
              break;
 
              default:
              weekDay="Invalid Week day";

            
        }
        System.out.println(weekDay);
    }
}
