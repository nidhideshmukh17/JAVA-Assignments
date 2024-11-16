public class GraduateStudent extends Student {
    public GraduateStudent(String name, int age, String studentId, int[] grades) {
        super(name, age, studentId, grades);
    }

    @Override
    public String getDetails() {
        return "Graduate student - " + super.getDetails();
    }
}