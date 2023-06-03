package org.example;


public class Main {
    static final String FILE_PATH = "src/main/resources/client_accounts.csv";

    public static void main(String[] args) {
        StreamExercises exercise = new StreamExercises(FILE_PATH);
        exercise.readFile().forEach(System.out::println);
    }
}