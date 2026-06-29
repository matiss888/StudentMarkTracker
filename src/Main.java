public class Main {
    public static void main(String[] args) {
        int[][] studentsAndMarks = {{91,75,88},{67,78,87},{98,99,96},{83,76,97},{53,65,55}};

        for (int i = 0; i < studentsAndMarks.length; i++) {
            double studentsAverage = averageMarkOfStudents(studentsAndMarks[i]);
            if (studentsAverage > 95) {
                System.out.println("Student " + i + " got an A");
            } else if (studentsAverage > 90) {
                System.out.println("Student " + i + " got a B");
            } else if (studentsAverage > 80) {
                System.out.println("Student " + i + " got a C");
            } else if (studentsAverage > 70) {
                System.out.println("Student " + i + " got an E");
            } else if (studentsAverage < 60) {
                System.out.println("Student " + i + " got an F and failed the test");
            }
        }
    }

    public static double averageMarkOfStudents(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}