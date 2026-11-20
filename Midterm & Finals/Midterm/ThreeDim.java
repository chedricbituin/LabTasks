import java.util.Scanner;
 
public class ThreeDim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 2 sections, 3 students per section, 3 subjects per student
        double[][][] grades = new double[2][3][3];
        String[] subjects = {"Java", "Database", "Networking"};
 
        for (int sect = 0; sect < grades.length; sect++) {
            System.out.println("\nSECTION " + (sect + 1));
            System.out.println("---------------------------------------");
            double sectionTotal = 0;
 
            for (int student = 0; student < grades[sect].length; student++) {
                System.out.println("\nStudent " + (student + 1));
                double studentTotal = 0;
 
                // 3rd loop for the 3rd dimension (subjects)
                for (int subj = 0; subj < grades[sect][student].length; subj++) {
                    System.out.print(subjects[subj] + ": ");
                    grades[sect][student][subj] = input.nextDouble();
                    studentTotal += grades[sect][student][subj];
                }
 
                double average = studentTotal / 3;
                sectionTotal += average;
                System.out.printf("Student Average: %.2f%n", average);
            }
 
            double sectionAverage = sectionTotal / 3;
            System.out.printf("Section Average: %.2f%n", sectionAverage);
        }
 
        input.close();
    }
}
