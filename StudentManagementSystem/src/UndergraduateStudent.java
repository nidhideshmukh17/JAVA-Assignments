public class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name, int age, String studentId, int[] grades) {
        super(name, age, studentId, grades);
    }

    @Override
    public String getDetails() {
        return "Undergraduate student - " + super.getDetails();
    }
}