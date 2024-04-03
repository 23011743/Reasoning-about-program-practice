import java.util.Scanner;
import javax.swing.JOptionPane;

  interface  Methodimplement {
  
     abstract void Transaction();
     abstract int withdrawal();
     abstract int deposit();
    abstract int Balance();
    
  }

public class bank extends Account{
   
  static Scanner input = new Scanner(System.in);
   static String confirmation, name, surname, gender, username;
   static int pin,age,pin1,deposit_amount,withdrawal_amount,deposit,withdraw,  bal = 10000;
   

    public static void Verification(){
   
           JOptionPane.showMessageDialog(null, "Hello Welcome!", "F.I.C Bank", JOptionPane.INFORMATION_MESSAGE);
             
           confirmation = JOptionPane.showInputDialog(null, "Do you have a Bank account? ", "User!!", JOptionPane.QUESTION_MESSAGE);
              
             

    }
   
      public static void CreateAccount(){
        
        System.out.println("Hello Welcome create your. \n Enter name ");
          name = input.nextLine();

          System.out.println("Enter surname");
          surname = input.nextLine();


            System.out.println("Create your new pin which you will use to login");
            pin = input.nextInt();

      }

      public static String Login(){
            
        System.out.println("Enter username");
              username = input.nextLine();

              return username;
      }
       
      public static int Login1(){
            
        System.out.println("Enter pin");
           pin1 = input.nextInt();

           return pin1;

      }

      public static boolean Verify_Username(){
          
        return username.equals(name);

      } 
          public static boolean Verify_pin(){

            return pin1 == pin;

          }

    public static void main(String[] args) {
        int count = 0;
       
        Verification();
       
        Account ofFIC = new Account();

        
        if(confirmation.equals("Yes")){
          
            Login();
            Login1(); 
            if(  Verify_pin()){
              ofFIC.Transaction();
            }
            else
            if( !Verify_pin()){
                 
                while(count <=4) {
                ++count;

                Login();
                Login1();
                if( Verify_pin()){
                  ofFIC.Transaction();

                }
                }  
                
            
        }
        }
          else 
         if(confirmation.equals("No")){
            CreateAccount();
            Login();
            Login1(); 
            if( Verify_pin()){
              ofFIC.Transaction();
              System.out.println("Would you like to see menu again if yes press 1 else 2");
               int menu = input.nextInt();
                while(menu == 1) {
                  ofFIC.Transaction();
                }
            }
            else
            if( !Verify_pin()){
                 
                while(count <=4) {
                ++count;

                Login();
                Login1();
                if(  Verify_pin()){
                  ofFIC.Transaction();

                }
                }  
                
            
        }

         }  


    }
}

class Account  implements Methodimplement{
  
  
  static int x = 10000,withdraw,deposit,balance,transactionchoice;
  static Scanner input1 = new Scanner(System.in);

 @Override
 public int Balance(){
    return x;
  }

  @Override
  public int withdrawal(){
    JOptionPane.showMessageDialog(null, "Your available amount is " + x + " and you can only withdraw amount less than. ", "Withdrawal", JOptionPane.WARNING_MESSAGE);
    withdraw = input1.nextInt();
       x -= withdraw;
     return x;

  }
  @Override
  public int deposit(){
  
     System.out.println("Enter amount to deposit" );
       deposit = input1.nextInt();
      
       x += deposit;

       return x;


  }
  @Override
  public void Transaction(){
    
    System.out.println("Choose the type you want to transact \n 1. View Balance \n 2. Deposit Money \n 3. Withdraw Money");
     transactionchoice = input1.nextInt();

    switch(transactionchoice){
        case 1:
        Balance();
        System.out.println(x);
        break;
        
        case 2:
        deposit();
        System.out.println(deposit);
        break;

        case 3:
        withdrawal();
        System.out.println(withdraw);
        break;

        default:
        System.out.println("Wrong option");
        break;

       }  


  }
}
