package jsonDataHandling.filterjson;

import com.fasterxml.jackson.databind.*;
import java.io.File;

public class FilterAge {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\jsonDataHandling\\src\\jsonDataHandling\\filterjson\\users.json"));

        for (JsonNode n : root) {
            if (n.get("age").asInt() > 25) {
                System.out.println(n);
            }
        }
    }
}
