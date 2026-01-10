// Student inherits User and implements certification
public class Student extends User implements ICertifiable {

    private double progress; // percentage
    private double score;

    public Student(String name, String email) {
        super(name, email);
    }

    // Track course progress
    public void updateProgress(int completedModules, int totalModules) {
        this.progress = (completedModules * 100.0) / totalModules;
    }

    // Grade calculation
    public void calculateScore(int marksObtained, int totalMarks) {
        this.score = (marksObtained * 100.0) / totalMarks;
    }

    @Override
    public void generateCertificate() {
        if (progress == 100 && score >= 60) {
            System.out.println("Certificate Generated for Student: " + name);
        } else {
            System.out.println("Course not completed yet.");
        }
    }
}
