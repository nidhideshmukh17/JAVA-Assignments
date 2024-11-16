public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        int count = 0;

        students[count++] = new UndergraduateStudent("AAA", 20, "101", new int[]{80, 65, 72});
        students[count++] = new GraduateStudent("BBB", 23, "202", new int[]{76, 92, 78});
        students[count++] = new UndergraduateStudent("CCC", 22, "303", new int[]{95, 90, 82});
        students[count++] = new GraduateStudent("DDD", 24, "404", new int[]{60, 85, 88});

        System.out.println("All Students : ");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student.getDetails());
            }
        }

        System.out.println("\nStudents eligible for Scholarship : ");
        for (Student student : students) {
            if (student != null && student.isEligibleForScholarship()) {
                System.out.println(student.getDetails());
            }
        }

        System.out.println("\nTotal Students : " + Student.getTotalStudents());

        Thread reportThread = new Thread(new ReportGenerator(students));
        reportThread.start();
    }
}
