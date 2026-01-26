import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ValidateEmailSchema {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(new File("user.json"));
            System.out.println(" Email JSON structure is valid");
        } catch (Exception e) {
            System.out.println("Invalid email JSON");
        }
    }
}
