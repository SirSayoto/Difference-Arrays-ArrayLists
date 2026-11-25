# Difference-Arrays-ArrayLists

CSC262 Java Programming – Discussion 3: Array vs. ArrayList

## Arrays and ArrayLists in Java

Both arrays and ArrayLists enable programmers to store multiple values in one variable. Storing values in an array or ArrayList can reduce development time by eliminating the need to assign unique names to all values used in a program. Array and ArrayList elements are stored by index number, starting at zero (Horstmann, 2016).

An array is a fixed collection of values of the same data type. You specify the size of the array when creating one, as in `double[] scores = new double[3];`. You cannot add or remove slots from an array. You can retrieve and modify array values using square brackets, as in `scores[0]` (Horstmann, 2016, Section 6.1). ArrayList is a built-in Java class for creating collections that can be resized. When created, an ArrayList object has a size of zero. You can add values to an ArrayList object using the `add()` method. Other useful ArrayList methods are `get()`, `set()`, `remove()`, and `size()` (Horstmann, 2016, Section 6.8).

## Conceptual Differences

1. **Size:** Arrays are fixed-size, while ArrayLists are dynamically resizable. To increase the size of an array, you can use `Arrays.copyOf` to copy it to an array of greater size.
2. **Element types:** Arrays can contain primitive data types like `double`. Collections like ArrayLists can contain only objects. Values stored in an `ArrayList<Double>` are actually Java `Double` objects. Automatic conversions exist between `double` and `Double` in the Java language.
3. **Syntax:** Arrays are accessed using `[]` and the `length` field. ArrayLists are accessed using methods such as `get(i)` and `size()`.
4. **Adding and removing:** ArrayList has `add()` and `remove()` methods. When the programmer wants to add or remove items from an array, he or she must implement custom add and remove functionality and track unused array positions.

In general, I would use an array if there is a known number of elements, such as 12 months in a year. I would use an ArrayList if there is an unknown number of elements, such as input until Q is entered.

## The Program

My program, `ArraysVsArrayLists.java`, added exam scores to an array and an ArrayList. It also removed or modified some of the scores in these data structures. Comments in the source code explain the differences between arrays and ArrayLists. When I removed a score, my program displayed 3 items from the ArrayList and 4 items from the array. The differing sizes of the two data structures highlight a difference between them.

To compile and run:

```
javac ArraysVsArrayLists.java
java ArraysVsArrayLists
```

## Reference

Horstmann, C. S. (2016). *Big Java late objects* (2nd ed.). Wiley Global Education US. https://nu.vitalsource.com/books/9781119321071
