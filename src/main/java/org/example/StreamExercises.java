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
        try {
            return new CsvToBeanBuilder(new FileReader(filePath))
                    .withType(ClientAccount.class)
                    .build()
                    .stream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public Set<CardType> getAllUsedCreditCardTypes(Stream<ClientAccount> accounts){
        //TODO Implement this method
        return null;
    }
}
