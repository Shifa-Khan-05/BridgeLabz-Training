package jsonDataHandling.mergejson;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class MergeJsonFiles {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 =
                (ObjectNode) mapper.readTree(new File("json1.json"));

        ObjectNode json2 =
                (ObjectNode) mapper.readTree(new File("json2.json"));

        // Merge json2 into json1
        json1.setAll(json2);

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File("merged.json"), json1);

        System.out.println("✅ JSON files merged successfully!");
    }
}
