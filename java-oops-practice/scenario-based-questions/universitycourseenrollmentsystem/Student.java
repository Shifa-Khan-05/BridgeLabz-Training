// Parent class
abstract class Student {

    protected int id;
    protected String name;

    // Sensitive data
    private double gpa;
    private int totalMarks;
    private int subjectCount;

    // Constructor without electives
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor with electives
    public Student(int id, String name, String elective) {
        this.id = id;
        this.name = name;
        System.out.println("Elective chosen: " + elective);
    }

    // Encapsulated grade update
    protected void updateGPA(int marks) {
        totalMarks += marks;
        subjectCount++;
        gpa = (double) totalMarks / subjectCount; 
    }

    // Public controlled access
    public double getGPA() {
        return gpa;
    }

    // Polymorphic method
    public abstract void displayInfo();
}
