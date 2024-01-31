# Bubble Sort Algorithm in Java

Bubble Sort is a straightforward sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

## Algorithm

```
repeat
  swapped = false
  for i = 1 to indexOfLastUnsortedElement-1
    if leftElement > rightElement
      swap(leftElement, rightElement)
      swapped = true
until not swapped
```

## Example

Consider an array of integers: [5, 9, 1, 2, 8, 7, 3]

### First Pass

( 5 9 1 2 8 7 3 ) → ( 5 1 9 2 8 7 3 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.

( 5 1 9 2 8 7 3 ) → ( 5 1 2 9 8 7 3 ), Swap since 9 > 2

( 5 1 2 9 8 7 3 ) → ( 5 1 2 8 9 7 3 ), Swap since 9 > 8

( 5 1 2 8 9 7 3 ) → ( 5 1 2 8 7 9 3 ), Swap since 9 > 7

( 5 1 2 8 7 9 3 ) → ( 5 1 2 8 7 3 9 ), Swap since 9 > 3

### Second Pass

( 5 1 2 8 7 3 9 ) → ( 1 5 2 8 7 3 9 ), Swap since 5 > 1

( 1 5 2 8 7 3 9 ) → ( 1 2 5 8 7 3 9 ), Swap since 5 > 2

( 1 2 5 8 7 3 9 ) → ( 1 2 5 8 7 3 9 ), Now, since these elements are already in order (8 < 7), algorithm does not swap them.

( 1 2 5 8 7 3 9 ) → ( 1 2 5 7 8 3 9 ), Swap since 8 > 7

( 1 2 5 7 8 3 9 ) → ( 1 2 5 7 3 8 9 ), Swap since 8 > 3

### Repeat passes

- Repeat the above steps for array of length n until sorted.

### Complexity

- Worst and Average Case Time Complexity: O(n^2). Worst case occurs when array is reverse sorted.
- Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
- Auxiliary Space: O(1)
- Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
- Sorting In Place: Yes
- Stable: Yes
- Due to its simplicity, bubble sort is often used to introduce the concept of a sorting algorithm.
- In computer graphics it is popular for its capability to detect a very small error (like swap of just two elements) in almost-sorted arrays and fix it with just linear complexity (2n). For example, it is used in a polygon filling algorithm, where bounding lines are sorted by their x coordinate at a specific scan line (a line parallel to x axis) and with incrementing y their order changes (two elements are swapped) only at intersections of two lines.
- Bubble sort should be avoided in the case of large collections. It will not be efficient in the case of a reverse-ordered collection.

## Java Implementation

```java
/**
* Sorts a list of integers using the bubble sort algorithm.
*
* @param integerList The list of integers to be sorted.
  */
  public static void sort(List<Integer> integerList) {

      // Outer loop: controls the number of passes
      for (int lastUnsortedIndex = integerList.size() - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
    
           // Inner loop: compares and swaps adjacent elements
           for (int i = 0; i < lastUnsortedIndex; i++) {
    
               // Compare adjacent elements
               if (integerList.get(i) > integerList.get(i + 1)) {
                   // Swap elements if they are in the wrong order
                   swap(integerList, i, i + 1);
               }
           }
      }
  }

/**
* Swaps two elements in the given list.
*
* @param integerList The list in which elements are to be swapped.
* @param i           The index of the first element.
* @param j           The index of the second element.
  */
  private static void swap(List<Integer> integerList, Integer i, Integer j) {
      if (i.equals(j))
          return;

      // Perform the swap using a temporary variable
      Integer temp = integerList.get(i);
      integerList.set(i, integerList.get(j));
      integerList.set(j, temp);
  }
```

### Usage

```java
public static void main(String[] args) {
      List<Integer> integerList = new ArrayList<>(Arrays.asList(5, 1, 2, 3, 4));
      System.out.println("Unordered list: " + integerList);
      BubbleSort.sort(integerList);
      System.out.println("Ordered list: " + integerList);
  }
```

The result will be:
    
```
Unordered list: [5, 1, 2, 3, 4]
Ordered list: [1, 2, 3, 4, 5]
```