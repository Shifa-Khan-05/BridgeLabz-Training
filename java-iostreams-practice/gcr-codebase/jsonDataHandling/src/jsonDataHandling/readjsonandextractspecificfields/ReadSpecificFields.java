package jsonDataHandling.readjsonandextractspecificfields;

import com.fasterxml.jackson.databind.*;
import java.io.File;

public class ReadSpecificFields {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\jsonDataHandling\\src\\jsonDataHandling\\readjsonandextractspecificfields\\users.json"));

        for (JsonNode node : root) {
            System.out.println(node.get("name").asText() +
                    " - " + node.get("email").asText());
        }
    }
}
