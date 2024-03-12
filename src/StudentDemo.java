import java.util.Scanner;
public class StudentDemo {
    public static void graduateCheck(Student student){
        //args.getName() = name;
            //pulls the name and should set it equal to name
        if(student.canGraduate() == true){
                //checks to see if canGraduate is true, if it is it should print else it should print the line below
            System.out.println(student.getName() + "can graduate, congratulations!");
        } else {
            System.out.println(student.getName() + "can't graduate, oh well...");
        }
    }
    public static Student makeStudent(Scanner keyboard){
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        System.out.println("what year are you in?");
        int year = keyboard.nextInt();

        System.out.println("how many grades do you have?");
        int numberOfGrades = keyboard.nextInt();

        double[] grades = new double[numberOfGrades];
        for(int i = 0; i < grades.length; ++i){
            System.out.println("Enter a grade:");
            double grade = keyboard.nextDouble();
            grades[i] = grade;
        }

        keyboard.nextLine();
        return new Student(name, grades, year);

    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many students do you want to make: ");
        int studentNum = keyboard.nextInt();
        keyboard.nextLine(); //flush stream
        for(int i = 0; i < studentNum; ++i) {
            Student s = makeStudent(keyboard);
            graduateCheck(s);
        }
    }
}
