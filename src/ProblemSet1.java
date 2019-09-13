/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.text.DecimalFormat;


public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

         double length = 8.5;
         double width = 11;
         double conversionFactorMM = 25.4;
         double squareMilliMeters = ((length*conversionFactorMM) * (width*conversionFactorMM));
         DecimalFormat commaFormat;
         commaFormat = new DecimalFormat("#,###.##");
         System.out.println("\n" + commaFormat.format(squareMilliMeters) + " square millimeters.");

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

         double conversionFactorCM = 2.54;
         double lengthCM = length * conversionFactorCM;
         double widthCM = width * conversionFactorCM;
         double perimeter = (2*lengthCM + 2*widthCM);
         System.out.println("\n" + commaFormat.format(perimeter) + " centimeters.");

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

         double diagonal = (Math.sqrt((Math.pow(length,2))+(Math.pow(width,2))));
         System.out.println("\n" + String.format("%.2f", diagonal) + " inches.");

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */
        double homework = 0.15;
        double quiz = 0.35;
        double test = 0.50;
        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;

        double homework1Weighted = homework1 * homework;
        double homework2Weighted = homework2 * homework;
        double homework3Weighted = homework3 * homework;
        double quiz1Weighted = quiz1 * quiz;
        double quiz2Weighted = quiz2 * quiz;
        double quiz3Weighted = quiz3 * quiz;
        double test1Weighted = test1 * test;
        double test2Weighted = test2 * test;
        double test3Weighted = test3 * test;

        double mpGrade = ((homework1Weighted + homework2Weighted + homework3Weighted)/3 + (quiz1Weighted + quiz2Weighted + quiz3Weighted)/3 + (test1Weighted + test2Weighted + test3Weighted)/3);
        System.out.println("\n" + String.format("%.2f", mpGrade) + "%.");

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

         double hourlyWage = 12.50;
         double weeklyWage = hourlyWage*7.5 + hourlyWage*8 + hourlyWage*10.5 + hourlyWage*9.5 + hourlyWage*6 + hourlyWage*11.5;
         String weeklyWageString = "$" + String.format("%.2f",weeklyWage);
         System.out.println("\n"+weeklyWageString+".");

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

         int salary = 117000;
         double fedTax = 0.24;
         double stateTax = 0.0637;
         double retirementContribution = 0.07;
         double weeklySalary = salary / 24;
        weeklySalary = weeklySalary - (weeklySalary*fedTax) - (weeklySalary*stateTax) - (weeklySalary * retirementContribution);

        System.out.println(weeklySalary);

        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */



        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */



        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */



        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */



    }
}
