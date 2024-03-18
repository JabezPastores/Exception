import java.util.*;

public class ExceptionNow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {


                int num1 = 0;
                int num2 = 0;
                double result = 0;

                System.out.println("Enter num1: ");
                num1 = input.nextInt();

                System.out.println("Enter num2: ");
                num2 = input.nextInt();

                if (num2 == 0)
                    throw new DivisionZeroException("Zero is now allowed");
                result = (double) num1 / num2;
                System.out.println("Result is " + result);
                System.exit(0);
            }
            catch(InputMismatchException e){
                    System.out.println("Only integers are allowed for input");
                }
            catch(DivisionZeroException e){
                    System.out.println(e.getMessage());
                }
            finally{
                    input.close();
                    System.out.println("Program is terminated");

                }
            }
        }
    }

