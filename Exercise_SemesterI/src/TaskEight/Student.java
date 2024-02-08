package TaskEight;

public class Student extends Person{
    private int numCourse;
    private int[] grade;
    private String[] course;
    private int temp;

    public Student(String name, String address, int numCourse) {
        super(name, address);
        this.numCourse = numCourse;
        this.course = new String[numCourse];
        this.grade = new int[numCourse];
    }

    public void addCourseGrade(String course, int grade) {
        if (this.course.length != this.numCourse - 1) {
            this.grade[temp] = grade;
            this.course[temp] = course;
            temp ++ ;
        }else {
            throw new ArrayIndexOutOfBoundsException("You can't input Course and grade anymore!");
        }
    }
    public void printGrade(){
        for(int i = 0; i < this.course.length; i++) {
            System.out.println("course:" + this.course[i] + "=\t" + this.grade[i]);
        }
    }
}
