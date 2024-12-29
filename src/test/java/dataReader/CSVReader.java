package dataReader;

import java.io.FileReader;
import java.io.Reader;

public class CSVReader {



                try {
        // Read CSV data from file
        Reader in = new FileReader("data.csv");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);

        // Iterate through CSV records and fill out the form
        for (CSVRecord record : records) {
            // Extract data from CSV record
            String name = record.get("name");
            String email = record.get("email");


        }
