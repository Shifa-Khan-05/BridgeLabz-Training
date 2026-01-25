
package com.intermediatelevel.modifycsv;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class UpdateSalary {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csvDataHandling\\src\\com\\intermediatelevel\\modifycsv\\employees_update.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\csvDataHandling\\src\\com\\intermediatelevel\\modifycsv\\updated_employees.csv"));

        String line = br.readLine();
        bw.write(line); // header
        bw.newLine();

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            if (data[2].equalsIgnoreCase("IT")) {
                double salary = Double.parseDouble(data[3]);
                salary = salary + salary * 0.10;
                data[3] = String.valueOf(salary);
            }

            bw.write(String.join(",", data));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
