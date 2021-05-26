# Raindrops
*By Golam Choudhury*
## Overview 
The purpose of this application is to demonstrate simple Java programming techniques as well as
being an exercise in employing thorough quality-assurance and testing.
###Method Description
The plingPlangPlong method returns a String depending on the integer that is passed to it. More 
precisely, it depends on the factors of that integer. The three factors this method is concerned 
with are 3, 5 & 7. The method initialises a StringBuilder which starts off with an empty String.

The method rules:
- A user passes an integer, n
- If 3 is a factor of n, the string builder will append "Pling"
- If 5 is a factor of n, the string builder will append "Plang"
- If 7 is a factor of n, the string builder will append "Plang"
- If neither 3, 5 or 7 are factors of n, the method will return n (as a String)

Examples inputs and outputs:

| **n** | **Multiple of 3** | **Multiple of 5** | **Multiple of 7** | **Output**      |
|-------|-------------------|-------------------|-------------------|-----------------|
|   0   |         ❌         |         ❌         |         ❌         |        0        |
|   3   |         ✔️         |         ❌         |         ❌         |      Pling      |
|   20  |         ❌         |         ✔️         |         ❌         |      Plang      |
|   14  |         ❌         |         ❌         |         ✔️         |      Plong      |
|  -30  |         ✔️         |         ✔️         |         ❌         |    PlingPlang   |
|   21  |         ✔️         |         ❌         |         ✔️         |    PlingPlong   |
|   35  |         ❌         |         ✔️         |         ✔️         |    PlangPlong   |
|  -210 |         ✔️         |         ✔️         |         ✔️         | PlingPlangPlong |
|   19  |         ❌         |         ❌         |         ❌         |        19       |
|   97  |         ❌         |         ❌         |         ❌         |        97       |

Examples in code:
```java
Raindrops raindrops = new Raindrops();

raindrops.plingPlangPlong(0); // returns "0"
        
raindrops.plingPlangPlong(5); // returns "Plang"

raindrops.plingPlangPlong(210); // returns "PlingPlangPlong"

raindrops.plingPlangPlong(-35); // returns "PlangPlong"
```
## Testing
This mini-project has taken a Test Driven Development (TDD) approach, which means the test cases
and accompanying expected outputs has been defined before any methods have been created. This 
allows for one to go into the development process knowing full-well what the expected outcome of
any developed code should be. 

Due to the fact that there is no development code once the test cases are completed, these tests
will immediately fail, the task of the developer is now to write code which makes these tests 
pass. 

The test cases cover a range of potential inputs, including positive integers, negative integers 
and zero.
