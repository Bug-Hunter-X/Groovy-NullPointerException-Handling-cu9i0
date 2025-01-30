# Groovy NullPointerException Handling

This example demonstrates a common issue in Groovy: unexpected `NullPointerException`s when dealing with potentially null values.

Groovy's flexible typing allows for null values to be passed to methods without explicit type checking.  However, this can lead to runtime errors if the method attempts to perform operations on these null values.

The `bug.groovy` file shows a method that doesn't handle null parameters properly. The `bugSolution.groovy` file provides a corrected version.

## How to reproduce

1. Save the code in `bug.groovy`.
2. Run the script using Groovy.
3. Observe the behavior with different input values, especially `null` values.

## Solution

The solution involves adding explicit null checks before performing any operations that could potentially throw a `NullPointerException`.  This ensures the method gracefully handles null input values.