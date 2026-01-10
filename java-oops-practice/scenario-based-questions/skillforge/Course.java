// Represents a course in SkillForge
public class Course {

    private String title;              // course name
    private Instructor instructor;     // course instructor
    protected double rating;            // course rating
    private String[] modules;           // list of modules
    private final int reviewCount;      // fixed reviews (read-only)

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Intro", "Basics", "Advanced"};
        this.rating = 4.0;
        this.reviewCount = 100;
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 4.0;
        this.reviewCount = 100;
    }

    // Update rating (internal use only)
    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2;
    }

    // Get total reviews (cannot modify)
    public int getReviewCount() {
        return reviewCount;
    }

    // Get number of modules
    public int getTotalModules() {
        return modules.length;
    }
}
