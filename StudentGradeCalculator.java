import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[]args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the number of subjects: ");
            int numOfSub = scanner.nextInt();

            int total = 0;
            for(int i =1; i<= numOfSub; i++){
                System.out.println("Enter the marks for the subject" + i + ":\n");
                int marks = scanner.nextInt();
                total += marks;
            }

            double avgPercentage = (double) total / numOfSub;
            Letter4Grade grade = Letter4Grade.getGrade(avgPercentage);

            System.out.println("Total marks: " + total);
            System.out.println("Average Percentage: " + avgPercentage);
            System.out.println("Grade: "+ grade);
        }
    }
}

enum Letter4Grade{
    A(90, 100),
    B(80,89),
    C(70, 79),
    D(60, 69),
    E(50, 49),
    F(0, 49);

    private final int lowerBound;
    private final int upperBound;

    Letter4Grade(int lowerBound, int upperBound){
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }
    public static Letter4Grade getGrade(double percentage){
        for(Letter4Grade grade : Letter4Grade.values()){
            if(percentage >= grade.lowerBound && percentage <= grade.upperBound){
                return grade;
            }
        }
        throw new IllegalArgumentException("Invalid Percentage: " + percentage);
    }
}
