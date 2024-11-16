public class ReportGenerator implements Runnable {
    private Student[] students;

    public ReportGenerator(Student[] students) {
        this.students = students;
    }

    @Override
    public void run() {
        System.out.println("\nStudent Report :-");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student.getDetails());
            }
        }
    }
}
