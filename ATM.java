import java.util.Scanner;

public class ATM {


    public static void main(String[] args) {
        int balance  = 1000, withdraw,deposit ;
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Welcome ");
            System.out.println("Choose your operation");
            System.out.println("Withdraw ; 1 ");
            System.out.println("Deposit : 2 ");
            System.out.println("Balance Check : 3 ");
            System.out.println("Exit : 4");
            
           
            int choice  = sc.nextInt();
            switch(choice){
                case 1:                   
            System.out.println("Enter the value you want");
            
            withdraw = sc.nextInt();
            if(balance >= withdraw){
                balance = balance - withdraw;
                
                
            System.out.println("Your current balance is : " + (balance - withdraw) );             
            System.out.println("Collect your money");
            
            }else{
                
            System.out.println("Insufficient Balance");
            }
            System.out.println("");
            break;
                    
                    case 2:
                        
            System.out.println("Enter money to be deposited");
            
            deposit = sc.nextInt();  
            balance = balance + deposit;  
;  
            
            System.out.println("Your Money has been successfully deposited");
            System.out.println("Your current balance is : " + balance);
            break;
            
                    case 3:
                        System.out.println("Your balance : " + balance);
                        System.out.println("");
                        
                    case 4:
                        
                        System.exit(0);
                        
                        
            
            }
                
            
            
        }
            }
    
}   
