import java.util.Scanner;
import java.util.ArrayList;

public class todo{
   
      static Scanner input = new Scanner(System.in);
       static String[] student = new String[]{"Merry","John","Sam","Peter","Jake","Tom"};
        static int[] marks = new int[6];
        static String[] subject = new String[]{"Maths","English","Programming","Aritifical_Intelligence","Physical_Science"};

        
        
        public static void main(String[] args){
                
            try {
              for(int i = 0 ; i<= student.length ; ++i){
    
                System.out.println("Enter Marks for " + student[i]);
                 
                  try{ 
                for(int s = 0 ; s <=marks.length ; ++s){
                     System.out.print("Enter marks for subject  " + subject[s] + " : ");
                      marks[s] = input.nextInt();
                 }
                }
                 catch(ArrayIndexOutOfBoundsException z){
                    System.out.println(z.getMessage());
                 }   

              }

    }
    catch(ArrayIndexOutOfBoundsException e){
       System.out.println(e.getMessage());
}
    try{
     for(int q = 0 ; q <= student.length ; ++q){

           System.out.println("Marks entered for the following student " + student[q] + " are as follows : ");
             
           try {

           for(int a = 0 ; a <= marks.length ; ++a){

                   
            System.out.println("Mark for " + subject[a] + " is " + marks[a] );
            
        }
            }
            catch(ArrayIndexOutOfBoundsException x){
               
                System.out.println(x.getMessage());

            }
     }

    }
    catch(ArrayIndexOutOfBoundsException m){
      
        System.out.println(m.getMessage());

    }
  }
}