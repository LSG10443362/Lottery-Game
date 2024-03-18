import java.util.Scanner;

public class Lottery {
    public static int num1, num2, num3;
    public static void main(String[] args) {


        System.out.println("Hello and welcome to the lottery game!");
        Scanner enterNumber = new Scanner(System.in);
        //asks the user to enter three numbers
        num1 = Integer.parseInt(enterNumber.nextLine());
        num2 = Integer.parseInt(enterNumber.nextLine());
        num3 = Integer.parseInt(enterNumber.nextLine());

        //output "no matches" if none of the numbers match
        if (MatchLotteryNumber.matchLotteryNumbers1.equals(true) {
            System.out.println("No Matches");
        }
        // output "Any one Matching in no particular order" if any one of the numbers match
        else if (MatchLotteryNumber.matchLotteryNumbers2.equals(true) {
            System.out.println("Any one Matching in no particular order");
        }

        //output "Any two Matching in no particular order" if any two of the numbers match
        else if (MatchLotteryNumber.matchLotteryNumbers3.equals(true) {
            System.out.println("Any two Matching in no particular order");
        }
        //output "Three Matching in no particular order" if all three of the numbers match but in no particular order
        else if (MatchLotteryNumber.matchLotteryNumbers4.equals(true) {
            System.out.println("Three Matching in no particular order");
        }
        //output "Any one Matching in exact order" if any one of the numbers match in the exact order
        else (MatchLotteryNumber.matchLotteryNumbers5.equals(true) {
            System.out.println("Three Matching in exact order");
        }


        }





}



