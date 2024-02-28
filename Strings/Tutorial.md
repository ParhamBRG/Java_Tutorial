## Java Strings

Imagine a string of beads, each bead representing a character. In Java, **Strings** are like these bead strings, only the beads are individual **letters**, **numbers**, **symbols**, or **even spaces**. They store **textual** information like names, messages, etc.

**Example:** `"Hello, World!"` is a string containing 13 characters.

#### **Unchanging Strings**

Unlike some other data types, Java **cannot directly modify** a string once it's created. This is called **immutability**. If you try to change a string, Java creates a new one instead.

**Example:**

```java
String name = "Alice";
// Attempt to change:
name += " Bob"; // This won't change the original "Alice"
```

#### Declaration and Initialization

There are two main ways to create strings:

* **String literals:** These are the simplest, created directly using double quotes: `"This is a string literal."`
* **`new String()` constructor:** This method allows creating strings from other sources like character arrays.

#### **Joining Strings**

Want to combine two strings? Use the **`+` operator**:

```java
String greeting = "Hello";
String name = "John";
String message = greeting + " " + name; // message becomes "Hello John"
```

There's also the **`concat()` method** for joining, but it doesn't change the original strings.

#### **String Methods**

The `String` class comes with many helpful methods:

* **`length()`:** Tells you how many characters are in the string.
* **`charAt(index)`:** Lets you peek at a specific character (like looking at a specific bead).
* **`isEmpty()`:** Checks if the string has no characters (like an empty bead string).
* **`equals(anotherString)`:** Compares two strings to see if they have the same exact letters (case-sensitive).
* **`toUpperCase()` and `toLowerCase()`:** Change all characters to uppercase or lowercase, respectively.
* **Many more:** Explore the Java documentation to discover more methods!

#### **Formatting**

Want to create fancy output with strings and other data types? Use the `printf()` or `format()` methods!

**Example:**

```java
String name = "Emily";
int age = 25;
System.out.printf("Hi, I'm %s and I'm %d years old.\n", name, age);
```

This will print "Hi, I'm Emily and I'm 25 years old."

#### **Tips**

* Special codes like `\n` (newline) and `\"` (double quote) can be used within strings.
* Remember, the single character `char` is like a single bead, while a `String` is the whole bead string.

## Exercises

**Beginner Level:**

* Declare strings containing your name, favorite quote, and a funny fact using string literals.
* Combine the strings from exercise 1 using the `+` operator.
* Use the `length()` method to find the length of each string.
* Extract and print the first character from each string using `charAt(0)`.
* Create strings with your name in lowercase and uppercase.
* Compare them using `equals()` (case-sensitive) and print the result.
* Compare them again after converting both to lowercase using `toLowerCase()`.

**Intermediate Level:**

* Create a string containing a sentence.
* Use `indexOf()` to find the position of a specific word.
* Check for "-1" and print an appropriate message if the word is not found.
* Use `printf()` to create a formatted string displaying your name, age, and favorite color.
* Choose two string methods from the documentation and experiment with them. Create examples demonstrating their functionality.

**Advanced Level:**

* Write a program that takes a user input string and prints its reversed version using a loop, `charAt()`, and `concat()`.
* Write a program that prompts the user for an email address and checks for "@" and "." using string methods. Print an appropriate message based on the validation result.
