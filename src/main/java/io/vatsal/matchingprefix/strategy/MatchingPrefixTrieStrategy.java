package io.vatsal.matchingprefix.strategy;

import io.vatsal.matchingprefix.model.Trie;
import io.vatsal.matchingprefix.util.OutputPrinter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MatchingPrefixTrieStrategy implements MatchingPrefixStrategy {
    private final Trie trie;
    private final OutputPrinter outputPrinter;

    public MatchingPrefixTrieStrategy(final Trie trie) {
        this.trie = trie;
        outputPrinter = new OutputPrinter();
    }

    @Override
    public void preProcessInputDataFromFile(String filename) {
        try {
            Files.readAllLines(Paths.get(filename)).forEach(this.trie::insert);
            outputPrinter.printDataPreProcessedFromFile(filename);
        } catch (IOException e) {
            outputPrinter.printNoSuchFileExist(filename);
            System.exit(0);
        }
    }

    @Override
    public String findLongestPrefix(String word) {
        return trie.findLongestPrefix(word);
    }

}
