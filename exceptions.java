import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptions {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        try { 
            
            System.out.println("Enter a whole number to divide ;");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide ;");
            int y = scanner.nextInt();

            double z = x/y;

            System.out.println("The result is :" +z);

           
        }
        
        catch(ArithmeticException e){
            System.out.println("Orray erripuka zero ela vadthav ra");

        }

        catch(InputMismatchException e){
            System.out.println("Orray erripuka Number raayy");
        }

        catch(Exception e){
            System.out.println("Pora babu paddaka");
        }

        finally{
            scanner.close();
        }
    }
}
