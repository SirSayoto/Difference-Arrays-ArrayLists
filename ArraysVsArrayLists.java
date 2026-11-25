import java.util.ArrayList;
import java.util.Arrays;

/**
   Project: Difference-Arrays-ArrayLists
   This program demonstrates the main differences between an array
   and an ArrayList in Java, using the same set of exam scores.
*/
public class ArraysVsArrayLists
{
   public static void main(String[] args)
   {
      // ---------------------------------------------------------------
      // DIFFERENCE 1: Size
      // An array has a FIXED size that is set when it is created.
      // An ArrayList starts empty and GROWS as elements are added.
      // ---------------------------------------------------------------
      double[] scoresArray = new double[3];              // exactly 3 slots, forever
      ArrayList<Double> scoresList = new ArrayList<>();  // size 0, can grow

      // ---------------------------------------------------------------
      // DIFFERENCE 2: Element types
      // An array can hold primitive types directly (double).
      // An ArrayList can only hold objects, so it uses the wrapper
      // class Double. Java converts double <-> Double automatically
      // (auto-boxing).
      // ---------------------------------------------------------------

      // ---------------------------------------------------------------
      // DIFFERENCE 3: Adding and setting elements
      // Array: use [index] to set each slot.
      // ArrayList: use add() to append a new element.
      // ---------------------------------------------------------------
      scoresArray[0] = 88.5;
      scoresArray[1] = 92.0;
      scoresArray[2] = 79.5;

      scoresList.add(88.5);
      scoresList.add(92.0);
      scoresList.add(79.5);

      // ---------------------------------------------------------------
      // DIFFERENCE 4: Getting the size
      // Array: length is a field (no parentheses).
      // ArrayList: size() is a method (with parentheses).
      // ---------------------------------------------------------------
      System.out.println("Array length: " + scoresArray.length);
      System.out.println("ArrayList size: " + scoresList.size());

      // ---------------------------------------------------------------
      // DIFFERENCE 5: Growing
      // ArrayList: just call add() again; it grows automatically.
      // Array: cannot grow. Writing scoresArray[3] would cause an
      // ArrayIndexOutOfBoundsException at run time. To "grow" an
      // array, we must make a bigger copy with Arrays.copyOf.
      // ---------------------------------------------------------------
      scoresList.add(95.0);
      scoresArray = Arrays.copyOf(scoresArray, 4);  // new array, 4 slots
      scoresArray[3] = 95.0;

      System.out.println();
      System.out.println("After adding a fourth score:");
      System.out.println("Array length: " + scoresArray.length);
      System.out.println("ArrayList size: " + scoresList.size());

      // ---------------------------------------------------------------
      // DIFFERENCE 6: Accessing and changing elements
      // Array: scoresArray[i]
      // ArrayList: scoresList.get(i) and scoresList.set(i, value)
      // ---------------------------------------------------------------
      scoresArray[2] = 81.0;
      scoresList.set(2, 81.0);
      System.out.println();
      System.out.println("Third score (array): " + scoresArray[2]);
      System.out.println("Third score (ArrayList): " + scoresList.get(2));

      // ---------------------------------------------------------------
      // DIFFERENCE 7: Removing elements
      // ArrayList: remove(i) deletes the element and shifts the rest.
      // Array: has no remove method; the programmer must shift
      // elements by hand and keep track of the new size.
      // ---------------------------------------------------------------
      scoresList.remove(0);  // removes 88.5, list shrinks to 3

      int currentSize = scoresArray.length;
      for (int i = 0; i < currentSize - 1; i++)  // shift left by hand
      {
         scoresArray[i] = scoresArray[i + 1];
      }
      currentSize--;  // array still has 4 slots; we only use 3

      // ---------------------------------------------------------------
      // SIMILARITY: Both can be traversed with loops.
      // The enhanced for loop works for both.
      // ---------------------------------------------------------------
      System.out.println();
      System.out.println("After removing the first score:");
      System.out.print("Array (first " + currentSize + " of "
         + scoresArray.length + " slots used): ");
      for (int i = 0; i < currentSize; i++)
      {
         System.out.print(scoresArray[i] + " ");
      }
      System.out.println();

      System.out.print("ArrayList (size " + scoresList.size() + "): ");
      for (double score : scoresList)
      {
         System.out.print(score + " ");
      }
      System.out.println();

      // ---------------------------------------------------------------
      // DIFFERENCE 8: Printing
      // Printing an array directly shows a memory reference, so we
      // use Arrays.toString. An ArrayList prints its contents directly.
      // Notice the array still shows 4 values: the last slot keeps the
      // old 95.0 because an array cannot shrink. The ArrayList shows 3.
      // ---------------------------------------------------------------
      System.out.println();
      System.out.println("Arrays.toString(array): " + Arrays.toString(scoresArray));
      System.out.println("ArrayList printed directly: " + scoresList);
   }
}
