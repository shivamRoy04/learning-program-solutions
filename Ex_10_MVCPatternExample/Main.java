public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "123");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        controller.setStudentName("Mike");
        controller.updateView();
    }
}