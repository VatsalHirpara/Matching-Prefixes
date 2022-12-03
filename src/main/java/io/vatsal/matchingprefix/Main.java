package io.vatsal.matchingprefix;

import io.vatsal.matchingprefix.driver.MatchingPrefixDriver;
import io.vatsal.matchingprefix.model.Trie;
import io.vatsal.matchingprefix.strategy.MatchingPrefixTrieStrategy;
import io.vatsal.matchingprefix.util.OutputPrinter;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = args.length == 1 ? args[0] : "input_files/sample_prefixes.txt";
        MatchingPrefixDriver matchingPrefixDriver = new MatchingPrefixDriver(new MatchingPrefixTrieStrategy(new Trie()), new OutputPrinter());
        matchingPrefixDriver.preProcessInputDataFromFile(inputFilePath);
        matchingPrefixDriver.startApplication();
    }
}