
class Student extends Person implements ICourseActions {

    private int[] grades;

    Student(int id, String name, String email, int[] grades) {
        super(id, name, email);
        this.grades = grades;
    }

    double calculateGPA() {
        int sum = 0;
        for (int g : grades)
            sum += g;
        return sum / (double) grades.length;
    }

    public void enrollCourse(String courseName) {
        System.out.println(name + " enrolled in " + courseName);
    }

    public void dropCourse(String courseName) {
        System.out.println(name + " dropped " + courseName);
    }

    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Role: Student");
        System.out.println("GPA: " + calculateGPA());
    }
}
