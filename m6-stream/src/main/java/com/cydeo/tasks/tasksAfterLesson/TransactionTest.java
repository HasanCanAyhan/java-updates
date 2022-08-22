package com.cydeo.tasks.tasksAfterLesson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TransactionTest {

    public static void main(String[] args) { // Task2 page of slide is 17

        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");


        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );

        //1. Find all transactions in the year 2011 and sort them by value(small to high)

        System.out.println("1 : ");

        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        //2. What are all the unique cities where the traders work?

        System.out.println("2 : ");
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println );

        System.out.println("-----------------------------------------------");

        //3. Find all traders from Cambridge and sort them by name.

        System.out.println("3 : ");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .sorted()
                .distinct()
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        //4. Return a string of all traders’ names sorted alphabetically.


        System.out.println("4 : ");
        Stream<String> str = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .distinct();

        str.forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        //5. Are any traders based in Milan?
        System.out.println("5 : ");

        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Milan"))
                .map(Trader::getName)
                .distinct()
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        //6. Print the values of all transactions from the traders living in Cambridge.
        System.out.println("6 : ");

        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        //7. What is the highest value of all the transactions?
        System.out.println("7 : ");

        int maxValue = transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.comparing(Integer::intValue)).get();

        System.out.println("maxValue = " + maxValue);

        System.out.println("-----------------------------------------------");

        //8. Find the transaction with the smallest value.
        System.out.println("8 : ");

        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .limit(1)
                .forEach(System.out::println);

    }

}
