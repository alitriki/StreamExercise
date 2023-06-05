package org.example;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
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

    public String getYoungestPerson(Stream<ClientAccount> accounts) {
        return accounts
                .reduce((client1, client2) -> client1.getAge() < client2.getAge() ? client1 : client2)
                .map(account -> account.getFirstName() + " " + account.getLastName())
                .orElse("");
    }

    public int getClientWithHighestBalanceId(Stream<ClientAccount> accounts){
        return accounts.max(Comparator.comparingLong(ClientAccount::getAccountBalance))
                .map(ClientAccount::getId)
                .orElse(0);
    }

    public Long getAmexUsersBalanceSum(Stream<ClientAccount> accounts) {
        return accounts.filter(account -> Arrays.asList(account.getCardTypes().split(",")).contains(CardType.AMEX.name()))
                .map(ClientAccount::getAccountBalance)
                .reduce(0L, Long::sum);
    }

    public Map<String, Long> getBalanceSumByColorPick(Stream<ClientAccount> accounts) {
        return accounts.collect(
                Collectors.groupingBy(
                        ClientAccount::getColorPick,
                        Collectors.summingLong(ClientAccount::getAccountBalance))
        );
    }
}
