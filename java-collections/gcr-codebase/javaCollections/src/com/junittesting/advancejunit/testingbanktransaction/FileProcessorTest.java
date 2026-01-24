package com.junittesting.advancejunit.testingbanktransaction;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// JUnit 4 test class for FileProcessor
public class FileProcessorTest {

    FileProcessor processor = new FileProcessor();

    @Test
    public void testWriteAndReadFile() throws IOException {
        String file = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-collections\\gcr-codebase\\javaCollections\\src\\com\\junittesting\\advancejunit\\text.txt";
        processor.writeToFile(file, "JUnit4");
        assertTrue(Files.exists(Path.of(file)));
        assertEquals("JUnit4", processor.readFromFile(file));
    }

    @Test(expected = IOException.class)
    public void testFileNotFound() throws IOException {
        processor.readFromFile("missing.txt");
    }
}
