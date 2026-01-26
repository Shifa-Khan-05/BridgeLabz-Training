package jsonDataHandling.iplandcensoranalyzer;

import java.io.*;

public class IplCsvCensor {

    public static void main(String[] args) {

        String inputFile =
            "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\jsonDataHandling\\src\\jsonDataHandling\\iplandcensoranalyzer\\ipl.csv";

        String outputFile =
            "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\jsonDataHandling\\src\\jsonDataHandling\\iplandcensoranalyzer\\ipl_censored.csv";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            // Write header
            bw.write(br.readLine());
            bw.newLine();

            String line;
            while ((line = br.readLine()) != null) {

                String[] d = line.split(",");

                // Mask team names
                d[1] = CensorUtil.maskTeam(d[1]);
                d[2] = CensorUtil.maskTeam(d[2]);

                // Redact player of match (CORRECT INDEX)
                d[6] = "REDACTED";

                bw.write(String.join(",", d));
                bw.newLine();
            }

            System.out.println("IPL CSV censored successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
