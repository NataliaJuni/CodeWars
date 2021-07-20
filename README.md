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

