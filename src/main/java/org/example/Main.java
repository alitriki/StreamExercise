package org.example;


import java.util.Map;
import java.util.stream.Stream;

public class Main {
    static final String FILE_PATH = "src/main/resources/client_accounts.csv";

    public static void main(String[] args) {
        StreamExercises exercise = new StreamExercises(FILE_PATH);
        Stream<ClientAccount> clientAccountStream = exercise.readFile();
        Map<String, Long> balanceSumByColorPick = exercise.getBalanceSumByColorPick(clientAccountStream);
        balanceSumByColorPick.forEach((key, value) -> System.out.println(key + " " + value));
    }
}