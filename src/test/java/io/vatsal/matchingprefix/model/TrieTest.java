package io.vatsal.matchingprefix.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TrieTest {

    private Trie trie;

    @Before
    public void setUp() {
        this.trie = new Trie();
        List<String> prefixes = List.of("a", "ab", "abc", "b", "bc", "bcd");
        prefixes.forEach(trie::insert);
    }

    @Test
    public void testTrieFindLongestPrefix() {
        String word = "bcx";
        String longestPrefix = "bc";
        Assert.assertEquals(longestPrefix, trie.findLongestPrefix(word));
    }

    @Test
    public void testTrieFindLongestPrefixNull() {
        String word = "zyx";
        Assert.assertNull(trie.findLongestPrefix(word));
    }

}
