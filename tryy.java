import java.util.*;
public class tryy {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.println("week days");
        System.out.print("Enter a number of week : ");
        int days = sc.nextInt();
        switch(days){
            case 1:{
            System.out.print("Today is Monday");
            break;
            }
            case 2:{
            System.out.print("Today is Tuesday");
            break;
                    }
            case 3:{
            System.out.print("Today is Wednesday");
            break;
            }
            case 4:{
            System.out.print("Today is Thusday");
            break;
                    }
            case 5:{
            System.out.print("Today is Friday");
            break;
                    }
            case 6:{
            System.out.print("Today is Saturday");
            break;
                    }
                    case 7:{
                    System.out.print("Today is Sunday");
                    break;
                            }
            default : {
                System.out.print("Invaled input!!");
            } 


    
    }
    }
}