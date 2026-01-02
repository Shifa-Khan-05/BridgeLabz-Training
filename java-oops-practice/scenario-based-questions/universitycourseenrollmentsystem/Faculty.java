class Faculty implements Graded {

    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    // Polymorphism via interface
    @Override
    public void assignGrade(Student student, Course course, int marks) {
        System.out.println("Faculty " + name + " assigned " + marks +
                " marks in " + course.getCourseName());
        student.updateGPA(marks);
    }
}
