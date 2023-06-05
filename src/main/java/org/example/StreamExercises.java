package org.example;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
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
    List<String> getFullNames(Stream<ClientAccount> accounts) {
        return accounts.map(account -> account.getFirstName() + " " + account.getLastName())
                .collect(Collectors.toList());
    }

    public Set<CardType> getAllUsedCreditCardTypes(Stream<ClientAccount> accounts) {
        return accounts.flatMap(account -> Stream.of(account.getCardTypes().split(",")))
                .map(CardType::valueOf)
                .collect(Collectors.toSet());
    }

    public List<String> getDistinctCities(Stream<ClientAccount> accounts) {
        return accounts.map(ClientAccount::getCity)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<ClientAccount> sortByAge(Stream<ClientAccount> accounts) {
        return accounts.sorted(Comparator.comparingInt(ClientAccount::getAge))
                .collect(Collectors.toList());
    }
}
