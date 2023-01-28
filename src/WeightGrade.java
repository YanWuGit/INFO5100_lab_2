import java.util.Scanner;

public class WeightGrade {
    private Double fullPoints;
    private Double earnedPoints;
    private Double percentage;



    public void takeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the total points of this assignment: ");
        fullPoints = scanner.nextDouble();

        System.out.println("Please type in points you earned: ");
        earnedPoints = scanner.nextDouble();

        System.out.println("Please type in the percentage this assignment contribute to your final grades: ");
        percentage = scanner.nextDouble();
    } // take inputs from the user and update attribute values

    public void percentageEarned() {
        Double percentageEarned = earnedPoints / fullPoints * percentage;
        System.out.println("You have earned " + percentageEarned + "% towards your final grade for this assignment.");
    } // calculate and output grades earned by the assignment in percentage
}

