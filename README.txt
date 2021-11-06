# Project 3: Experiments with Hashing

* Author: Rich Boundji
* Class: CS321 Section 3
* Semester: Fall 2021

## Overview

This program shows the effect of the load factor as on the 
average number of probes, using linear and double hashing.


##INCLUDED FILES:

* README - this file
* Linear.java - source file
* HashTable.java - source file
* HashObject.java - source file
* HashTableTest.java - source file
* DoubleHashing.java - source file
* TwinPrimeGenerator.java - source file


## Reflection

Overall the project went well, at first I had difficulties understanding 
what I needed to do but that is something that I will improve with time. 
Understanding the pseudo code went mostly well, there were some values that 
I did not know how to translate but with the help of the tutors I figured it out.

Something that I found to be challenging during this project was making the 
hashInsert, it was difficult for me to understand some of the values. 
I figured it out with some help from the tutors.


## Compiling and Using

From the directory containing all source files, compile the
driver class (and all dependencies) with the command:
$ javac HashtableTest .java
 
Run the compiled class file with the command:
$ java HashtableTest <input type> <load factor> [<debug level>]

Console output will give the results after the program finishes.


## Results 

Input source 1: random number

alpha   linear    double
-----------------------------
0.5     1.494      1.386
0.6     1.740      1.522
0.7     2.164      1.724
0.8     2.989      2.006
0.9     5.355      2.550
0.95    10.953     3.198
0.98    19.622     4.004
0.99    44.172     4.589


Input source 2: current time

alpha   linear    double
-----------------------------
0.5     1.0       1.0
0.6     1.0       1.0
0.7     1.0       1.0
0.8     1.0       1.0
0.9     1.0       1.0
0.95    1.0       1.0
0.98    1.0       1.0
0.99    1.0       1.0  


Input source 3: word-list

alpha    linear     double
-----------------------------
0.5      1.597       1.390
0.6      2.149       1.534
0.7      3.604       1.721
0.8      6.708       2.016
0.9      19.815      2.569
0.95     110.594     3.186
0.98     324.206     4.020
0.99     471.671     4.696


## Sources used
I used some of my previous projects and got help from the tutors.
