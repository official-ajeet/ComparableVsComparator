# Java Comparable and Comparator Demonstration

This repository demonstrates the use of `Comparable` and `Comparator` interfaces in Java for sorting objects. It includes examples of sorting a list of `Student` objects by different attributes using both interfaces.

## Table of Contents

- [Introduction](#introduction)
- [Comparable Interface](#comparable-interface)
- [Comparator Interface](#comparator-interface)
- [Difference between Comparable and Comparator](#difference-between-comparable-and-comparator)
- [Using Comparator with Lambda Expressions](#using-comparator-with-lambda-expressions)
- [Conclusion](#conclusion)

## Introduction

In Java, the `Comparable` and `Comparator` interfaces are used to order objects. This repository provides practical examples of both interfaces, showing how to sort `Student` objects by name and age.

## Comparable Interface

The `Comparable` interface defines a natural ordering for the objects of the implementing class. The class must override the `compareTo` method. When sorting using `Comparable` and the `compareTo` method:
- **Collection Sorting**: When `Collections.sort(list)` is called, it internally calls the `compareTo` method of the elements in the list.
- **Comparison Logic**: The `compareTo` method compares the current object (`this`) with another object (`other`) and returns an integer based on the comparison logic defined.
- **Implementation**: The class itself implements the `Comparable interface`, and it is used to compare the current object with another object of the same type.

## Comparator Interface

The `Comparator` interface provides a way to define multiple comparison strategies for objects. It is often used when you want to sort objects in different ways without changing the class itself. When sorting using `Comparator` and the `compare` method:
- **Collection Sorting**: When `Collections.sort(list, comparator)` is called, it internally calls the `compare` method of the provided comparator.
- **Comparison Logic**: The `compare` method compares two objects (`o1` and `o2`) and returns an integer based on the comparison logic defined in the comparator.
- **Implementation**: A separate class typically implements the `Comparator interface`, or it can be implemented using anonymous classes or lambda expressions.

## Difference between Comparable and Comparator

- **Purpose**: `Comparable` is used to define a single natural ordering for objects within the class itself. `Comparator`, on the other hand, allows defining multiple comparison strategies externally, without modifying the class.
- **Implementation**: The `Comparable` interface is implemented within the class whose objects need to be sorted. `Comparator` is implemented in separate classes or using lambda expressions.
- **Flexibility**: `Comparator` provides more flexibility as it allows defining different comparison strategies for sorting objects, while `Comparable` ties the sorting logic directly to the class itself.

## Using Comparator with Lambda Expressions

Lambda expressions provide a concise way to create `Comparator` instances for sorting. This approach is particularly useful for defining multiple sorting strategies without modifying the original class. With lambda expressions:
- **Simplified Syntax**: The lambda expression provides a shorter and more readable way to define the comparison logic.
- **Flexibility**: You can easily define and use multiple comparison strategies inline without creating separate classes or modifying the existing ones.

## Conclusion

This repository provides examples of how to use the `Comparable` and `Comparator` interfaces to sort objects in Java. By understanding and using these interfaces, you can create flexible and reusable code for ordering objects in various ways.

Feel free to explore the code and modify the examples to suit your learning needs. Happy coding!

**Connect with me on [LinkedIn](https://www.linkedin.com/in/ajeet-maurya-001745213/)** for more discussions on Java programming and software development!
