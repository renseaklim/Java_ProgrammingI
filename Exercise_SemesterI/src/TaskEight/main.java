package TaskEight;

import javax.sound.midi.Soundbank;

public class main {
    public static void main (String[] args){
        Student obj = new Student("Seak lim", "Tuek Thla", 3);
        try{
            obj.addCourseGrade("Java", 100);
            obj.addCourseGrade("Network", 99);
            obj.addCourseGrade("C#", 98);
            obj.addCourseGrade("Statistic", 99);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error:" + e.getMessage());
        }
        System.out.println("\n=====================================");
        obj.printGrade();
    }
}
