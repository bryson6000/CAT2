1.Student.java (Encapsulation)
Defines a Student class with private attributes (name and grade).
Uses getter and setter methods to access and modify attributes safely.

2. MathOperations.java (Method Overloading)
Defines two multiply() methods:
One that multiplies two numbers.
Another that multiplies three numbers.

3. Animal.java, Dog.java, Cat.java (Method Overriding & Polymorphism)
Animal class has a method makeSound().
Dog and Cat override makeSound() with their own sounds.
Main.java demonstrates polymorphism by calling makeSound() on different animals.
Method Overriding allows subclasses to provide a specific implementation of a method from the parent class.
Polymorphism enables one method call (makeSound()) to behave differently based on the object.

4.This demonstrates abstraction using an abstract class and its subclasses.
Appliance (abstract class):
It contains an abstract method turnOn(), which has no implementation.
Fan and TV (subclasses):
They extend Appliance and provide their own implementation of turnOn().
AbstractionDemo (main class):
Creates objects of Fan and TV.
Calls their turnOn() methods, demonstrating polymorphism.

5.This program performs division of two numbers while handling exceptions.
Takes two numbers as input from the user.
Tries to divide the first number by the second.
Catches exceptions:
ArithmeticException: If division by zero occurs, it prints "Cannot divide by zero!".
InputMismatchException: If the user enters invalid input (like text instead of numbers), it prints "Invalid input! Please enter integers only.".
Uses finally block: Ensures the scanner is closed to free resources.
