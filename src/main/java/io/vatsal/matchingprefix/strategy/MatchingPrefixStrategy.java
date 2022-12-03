package io.vatsal.matchingprefix.strategy;

public interface MatchingPrefixStrategy {
    void preProcessInputDataFromFile(String filename);

    String findLongestPrefix(String word);
}
