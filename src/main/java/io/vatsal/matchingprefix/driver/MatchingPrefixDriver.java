package io.vatsal.matchingprefix.driver;

import io.vatsal.matchingprefix.strategy.MatchingPrefixStrategy;
import io.vatsal.matchingprefix.util.OutputPrinter;

import java.util.Scanner;

public class MatchingPrefixDriver {
    private final MatchingPrefixStrategy matchingPrefixStrategy;
    private final OutputPrinter outputPrinter;

    public MatchingPrefixDriver(MatchingPrefixStrategy matchingPrefixStrategy, OutputPrinter outputPrinter) {
        this.matchingPrefixStrategy = matchingPrefixStrategy;
        this.outputPrinter = outputPrinter;
    }

    public void preProcessInputDataFromFile(String filePath) {
        matchingPrefixStrategy.preProcessInputDataFromFile(filePath);
    }

    public void startApplication() {
        Scanner s = new Scanner(System.in);
        while (true) {
            outputPrinter.printEnterInput();
            String word = s.nextLine();
            String longestPrefix = matchingPrefixStrategy.findLongestPrefix(word);
            if (longestPrefix != null) {
                outputPrinter.printLongestPrefixForWord(word, longestPrefix);
            } else {
                outputPrinter.printNoPrefixExistForWord(word);
            }
        }
    }
}
