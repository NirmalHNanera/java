 
import java.util.Scanner; 
class Bank_Account
 { 
         int accountNo;
         String userName;
         String email_id;
         String accountType;
         double accountBalance;
  
         void getAccountDetails() 
         { 
                 Scanner sc=new Scanner(System.in); 
                 System.out.println("Enter customer Account Number:"); 
                 accountNo=sc.nextInt(); 
                 System.out.println("Enter customer Name:"); 
                 userName=sc.next(); 
                 System.out.println("Enter customer email-id:"); 
                 email_id=sc.next();
            System.out.println("Enter  Type of account of customer");

accountType=sc.next();
System.out.println("Enter  balance of customer");

accountBalance=sc.nextDouble();

         } 
         void displayAccountDetails()
         { 
                System.out.println("Account Number-"+accountNo); 
                System.out.println("customer Name-"+userName); 
                System.out.println("Customer Emaul-id-"+email_id); 
                System.out.println("Type of Account -"+accountType); 
                System.out.println("Balance amount in Account -"+accountBalance);
         } 
 } 
 class Bankdemo 
 { 
         public static void main(String[] arg)  
         { 
                 Bank_Account A1=new Bank_Account(); 
                 Bank_Account A2=new Bank_Account(); 
                 A1.getAccountDetails(); 
                  
                 A1.displayAccountDetails(); 
                 A2.getAccountDetails(); 
                 A2.displayAccountDetails(); 
         } 
 }