package z5;

public class Test {
    public static void main(String[] args) {
        Grades grades = new Grades();
        String input = "вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5";
        grades.gradeBeautifier(input);
    }
}
