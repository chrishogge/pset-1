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

         final double LENGTH = 8.5;
         final double WIDTH = 11;
         final double CONVERSION_FACTOR_MM = 25.4;
         double squareMilliMeters = ((LENGTH*CONVERSION_FACTOR_MM) * (WIDTH*CONVERSION_FACTOR_MM));
         DecimalFormat commaFormat;
         commaFormat = new DecimalFormat("#,###.##");
         System.out.println("\n" + commaFormat.format(squareMilliMeters) + " square millimeters.");

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double CONVERSION_FACTOR_CM = 2.54;
         double LENGTHCM = LENGTH * CONVERSION_FACTOR_CM;
         double WIDTHCM = WIDTH * CONVERSION_FACTOR_CM;
         double perimeter = (2*LENGTHCM + 2*WIDTHCM);
         System.out.println("\n" + commaFormat.format(perimeter) + " centimeters.");

        /*
         * Exercise 3.
         *
         * What is the LENGTH of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

         double diagonal = (Math.sqrt((Math.pow(LENGTH,2))+(Math.pow(WIDTH,2))));
         System.out.println("\n" + String.format("%.2f", diagonal) + " inches.");

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */
        final double HOMEWORK = 0.15;
        final double QUIZ = 0.35;
        final double TEST = 0.50;
        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;

        double homework1Weighted = homework1 * HOMEWORK;
        double homework2Weighted = homework2 * HOMEWORK;
        double homework3Weighted = homework3 * HOMEWORK;
        double quiz1Weighted = quiz1 * QUIZ;
        double quiz2Weighted = quiz2 * QUIZ;
        double quiz3Weighted = quiz3 * QUIZ;
        double test1Weighted = test1 * TEST;
        double test2Weighted = test2 * TEST;
        double test3Weighted = test3 * TEST;

        double mpGrade = ((homework1Weighted + homework2Weighted + homework3Weighted)/3 +
        (quiz1Weighted + quiz2Weighted + quiz3Weighted)/3 + (test1Weighted + test2Weighted
         + test3Weighted)/3);
        System.out.println("\n" + String.format("%.2f", mpGrade) + "%.");

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

         final double HOURLY_WAGE = 12.50;
         double weeklyWage = HOURLY_WAGE*7.5 + HOURLY_WAGE*8 + HOURLY_WAGE*10.5
         + HOURLY_WAGE*9.5 + HOURLY_WAGE*6 + HOURLY_WAGE*11.5;
         String weeklyWageString = String.format("$%.2f",weeklyWage);
         System.out.println("\n"+weeklyWageString+".");

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

         final int SALARY = 117000;
         final double FED_TAX = 0.24;
         final double STATE_TAX = 0.0637;
         final double RET_CONT = 0.07;
         double weeklySalary = SALARY / 24;
         double takeHomePay = weeklySalary - (weeklySalary*FED_TAX);
         takeHomePay = takeHomePay - (takeHomePay*STATE_TAX);
         takeHomePay = takeHomePay - (takeHomePay*RET_CONT);

         System.out.println("\n" + String.format("$%,.2f",takeHomePay) + ".");

        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */

         final int NUM_STUDENTS = 273;
         final int NUM_TEACHERS = 28;
         final int CAPACITY = 54;

         int leftOver = (NUM_STUDENTS + NUM_TEACHERS)%CAPACITY;
         double busAmount = Math.ceil((NUM_STUDENTS + NUM_TEACHERS)/54.0);
         System.out.println("\n" + String.format("%.0f",busAmount)
         + " buses are needed, with " + leftOver + " passengers on the last bus.");

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */

          final double BOARD_LENGTH = 48;
          final double BOARD_WIDTH = 24;
          final double HOLE_DIAMETER = 6;
          double pi = 3.14159;

          double boardArea = BOARD_LENGTH * BOARD_WIDTH;
          double holeArea = pi * Math.pow(HOLE_DIAMETER/2, 2);
          double totalBoardArea = boardArea - holeArea;

          System.out.println("\n" + String.format("%,.2f",totalBoardArea) +
          " square inches.");

        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */

         double yearOne = 2020;
         double yearTwo = 2100;
         double yearThree = 2400;

         boolean isYearOneLeap = isLeapYear(yearOne);
         boolean isYearTwoLeap = isLeapYear(yearTwo);
         boolean isYearThreeLeap = isLeapYear(yearThree);

         System.out.println("\n" + String.format("%.0f",yearOne)
         + " is a leap year..." + isYearOneLeap +
         ".\n" + String.format("%.0f",yearTwo) + " is a leap year..."
         + isYearTwoLeap
          + ".\n" + String.format("%.0f",yearThree) + " is a leap year..."
          + isYearThreeLeap + ".");

        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */

          double temp = 38;
          double speed = 14;

          double windChill = windChillTemp(temp,speed);
          System.out.println("\n" + String.format("%.1f",windChill) + " degrees.");

    }
    public static boolean isLeapYear(double year){
      boolean isLeap = (((year%4)==0) && (((year%100)!=0) || ((year%400)==0)));
      return isLeap;
    }

    public static double windChillTemp(double temperature, double windSpeed){
      double windChillTempCalc = 35.74 + (0.6215*temperature) +
      ((0.4275*temperature) - 35.75)*Math.pow(windSpeed,0.16);
      return windChillTempCalc;
    }
}
