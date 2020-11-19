# Практика на работу с Generics

Целью этого практического задания - изучить использование Java Generics путем разработки класса `Pair`, представляющего 
кортеж из двух элементов.

Кортеж - это конечная упорядоченная последовательность элементов. Кортеж из двух элементов содержит два элемента, а 
набор из трех элементов содержит три элемента, набор из n содержит n элементов.

Класс `Pair` может быть полезен в дальнейшем, когда нам нужно хранить данные, которые встречаются в виде упорядоченной пары:
имя и фамилия, двумерные координаты и т.д.

Проблема при разработке этого класса заключается в том, что мы не хотим заранее указывать типы данных элементов.
Цель состоит в том, чтобы разработать один класс `Pair`, который можно было бы использовать для хранения пар объектов любого типа.

## Задание
### Object в качестве типов элементов кортежа

One possible design involves programming the Pair class so that the types of the two elements are declared as Object. 
Since every reference type in Java inherits from Object, this approach will give us the flexibility we want.

Open the following two classes in your favorite IDE:

* ObjectPair.java FINISHED
* ObjectPairDriver.java UNFINISHED

Take a few minutes to read the code, then complete the steps below.

Один из возможных вариантов решения включает разработку класса `Pair` так, чтобы типы двух элементов объявлялись как `Object`.
Поскольку каждый ссылочный тип в **Java** наследуется от `Object`, этот подход даст нам желаемую гибкость.

Откройте следующие два класса, которые находятся в пакете [org.itstep.step01](src/main/java/org/itstep/step01), 
в любой среде разработки (например, в Intellij Idea):

* [ObjectPair.java](src/main/java/org/itstep/step01/ObjectPair.java) ЗАВЕРШЕН
* [ObjectPairDriver.java](src/main/java/org/itstep/step01/ObjectPairDriver.java) НЕЗАКОНЧЕН

Уделите несколько минут, чтобы прочитать код, а затем выполните следующие действия:

1. The provided code compiles, but there is a logic error in the main method that will probably cause the driver to 
crash when largestStadium is passed the stadiums array. Find the problem and fix it.

2. Complete the largestStadium method so that it conforms to the Javadoc comments. 
Test to make sure that it works as expected. 
(HINT: You will need to perform some casts when you retrieve the items from the tuple.)

3. BONUS QUESTION: Why does this line of code compile?

```java
   stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);
```

Notice that the formal and actual parameter types don't match. The expected type of the second parameter is Object 
(a reference type) and the provided argument is 1 (a primitive value). If you don't know the answer to this question Google the term "Autoboxing".

### Generics

1. Create a copy of the `ObjectPair` class named `Pair`. Refactor this class to use Java generics. 
Your updated class should make it possible to independently specify the types of the first and second elements.
2. Create a copy of the `ObjectPairDriver` class named `PairDriver`. Refactor this driver so that it uses your Pair class. 
The functionality should be unchanged. The resulting code should not include any cast operations.
3. BONUS QUESTION: What happens if you re-introduce the problem that you fixed in step 1 from the previous section? 
Will the resulting code compile? Why do you think generic collection classes are sometimes called "type-safe" collections?
4. BONUS QUESTION: List some reasons that the Pair class might be preferable to the ObjectPair class. 
Can you think of any situations where the ObjectPair class might be preferable?

### Iterators

Now that you have a completed generic Pair class, create a minimally functioning collection of Pair objects. 
Open up the following files in your favorite IDE.

* Pairs.java UNFINISHED
* PairsDriver.javaFINISHED

Take a few minutes to read the code, then complete the steps below.

1. Declare a fixed-size array of Pair objects that uses generics. Declare additional members as needed to keep track of the number of Pairs added.
2. Complete the constructor. Unfortunately, it isn't possible to directly instantiate an array of generic objects in Java. This won't compile:

```java
pairs = new Pair<K, V>[CAPACITY];
```          
In this case, the easiest solution is to assign a "raw" pair array:

```java
pairs = new Pair[CAPACITY];
```
This will result in a warning along the lines of "Type safety: The expression of type Pair[] needs unchecked conversion 
to conform to Pair[]", which can be suppressed using the @SuppressWarnings("unchecked") annotation. NOTE: 99% of the time suppressing warnings is a BAD IDEA. This is a rare exception.

3. Finish the addPair method. Return false if the array is already full.
4. Implement the required Iterator methods. For remove, the Pair should be removed and all of the remaining elements should shift to the left one place.
5. Throw exceptions as specified in the [Java Iterator API](https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html).

### Wildcards and Subclasses

Open up the following file in a simple text editor like vim, gedit or xed. (Don't open it in Eclipse!)

    CompileDriver.java

Comment each assignment statement with either:

// C (For "Will compile.")
or
// N (For "Will not compile.")

For those lines that will not compile, include an explanation of the problem. Once you have finished all of the statements, 
check your answers by attempting to compile the file. Comment out the non-compiling lines before submission.

## Submitting

Submit all modified files as a zip file through Autolab:

* ObjectPairDriver.java
* Pair.java
* PairDriver.java
* Pairs.java
* CompileDriver.java

The submitted file should be named generics.zip.

You may download the Web-CAT JUnit tests if you would like to test your code locally.

## Ссылки

* [CS 240: Algorithms and Data Structures James Madison University, Fall 2020](https://w3.cs.jmu.edu/spragunr/CS240/labs/generics/generics.shtml)
* [The Java™ Tutorials. Generics](https://docs.oracle.com/javase/tutorial/java/generics/index.html)
* [Java Records (JEP 359)](https://habr.com/ru/post/487308/)