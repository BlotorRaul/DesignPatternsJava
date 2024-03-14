# Strategy Design Pattern


## Applicability
Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.  

Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.

Use the pattern when your class has a massive conditional statement that switches between different variants of the same algorithm.


## PROS
You can swap algorithms used inside an object at runtime.

You can isolate the implementation details of an algorithm from the code that uses it.

You can replace inheritance with composition.

Open/Closed Principle. You can introduce new strategies without having to change the context.