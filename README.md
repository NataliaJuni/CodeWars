# CodeWars

1. NestedBrackets   6 kyu 
Maximum Depth of Nested Brackets


Given a balanced string with brackets like: "AA(XX((YY))(U))" find the substrings that are enclosed in the greatest depth.

Therefore, answer: { "YY" } since the substring "YY" is locked at the deepest level.
If several substring are at the deepest level, return them all in a list in order of appearance.

The string includes only uppercase letters, parenthesis '(' and ')'.
If the input is empty or doesn't contain brackets, an array containing only the original string must be returned.

2. [6 kyu] Floating-point Approximation (II)
Given
a semi-inclusive interval I = [l, u) (l is in interval I but u is not) l and u being floating numbers (0 <= l < u),
an integer n (n > 0)
a function f: x (float number) -> f(x) (float number)
we want to return as a list the n values:
f(l), f(l + d), ..., f(u -d) where d = (u - l) / n
or as a string (Bash, Nim):
"f(l), f(l + d), ..., f(u -d)" where d = (u - l) / n
Call this function interp:
interp(f, l, u, n) -> [f(l), f(l + d), ..., f(u - d)]
The n resulting values f(l), f(l + d), ..., f(u - d) will be floored to two decimals (except Shell and Nim: see below).
For that you can use: floor(y * 100.0) / 100.0.

3.[6 kyu] Floating-point Approximation (I)
Consider the function
f: x -> sqrt(1 + x) - 1 at x = 1e-15.
We get: f(x) = 4.44089209850062616e-16
or something around that, depending on the language.
This function involves the subtraction of a pair of similar numbers when x is near 0 and the results are significantly erroneous in this region. Using pow instead of sqrt doesn't give better results.
A "good" answer is 4.99999999999999875... * 1e-16.
Can you modify f(x) to give a good approximation of f(x) in the neighborhood of 0?

4. [6 kyu] SpinWords Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (like the name of this kata).
 Strings passed in will consist of only letters and spaces.
 Spaces will be included only when more than one word is present.
    
5. [6 kyu] Array.diff
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.