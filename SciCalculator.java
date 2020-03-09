import java.util.Scanner;
public class SciCalculator {
    public static void main(String[] args) {
        boolean calRun = true;
        //this variable creates the condition for the loop to run.
        int numCalculations = 0;
        double sumCalculations = 0;
        double RESULTS;
        double firstOperand;
        double secondOperand;
        Scanner userInput = new Scanner(System.in);
        double currentResult = 0.0;
        while (calRun = true)
        //while loop will run so long as calRun is true. Will make false later on in code.
        {
            //currentResult is reset to zero after every loop

                System.out.println("Current Result: " + currentResult);
                //below is cal menu
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("Enter Menu Selection: ");

            int menuSelect = userInput.nextInt();
            //below is the branch if menuSelect equals 0

            //below is the menu for average or when user does not put a value in the range
             if(menuSelect == 7 || menuSelect != (0-7))
            {

                if (menuSelect != (0-7))
                {
                    System.out.println("Error: Invalid selection!");
                }

                else if (menuSelect == 7)
                {
                    //BELOW is the result of there being no calculation
                    if (currentResult == 0)
                    {
                        System.out.println("Error: No calculations yet to average!");
                        // This is the redisplay of the menu below. I will reuse this code later on in the branch.
                    }
                    //now for when there is an actual running total:
                    else {
                        double averageResult = sumCalculations / numCalculations;
                        //this is so i can round the total to the nearest two decimal points.
                        averageResult = averageResult * 100;
                        int tempAverage = (int) averageResult;
                        averageResult = (double) tempAverage * 0.01;

                        //now we have to round the sum
                        sumCalculations = sumCalculations * 100;
                        int tempSum = (int) sumCalculations;
                        sumCalculations = (double) tempSum * 0.01;
                        // this is the printed results
                        System.out.println("Sum of calculations: " + sumCalculations);
                        System.out.println("Number of calculations: " + numCalculations);
                        System.out.println("Average of calculations: " + averageResult);
                    }

                //the new menu and rerunning option 0-6. I made it a while loop in case they keep inserting a number not in range.
                boolean alternateMenuRun = true;
                while (alternateMenuRun = true) {
                    System.out.println("Enter Menu Selection: ");
                    //this code below from lines 136-210 is a duplicate from the previous lines without the same input name.
                    int alternateMenu = userInput.nextInt();
                    //below is the branch if menuSelect equals 0
                    if (alternateMenu == 0) {
                        System.out.println("Thanks for using this calculator. Goodbye!");
                        calRun = false;
                        break;

                    }
                    //below is the branch for addition
                    else if (alternateMenu == 1) {
                        System.out.print("Enter first operand: ");
                        firstOperand = userInput.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOperand = userInput.nextDouble();
                        currentResult = (firstOperand + secondOperand);
                        sumCalculations = sumCalculations + currentResult;
                        numCalculations = numCalculations + 1;

                        //to stop the loop
                        alternateMenuRun = false;
                    }
                    //below is the branch for subtraction
                    else if (alternateMenu == 2) {
                        System.out.print("Enter first operand: ");
                        firstOperand = userInput.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOperand = userInput.nextDouble();
                        currentResult = (firstOperand - secondOperand);
                        sumCalculations = sumCalculations + currentResult;
                        numCalculations = numCalculations + 1;
                        //to stop the loop
                        alternateMenuRun = false;
                    }
                    //below is the branch for multiplication
                    else if (alternateMenu == 3) {
                        System.out.print("Enter first operand: ");
                        firstOperand = userInput.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOperand = userInput.nextDouble();
                        currentResult = (firstOperand * secondOperand);
                        sumCalculations = sumCalculations + currentResult;
                        numCalculations = numCalculations + 1;
                        //to stop the loop
                        alternateMenuRun = false;
                    }
                    //below is the branch for division
                    else if (alternateMenu == 4) {
                        System.out.print("Enter first operand: ");
                        firstOperand = userInput.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOperand = userInput.nextDouble();
                        currentResult = (firstOperand / secondOperand);
                        sumCalculations = sumCalculations + currentResult;
                        numCalculations = numCalculations + 1;
                        //to stop the loop
                        alternateMenuRun = false;
                    }
                    // below is the menu for Exponentiation
                    else if (alternateMenu == 5) {
                        System.out.print("Enter first operand: ");
                        firstOperand = userInput.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOperand = userInput.nextDouble();
                        currentResult = Math.pow(firstOperand, secondOperand);
                        // Since the logs are based 10s I kept getting a different answer. Simple fix attempt above.
                        sumCalculations = sumCalculations + currentResult;
                        numCalculations = numCalculations + 1;
                        //to stop the loop
                        alternateMenuRun = false;
                    }
                    //below is the menu for Logarithm
                    else if (alternateMenu == 6) {
                        System.out.print("Enter first operand: ");
                        firstOperand = userInput.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondOperand = userInput.nextDouble();
                        currentResult = Math.log(secondOperand) / Math.log(firstOperand);
                        sumCalculations = sumCalculations + currentResult;
                        numCalculations = numCalculations + 1;
                        //to stop the loop
                        alternateMenuRun = false;

                    }
                    else
                        {
                        System.out.println("Error: Invalid selection!");
                    }
                }
                }
            }

        }
    }
}
