import java.util.Scanner;//

public class calculator {
    public static void calculator(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        int choice;

        System.out.println("1 -Add \n 2 -Subtract \n 3 -Multiply \n 4 -Divide");
        System.out.println("choose operator: ");
        choice =input.nextInt();
         num1 =input.nextDouble();
         num2 =input.nextDouble();

         switch (choice) {
             case 1:
                 result = num1 + num2;
                 break;

             case 2:
                 result = num1 - num2;
                 break;

             case 3:
                 result = num1 * num2;
                 break;

             case 4:
                 if (num2== 0) {
                     System.out.println("Error!Divison by zero is not allowed");
                 }  else {
                     result = num1 / num2;
                 }
                 break;

             default:
                 System.out.println(1234);
                 break;



         }

    }
}
