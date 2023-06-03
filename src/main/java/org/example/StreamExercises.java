package org.example;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExercises {
    private String filePath;

    private StreamExercises() {
    }

    public StreamExercises(String filePath) {
        this.filePath = filePath;
    }

    public Stream<ClientAccount> readFile() {
        //TODO Implement this method
        return null;
    }
}
