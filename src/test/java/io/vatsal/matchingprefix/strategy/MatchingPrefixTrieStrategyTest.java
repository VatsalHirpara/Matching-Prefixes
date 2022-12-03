package io.vatsal.matchingprefix.strategy;

import io.vatsal.matchingprefix.model.Trie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MatchingPrefixTrieStrategyTest {

    MatchingPrefixTrieStrategy matchingPrefixTrieStrategy;


    public static final String WORD = "bcx";
    public static final String LONGEST_PREFIX = "bc";

    @Before
    public void setUp() {
        List<String> prefixes = Arrays.asList("a", "ab", "abc", "b", "bc", "bcd");
        final Trie trie = new Trie();
        prefixes.forEach(trie::insert);
        matchingPrefixTrieStrategy = new MatchingPrefixTrieStrategy(trie);
    }

    @Test
    public void findLongestPrefixTest() {
        Assert.assertEquals(LONGEST_PREFIX, matchingPrefixTrieStrategy.findLongestPrefix(WORD));
    }
}
