Vehicle Management System
Project Overview
This project shows how inheritance works in Java. I made different vehicle types (Car, Motorcycle, Truck) that all inherit from one Vehicle class. Each vehicle has a driver.
Main concepts:

Inheritance - subclasses inherit from Vehicle
Abstract methods - each vehicle implements startEngine() and stopEngine() differently
Composition - vehicles have drivers

Class Hierarchy
Vehicle (abstract class)

Has: brand, year, driver
Abstract methods: startEngine(), stopEngine()
Concrete method: displayInfo()

Car, Motorcycle, Truck - all extend Vehicle

Each has extra fields (like doors for Car, capacity for Truck)
Each implements the abstract methods
All use super() to call parent constructor

Driver

Simple class with name and licenseNumber
One driver can drive multiple vehicles (driver d1 drives both car and truck in my code)

How to Compile and Run
bashjavac *.java
java Main

Output
![Program Output](docs/screenshots/output.png)





Reflection
Inheritance made my code simpler. Instead of writing brand, year, and driver in every class, I wrote it once in Vehicle and all subclasses got it automatically. This saved a lot of repetition.
Method overriding was useful for customizing each vehicle type. All vehicles start engines, but each does it differently. Making these methods abstract forced me to implement them in each subclass.
The hardest part was understanding protected vs private modifiers and how super() works in constructors. At first composition and aggregation seemed similar, but now I see the difference - aggregation means one driver can be shared between multiple vehicles.
