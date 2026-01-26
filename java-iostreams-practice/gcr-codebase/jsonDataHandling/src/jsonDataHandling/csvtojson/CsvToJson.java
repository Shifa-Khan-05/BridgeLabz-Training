package jsonDataHandling.csvtojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.*;

public class CsvToJson {

    public static void main(String[] args) throws Exception {

        String csvFile =
            "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\jsonDataHandling\\src\\jsonDataHandling\\csvtojson\\users.csv";

        String jsonFile =
            "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\jsonDataHandling\\src\\jsonDataHandling\\csvtojson\\users.json";

        ObjectMapper mapper = new ObjectMapper();
        ArrayNode array = mapper.createArrayNode();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            // Read CSV header
            String[] headers = br.readLine().split(",");
            String line;

            // Read CSV rows
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                ObjectNode obj = mapper.createObjectNode();
                for (int i = 0; i < headers.length; i++) {
                    obj.put(headers[i], data[i]);
                }

                array.add(obj);
            }
        }

        // Write JSON with pretty formatting
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File(jsonFile), array);

        System.out.println(" CSV converted to JSON successfully!");
    }
}
