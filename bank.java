import java.util.Scanner;
import java.lang.Math;
public class bank {
    int Account;
    String Name;
    double Balance;
    Scanner sc = new Scanner(System.in);

    //getter
    //  int getAccount(){
    //     this.Account =();
    //     return Account;
        
    // }
    // String getName(){
    //     this.Name = sc.nextLine();
    //     return Name;
    // }
    // int getBalance(){
    //     this.Balance = sc.nextInt();
    //     return Balance;
    // }

    //setters
     void setAccount(){
        //this.Account = Math.random();
     System.out.println("You can set your Account number : ");

        this.Account = sc.nextInt();
    }
    void setName(String n){
     System.out.println("Name of the Account Holder : ");

        this.Name = sc.nextLine();
    }
    void setBalance(int b){
     System.out.println("Enter your intial Balance : ");

        this.Balance = sc.nextInt();
    }

 //print
 public void showVal(){
     System.out.println("Account Holder : " +Name);
     System.out.println("Account Number : "+Account);
     System.out.println("Balance : "+Balance);
 }
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    bank Ac1 = new bank();
   // bank Ac2 = new bank();
    System.out.println("Welcome To our Bank ");
    System.out.println("Press 1 to Create New Account or 2 for show the Ac Info ");
    int choice = 0;
    choice = sc.nextInt();
    if (choice == 1) {
    System.out.println("Proceed to Open An Account :- ");
        Ac1.setName("");
        Ac1.setAccount();
        Ac1.setBalance(0);
        Ac1.showVal();
    }
    else if(choice==2){
        System.out.println("Your Account details are :- ");

        Ac1.showVal();
    }
else{
    System.out.println("Wrong input try again!! ");
    sc.close();
   
}

}

}

