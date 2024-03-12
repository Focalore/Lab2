public class Student {
    private String name;
    private double[] grades;
    private int year;

    public Student() {
        name = "N/A";
        grades = new double[5];
        year = 0;
    }

    public Student(String newName, double[] newGrades, int newYear) {
        name = newName;
        grades = newGrades;
        year = newYear;
    }

    public String getName() {
        return name;
    }

    private double calculateAverage() {
        if (grades.length == 0) {
            System.out.println("No Grades!");
            return 0;
        }
        double total = 0;
        for (double grade : grades) {
            total = total + grade;
        }
        return total / grades.length;
    }

    public boolean canGraduate() {
        return calculateAverage() >= 75 && year == 12;
    }
}