// Interface for analysis & reporting
public interface IAnalyzable {

    void generateReport();      // Polymorphic
    void detectOverspend();     // Category-based analysis
}