//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[][] studentsAndMarks = {{91,75,88},{67,78,87},{98,99,96},{83,76,97},{53,65,55}};

        double studentsAverage = averageMarkOfStudents(studentsAndMarks, 4);

            if(studentsAverage > 95) {
                System.out.println("Student got an A");
            } else if (studentsAverage > 90) {
                System.out.println("Student got a B");
            } else if (studentsAverage > 80) {
                System.out.println("Student got a C");
            } else if (studentsAverage > 70) {
                System.out.println("Student got an E");
            } else if (studentsAverage < 60) {
                System.out.println("Student got an F");
            }

        }
    public static double averageMarkOfStudents(int[][] arr, int row) {
        double sum = 0;
        double averageMark = 0;
        for(int i = 0; i < arr[row].length; i++) {
            sum += arr[row][i];
        }
        averageMark = sum / 3;
        System.out.println(averageMark);
        return averageMark;
    }
}