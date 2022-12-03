package io.vatsal.matchingprefix.util;

public class OutputPrinter {
    public void printNoPrefixExistForWord(String word) {
        printWithNewLine("No prefix exist for word: " + word);
        printWithNewLine("------------------------------------------------------------");
    }

    public void printLongestPrefixForWord(String word, String longestPrefix) {
        printWithNewLine("Longest prefix for a word " + word + " is: " + longestPrefix);
        printWithNewLine("------------------------------------------------------------");
    }

    public void printNoSuchFileExist(final String fileName) {
        printWithNewLine("No such file exists : " + fileName + " Please enter valid filename and run again");
    }

    public void printDataPreProcessedFromFile(String filename) {
        printWithNewLine("Input Data has been pre-processed from file: " + filename);
    }

    public void printEnterInput() {
        printWithNewLine("Enter word and press enter:");
    }

    public void printWithNewLine(final String msg) {
        System.out.println(msg);
    }
}
