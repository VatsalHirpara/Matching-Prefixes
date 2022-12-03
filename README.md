### Problem statement:
Given a list of string prefixes of variable length, the task is to implement a method that takes a string as a parameter,
and returns the longest prefix that matches the input string. A prefix matches if the input string starts with that prefix.
The list of prefixes to match should be taken as configuration by your solution. We’ve provided you with sample data that
you can use. It is not sufficient for your solution to do a linear scan of the list of prefixes.

#### Sample Data
input_files/sample_prefixes.txt is a list of prefixes, one per line, that can be used to test your implementation. Please use these in your
submission, but keep in mind that your solution should work with any list of prefixes.


### How to execute?

Execute following command to compile and generate executable jar:

```mvn clean install```


change directory to taget folder and run jar.

Input filepath can be passed as command line argument.

``` 
cd target
java -jar .\matching-prefixes-truecaller-1.0.0.jar ../input_files/sample_prefixes.txt
```


### Details about implementation :

abstraction of MatchingPrefixStrategy interface is created so that different type of algorithms can be
used to find the longest prefix without changing existing code.

MatchingPrefixTrieStrategy class implements MatchingPrefixStrategy interface. Trie data structure is used to store prefixes.

### Time complexity:

Building Trie:

O(n*k) where n is number of prefixes and k is max length of a prefix


Searching for longest prefix: 

O(k), where k is length of a given word

### Further improvements possible:

- Files.readAllLines() to read files would consume large memory, so FileInputStream could be used so that all lines
of files are not loaded into memory
- custom exceptions and handler can be added
- logger instead of System.out.println can be used
- more unit tests
