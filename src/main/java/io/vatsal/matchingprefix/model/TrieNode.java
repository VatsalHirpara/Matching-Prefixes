package io.vatsal.matchingprefix.model;

import java.util.HashMap;

public class TrieNode {
    public HashMap<Character, TrieNode> children = new HashMap<>();
    public boolean isTerminalNode;

    public TrieNode() {
        children = new HashMap<>();
    }

    public TrieNode(HashMap<Character, TrieNode> children, boolean isTerminalNode) {
        this.children = children;
        this.isTerminalNode = isTerminalNode;
    }

    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(HashMap<Character, TrieNode> children) {
        this.children = children;
    }

    public boolean isTerminalNode() {
        return isTerminalNode;
    }

    public void setTerminalNode(boolean terminalNode) {
        isTerminalNode = terminalNode;
    }
}
