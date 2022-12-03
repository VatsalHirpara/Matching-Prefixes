Execute following command to compile and generate executable jar:

```mvn clean install```

change directory to taget folder and run jar.

Input filepath can be passed as command line argument.

``` 
cd target
java -jar .\matching-prefixes-truecaller-1.0.0.jar ../input_files/sample_prefixes.txt
```


###Details about implementation :

abstraction of MatchingPrefixStrategy interface is created so that different type of algorithms can be
used to find the longest prefix without changing existing code.

MatchingPrefixTrieStrategy class implements MatchingPrefixStrategy interface. Trie data structure is used to store prefixes.

###Time complexity:

Building Trie:

O(n*k) where n is number of prefixes and k is max length of a prefix


Searching for longest prefix: 

O(k), where k is length of a given word

###Further improvements possible:

- Files.readAllLines() to read files would consume large memory, so FileInputStream could be used so that all lines
of files are not loaded into memory
- custom exceptions and handler can be added
- logger instead of System.out.println can be used
- more unit tests