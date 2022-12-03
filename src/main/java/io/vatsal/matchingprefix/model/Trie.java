package io.vatsal.matchingprefix.model;

public class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        if (word == null) return;
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (!node.children.containsKey(ch)) {
                node.children.put(ch, new TrieNode());
            }
            node = node.children.get(ch);
        }
        node.isTerminalNode = true;
    }

    public String findLongestPrefix(String word) {
        StringBuilder prefix = new StringBuilder();
        if (word == null) return null;
        String longestPrefix = null;
        TrieNode node = this.root;
        for (char ch : word.toCharArray()) {
            if (!node.children.containsKey(ch)) break;
            prefix.append(ch);
            node = node.children.get(ch);
            if (node.isTerminalNode) longestPrefix = prefix.toString();
        }
        return longestPrefix;
    }
}