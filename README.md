[![Build Status](https://travis-ci.org/Numichi/CodeChallenge.svg?branch=master)](https://travis-ci.org/Numichi/CodeChallenge)

# Interviews
I was some companies in an interview and I got programming tasks. I try reproduce those here.

### Epam [website](https://www.epam.com/)
Simple task, look test class.

### Tigra [website](http://www.tigra.hu/en/)
Implement IList interfaces and ...Node classes.
Skeleton structure was exist.

# LeetCode [website](https://leetcode.com/problemset/all/)

### Easy problems
- [1. Two Sum](https://leetcode.com/problems/two-sum/description/)
- [7. Reverse Integer](https://leetcode.com/problems/reverse-integer/description/)
- [9. Palindrome Number](https://leetcode.com/problems/palindrome-number/description/)
- [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/description/)
- [14. Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/description/)
- [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/description/)
- [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/)
- [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/)
- [27. Remove Element](https://leetcode.com/problems/remove-element/description/) *(be stay ordered array and don't modify array length)*

### Medium problems
- [2. Add Two Numbers](https://leetcode.com/problems/add-two-numbers/description/)
- [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)
- [5. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/description/)
- [8. String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/description/)
- [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/description/)
- [12. Integer to Roman](https://leetcode.com/problems/integer-to-roman/description/)
- [17. Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/)
- [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)

### Hard problems
- [4. Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/description/) *(it was easy... ^^)*

# Tree
```
.
├── CodeChallenge.iml
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   └── java
│   │       ├── interviews
│   │       │   ├── epam
│   │       │   │   └── Task.java
│   │       │   └── tigra
│   │       │       ├── AbstractListNode.java
│   │       │       ├── DoubleLinkedList.java
│   │       │       ├── DoubleLinkedListNode.java
│   │       │       ├── IList.java
│   │       │       ├── IListNode.java
│   │       │       ├── NoRefLinkedList.java
│   │       │       ├── NoRefLinkedListNode.java
│   │       │       ├── SingleLinkedList.java
│   │       │       └── SingleLinkedListNode.java
│   │       ├── leetcode
│   │       │   ├── easy
│   │       │   │   ├── exceptions
│   │       │   │   │   └── CantCutException.java
│   │       │   │   ├── LongestCommonPrefix.java
│   │       │   │   ├── MergeTwoSortedLists.java
│   │       │   │   ├── PalindromeNumber.java
│   │       │   │   ├── RemoveDuplicatesFromSortedArray.java
│   │       │   │   ├── RemoveElement.java
│   │       │   │   ├── ReverseInteger.java
│   │       │   │   ├── RomanToInteger.java
│   │       │   │   ├── TwoSum.java
│   │       │   │   └── ValidParentheses.java
│   │       │   ├── hard
│   │       │   │   └── MediaOofTwoSortedArrays.java
│   │       │   └── medium
│   │       │       ├── AddTwoNumbers.java
│   │       │       ├── ContainerWithMostWater.java
│   │       │       ├── IntegerToRoman.java
│   │       │       ├── LetterCombinationsOfAPhoneNumber.java
│   │       │       ├── LongestPalindromicSubstring.java
│   │       │       ├── LongestSubstringWithoutRepeatingCharacters.java
│   │       │       ├── RemoveNthNodeFromEndOfList.java
│   │       │       └── StringtoInteger.java
│   │       └── utils
│   │           └── ListNode.java
│   └── test
│       └── java
│           ├── interviews
│           │   ├── epam
│           │   │   └── TaskTest.java
│           │   └── tigra
│           │       └── TaskTest.java
│           └── leetcode
│               ├── easy
│               │   ├── LongestCommonPrefixTest.java
│               │   ├── MergeTwoSortedListsTest.java
│               │   ├── PalindromeNumberTest.java
│               │   ├── RemoveDuplicatesFromSortedArrayTest.java
│               │   ├── RemoveElementTest.java
│               │   ├── ReverseIntegerTest.java
│               │   ├── RomanToIntegerTest.java
│               │   ├── TwoSumTest.java
│               │   └── ValidParenthesesTest.java
│               ├── hard
│               │   └── MediaOofTwoSortedArraysTest.java
│               └── medium
│                   ├── AddTwoNumbersTest.java
│                   ├── ContainerWithMostWaterTest.java
│                   ├── IntegerToRomanTest.java
│                   ├── LetterCombinationsOfAPhoneNumberTest.java
│                   ├── LongestPalindromicSubstringTest.java
│                   ├── LongestSubstringWithoutRepeatingCharactersTest.java
│                   ├── RemoveNthNodeFromEndOfListTest.java
│                   └── StringtoIntegerTest.java
└── target
    ├── classes
    │   ├── interviews
    │   │   ├── epam
    │   │   │   └── Task.class
    │   │   └── tigra
    │   │       ├── AbstractListNode.class
    │   │       ├── DoubleLinkedList.class
    │   │       ├── DoubleLinkedListNode.class
    │   │       ├── IList.class
    │   │       ├── IListNode.class
    │   │       ├── NoRefLinkedList.class
    │   │       ├── NoRefLinkedListNode.class
    │   │       ├── SingleLinkedList.class
    │   │       └── SingleLinkedListNode.class
    │   ├── leetcode
    │   │   ├── easy
    │   │   │   ├── exceptions
    │   │   │   │   └── CantCutException.class
    │   │   │   ├── LongestCommonPrefix.class
    │   │   │   ├── MergeTwoSortedLists.class
    │   │   │   ├── PalindromeNumber.class
    │   │   │   ├── RemoveDuplicatesFromSortedArray.class
    │   │   │   ├── RemoveElement.class
    │   │   │   ├── ReverseInteger.class
    │   │   │   ├── RomanToInteger.class
    │   │   │   ├── TwoSum.class
    │   │   │   └── ValidParentheses.class
    │   │   ├── hard
    │   │   │   └── MediaOofTwoSortedArrays.class
    │   │   └── medium
    │   │       ├── AddTwoNumbers.class
    │   │       ├── ContainerWithMostWater.class
    │   │       ├── IntegerToRoman.class
    │   │       ├── LetterCombinationsOfAPhoneNumber.class
    │   │       ├── LongestPalindromicSubstring.class
    │   │       ├── LongestSubstringWithoutRepeatingCharacters.class
    │   │       ├── RemoveNthNodeFromEndOfList.class
    │   │       └── StringtoInteger.class
    │   └── utils
    │       └── ListNode.class
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    └── test-classes
        ├── interviews
        │   ├── epam
        │   │   └── TaskTest.class
        │   └── tigra
        │       └── TaskTest.class
        └── leetcode
            ├── easy
            │   ├── LongestCommonPrefixTest.class
            │   ├── MergeTwoSortedListsTest.class
            │   ├── PalindromeNumberTest.class
            │   ├── RemoveDuplicatesFromSortedArrayTest.class
            │   ├── RemoveElementTest.class
            │   ├── ReverseIntegerTest.class
            │   ├── RomanToIntegerTest.class
            │   ├── TwoSumTest$1.class
            │   ├── TwoSumTest.class
            │   ├── TwoSumTest$Model.class
            │   └── ValidParenthesesTest.class
            ├── hard
            │   └── MediaOofTwoSortedArraysTest.class
            └── medium
                ├── AddTwoNumbersTest.class
                ├── ContainerWithMostWaterTest.class
                ├── IntegerToRomanTest.class
                ├── LetterCombinationsOfAPhoneNumberTest.class
                ├── LongestPalindromicSubstringTest.class
                ├── LongestSubstringWithoutRepeatingCharactersTest.class
                ├── RemoveNthNodeFromEndOfListTest.class
                ├── RemoveNthNodeFromEndOfListTest$Data.class
                └── StringtoIntegerTest.class

44 directories, 106 files
```
