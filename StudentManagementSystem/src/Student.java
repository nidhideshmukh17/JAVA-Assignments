class Student extends Person implements ScholarshipEligibility {
    private String studentId;
    private int[] grades;
    private static int Scount = 0;

    public Student(String name, int age, String studentId, int[] grades) {
        super(name, age);
        this.studentId = studentId;
        this.grades = grades;
        Scount++;
    }

    public static int getTotalStudents() {
        return Scount;
    }

    public double calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        if (grades.length > 0) {
            return sum / (double) grades.length;
        } else {
            return 0;
        }
    }

    @Override
    public boolean isEligibleForScholarship() {
        if (calculateAverageGrade() > 85) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDetails() {
        return "Name: " + name + ", Age: " + age + ", Student ID: " + studentId + ", Avg Grade: " + calculateAverageGrade();
    }
    static class Course {
        String courseName;
        String courseCode;

        public Course(String courseName, String courseCode) {
            this.courseName = courseName;
            this.courseCode = courseCode;
        }

        @Override
        public String toString() {
            return "Course Name: " + courseName + ", Course Code: " + courseCode;
        }
    }
}