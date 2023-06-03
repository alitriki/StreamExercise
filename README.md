
# Java Streams Exercise with CSV Data

This exercise is designed to help you practice using Java Streams. You will be working with a CSV file. 
You will learn how to read and process the CSV data using Java Streams, and practice using different operations on streams.

## Exercise Instructions

### Step 1: Set up

1. Ensure that you have Java Development Kit (JDK) installed on your computer.
2. Set up a Java project in your favorite Integrated Development Environment (IDE).

### Step 2: Download the CSV file

1. Clone this project.
2. Ensure that the Code compiles.

### Step 3: Implement the exercises

1. Create a new Java class called `StreamExercises`.
2. Inside the class, implement the following methods:

   #### 1. `readFile()`

   This method reads all the lines in the csv file and returns a stream of ClientAccount objects. 
   There are many ways to do this task in java, but for simplicity you can use the opencsv library already included in this project as a Maven dependency.

   #### 2. `List<String> getFullNames(Stream<ClientAccount> accounts)`

   This method takes a stream of client accounts as input. It maps each account to a full name by concatenating the first name and last name, and returns a new list of full names. Use the `map` operation to implement this method.

   #### 3. `Set<CardType> getAllUsedCreditCardTypes(Stream<ClientAccount> accounts)`

   This method takes a stream of client accounts as input. It maps each account to credit card types and flattens the stream to get a set of the unique credit card types in use. Use the `flatMap` operation to implement this method.

   #### 4. `List<String> getDistinctCities(Stream<ClientAccount> accounts)`

   This method takes a stream of client accounts as input. It extracts distinct city names from the accounts and returns a new list of distinct cities. Use the `map` and `distinct` operations to implement this method.

   #### 5. `List<ClientAccount> sortByAge(Stream<ClientAccount> accounts)`

   This method takes a stream of client accounts as input. It sorts the accounts based on the age in ascending order and returns a new list of sorted accounts. Use the `sorted` operation to implement this method.

   #### 6. `ClientAccount getYoungestPerson(Stream<ClientAccount> accounts)`

   This method takes a stream of client accounts as input. It finds the youngest person by age and returns their full name as a `String`. Use the `reduce` operation to find the youngest person.

   #### 7. `int getClientWithHighestBalanceId(Stream<ClientAccount> accounts)`

   This method takes a stream of client accounts as input. It finds the client with the highest balance and returns their id. Use the `max` and `map` operations to implement this method.

   #### 8. `Long getAmexUsersBalanceSum(Stream<ClientAccount> accounts)`

   This method takes a stream of client accounts as input. It sums the balance of all the clients with Amex cards. Use the `filter`, `map` and `reduce` operations to implement this method.
  
   #### 9. `List<Integer> getAccountsWithWrongDateIds(Stream<ClientAccount> accounts)`

   This method takes a stream of client accounts as input. It returns the ids of the account that were created with a future date. Use the `filter` and `map` operations to implement this method.
   
   #### 10. `Map<String, Long> getBalanceSumByColorPick(Stream<ClientAccount> accounts)`

   This method takes a stream of client accounts as input. It groups the accounts by color pick and gets the sum of account balances by color. Use the `Collectors.groupingBy` operation to implement this method.

3. In the `main` method of the `StreamExercises` class, read the CSV file, parse the lines, and call each method to test its functionality.

## Additional Resources

To learn more about working with CSV data, Java Streams, and different stream operations, you can refer to the following resources:

- [Java Streams Tutorial](https://www.baeldung.com/java-8-streams)

