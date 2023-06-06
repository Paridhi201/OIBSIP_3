import java.lang.Math;
import java.util.*;
public class atm {
    
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int[]arr1 = {546781,734513,345687,879325,996437};
    int[]arr2 = {4571,2233,8469,1492,9964};
    System.out.println("Welcome to the XYZ ATM!");
    int count =0;
    int amt =0;
    int in = 0;
    System.out.println("Enter your userID:");
    int a = sc.nextInt();
    for(int i =0;i<arr1.length;i++){
        if(a==arr1[i]){
            System.out.println("Valid user ID. ");
             in = in+i;
            break;
        }
        else {
            count++;
        }
    }
    if(count==5){
        System.out.println("Invalid user ID");
    }
    System.out.println("Enter your user ID.");
   int b = sc.nextInt();
   for(int i =0;i<arr2.length;i++){
    if(b==arr2[i]&&i == in){
        System.out.println("Valid user PIN");
        break;
    }
    else{
        amt++;
    }
   }
   if(amt==5){
    System.out.println("Invalid user PIN.");
   }
  if(count!=5&& amt!=5){
     Random ran = new Random();
    int amount= ran.nextInt(20000);
    int bal = amount;
    System.out.println("Amount in your account:"+ amount);
    System.out.println("Press 1 to withdraw");
    System.out.println("Press 2 to deposit");
    System.out.println("Press 3 to transfer money in other account");
    System.out.println("Press 4 to quit");
    int c = sc.nextInt();
    switch(c)
    {
        case 1:
            System.out.println("Enter the amount to withdraw");
            int w = sc.nextInt();
            if(w>amount)
            System.out.println("You do not have enough balance in your account");
            else{
                bal = bal-w;
                System.out.println("Rs."+ w+" withdrawn from the account");
                System.out.println("Balance remaining in the account is: "+ bal);
            }
            break;

        case 2:

            System.out.println("\nEnter the amount to Deposit: ");
            int dep = sc.nextInt();
           bal = bal+dep;
           System.out.println("Rs. "+ dep+" deposited in the account");
           System.out.println("Current balance is "+bal);
           break;
        case 3:
            System.out.println("Enter the receipent's ID: ");
            int rec = sc.nextInt();
            System.out.println("Enter the amount to be transferred from the account");
            int tra = sc.nextInt();
            if(tra>bal){
                System.out.println("This amount cannot be transferred due to insufficient balance.");
            }
            else{
                bal = bal-tra;
                System.out.println("Rs. "+tra+ " transferred to "+rec+" account");
                System.out.println("Current balance is "+ bal);
            }
            break;
        
        case 4:
            System.out.println("Thank You for using XYZ ATM");

            break;
       
    

}
System.out.println("Do you want to see your transaction history?");
System.out.println("Press 'true' if you want to and 'false' if you do not want to.");
boolean bo=sc.nextBoolean();
if(bo == true){
    System.out.println("Initial balance in account: "+ amount);
            if (amount>bal)
                System.out.println("Current Amount: "+ bal);  
            else{
                System.out.println("Current Amount: "+ bal);
            }          

}
}
}
}
