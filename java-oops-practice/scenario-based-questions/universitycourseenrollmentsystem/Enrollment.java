class Enrollment {

    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        System.out.println(student.name + " enrolled in " + course.getCourseName());
    }
}
