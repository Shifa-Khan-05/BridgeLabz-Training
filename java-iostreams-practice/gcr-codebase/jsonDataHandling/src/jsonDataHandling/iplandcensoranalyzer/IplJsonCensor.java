package jsonDataHandling.iplandcensoranalyzer;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class IplJsonCensor {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Read IPL JSON file
        ArrayNode matches =
                (ArrayNode) mapper.readTree(new File("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\jsonDataHandling\\src\\jsonDataHandling\\iplandcensoranalyzer\\ipl.json"));

        // Apply censorship rules
        for (JsonNode m : matches) {

            ObjectNode obj = (ObjectNode) m;

            obj.put("team1",
                    CensorUtil.maskTeam(m.get("team1").asText()));

            obj.put("team2",
                    CensorUtil.maskTeam(m.get("team2").asText()));

            obj.put("player_of_match",
                    CensorUtil.redactPlayer());
        }

        // Write censored JSON output
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File("ipl_censored.json"), matches);

        System.out.println("IPL JSON censored successfully!");
    }
}
