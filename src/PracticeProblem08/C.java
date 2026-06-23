package PracticeProblem08;

public class C {

    public static void main(String[] args){

        // Grade points of 5 students for 5 subjects
        double[][] grades = {
                {3.5, 4.0, 3.0, 3.7, 4.0},
                {3.0, 3.5, 2.7, 3.0, 3.3},
                {4.0, 3.8, 3.9, 4.0, 3.7},
                {2.5, 3.0, 3.2, 2.8, 3.0},
                {3.8, 3.9, 4.0, 3.6, 3.7}};

        // Credits for 5 subjects
        int[] credits = {3, 4, 2, 3, 3};

        int students = grades.length;
        int subjects = grades[0].length;

        for (int i = 0; i < students; i++){

            double totalPoints = 0;
            int totalCredits = 0;

            for (int j = 0; j < subjects; j++) {
                totalPoints += grades[i][j] * credits[j];
                totalCredits += credits[j];
            }

            double cgpa = totalPoints / totalCredits;

            System.out.println("Student " + (i + 1) + " CGPA = " + cgpa);

        }

    }

}