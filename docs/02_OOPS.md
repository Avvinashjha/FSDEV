# 2. OOPs In Java

Topics We will Cover

- Classes and Object
- Packages in Java
- OOPs Pillars
- Encapsulation
- Inheritance
- Abstraction
- Polymorphism
- Project

### What is Class?

Class can be thought as a structure or blueprint where you have defined what are the fields it can have and what are the behavior it can have

- Blueprint for creating objects
- It has **Fields**\(properties\) and **behaviors**\(method\)
- Class Does not take memory in heap it take space in method area

### What is Object ?

Object is someone which holds value for that class or you can say using the blueprint of class you can make objects which will have **state** \(fields\) and **behavior \(**methods**\)** as defined in the blueprint

- Instance of a class
- Holds **state**\(fields\) and **behavior**
- When you create an instance of a class then it takes memory in heap

### Example:

![](https://whimuc.com/XhDvKC3gTinJ3qS7MQym7i/3FerFcMnTcU5EF.png)
Here Person is a class:

- It has **Fields** \(id, name, ...\)
- It have **Methods** \(eat, sleep, ...\)

Now we have created Object from the Person class

Person-1 \(object of person\)

- It have **state** \(value to the fields\) and these state will take memory in heap area
- It will have same behavior

Let’s Create a class and Understand

- Instance variables
- methods
- public and private access specifiers
- Constructor

### Constructor

A constructor is a special method used to initialize objects in Java. It is called when an object of a class is created. Constructors are essential because they set the initial state of an object by assigning values to its attributes. Unlike regular methods, constructors do not have a return type, not even void.

**Types of constructors:**

- Default constructor
- No argument constructor
- Parameterized constructor
- All Argument constructor
- Copy constructor ❌

**Class Definition**

![](https://whimuc.com/XhDvKC3gTinJ3qS7MQym7i/91kUufPSmNKEZj.png)
**Object Creation**

![](https://whimuc.com/XhDvKC3gTinJ3qS7MQym7i/EXqcGYgcHJgWaF.png)
### Variables and their Scope

- **Local Variable**: variable declared inside a method or block
- **Instance Variable**: Variable declared inside a class
- **Static Variable**: variable declared with static keyword

### Package In Java

In Java, a package is a container for a collection of classes, sub-packages, and interfaces. Packages are used for the following purposes:

- Keeping name problems at bay. For example, in two packages, `college.staff.cse.Employee` and `college.staff.ee.Employee`, there could be two classes named Employee
    - Making it easier to search for, locate, and use classes, interfaces, enumerations, and annotations
    - Controlling access: package level access control is available in both protected and default modes. Classes in the same package and its sub classes can access a protected member. Only classes in the same package have access to a default member \(which has no access specifier\).
    - Packages help in data encapsulation \(or data-hiding\).
    - Sub packages - Sub packages are packages that are contained within another package. These are not automatically imported; they must be imported manually. Members of a sub package also have no access privileges, therefore they are treated differently by protected and default access specifiers.

Benefits of Package

- **Namespace Management**: Avoids naming conflicts.
- **Access Protection**: Controls access to classes and interfaces.
- **Code Organization**: Organizes related classes and interfaces.

Types of Packages

- Built in Packages
  ![](https://whimuc.com/XhDvKC3gTinJ3qS7MQym7i/4bKKsqmMv8SAvQ.png)
- User Defined Packages: Package you create in your project

# Object Oriented Programming

![](https://whimuc.com/XhDvKC3gTinJ3qS7MQym7i/92GoEYgdvNQ8hG.png)
Object-oriented programming \(OOP\) is a programming paradigm that structures software development around "objects" rather than functions and logic.

## Encapsulation

![](https://whimuc.com/XhDvKC3gTinJ3qS7MQym7i/35nKpjFmpJhstd.png)
- Bundling of data \(variables\) and methods \(functions\) that operate on the data into a single unit called a class.
- Protects the internal state of an object from unintended modifications.
- Access to the data is restricted through public methods \(`getters` and `setters`\).
- Ensures data integrity and security.
- Increases code maintainability and flexibility.

## Access Modifiers

Access modifiers in Java determine the visibility and accessibility of classes, methods, and variables. They help implement encapsulation and control the exposure of class members to other parts of the program. Java provides four access modifiers: **public**, **protected**, **default** \(package-private\), and **private**.

- **public**: The public access modifier makes the class, method, or variable **accessible from any other class.**
- **protected**: The protected access modifier makes the method or variable **accessible within the same package and by sub classes in different packages.**
- **default**: When no access modifier is specified, Java uses the default access level \(package-private\), making the method or variable **accessible only within the same package.**
- **private**: The private access modifier makes the method or variable **accessible only within the class it is declared in.**

### Visibility of access Modifiers

| **Visibility** | **Private** | **Default** | **Protected** | **Public** |
| --- | --- | --- | --- | --- |
| Same Class | ✅  | ✅  | ✅  | ✅  |
| Same Package non-Subclass | ❌  | ✅  | ✅  | ✅  |
| Same Package Subclass | ❌  | ✅  | ✅  | ✅  |
| Different Package Non-Subclass | ❌  | ❌  | ❌  | ✅  |
| Different Package Subclass | ❌  | ❌  | ✅  | ✅  |

## Inheritance

Mechanism where a new class \(derived class\) inherits properties and behaviors from an existing class \(base class\).

- Promotes code reuse and the creation of hierarchical relationships between classes.
- Allows the derived class to override or extend the functionalities of the base class.
- Supports polymorphic behavior.
- Reduces code redundancy and enhances code organization

**Types Of Inheritance**

![](https://whimuc.com/XhDvKC3gTinJ3qS7MQym7i/DhosaXBQNjMrgk.png)


**Single Inheritance**

![](https://whimuc.com/XhDvKC3gTinJ3qS7MQym7i/9MU1iQnmy8QJh9.png)
**Multi Level Inheritance**

![](https://whimuc.com/XhDvKC3gTinJ3qS7MQym7i/AzjQq8NsGWyqwo.png)
**Hybrid Inheritance**

![](https://whimuc.com/XhDvKC3gTinJ3qS7MQym7i/247oto7s2Chhzt.png)
**Diamond Problem - Multiple Inheritance**

The diamond problem occurs in multiple inheritance when two classes inherit from a common superclass and a third class inherits from these two classes, leading to ambiguity. Java avoids this problem by not supporting multiple inheritance with classes.

Java does not allow a class to inherit from more than one superclass. This restriction prevents the diamond problem, which can occur when there is ambiguity in the inheritance hierarchy. If multiple inheritance were allowed, a class could inherit the same method from multiple superclasses, causing confusion about which method to execute.

**This and super keyword**

The this keyword in Java is a reference to the current object.

- It is used to eliminate confusion between class attributes and parameters with the same name,
- to call other constructors in the same class, and
- to pass the current object as a parameter to other methods.

The super keyword in Java is a reference to the parent class object.

-  It is used to call the superclass's methods and constructors, and to access the superclass variables

**Uses of this keyword**

Referencing Instance Variables

- When parameter names are the same as instance variable names,
    - this is used to differentiate between the instance variable and the parameter.
- Calling Another Constructor
    - this\(\) can be used to call another constructor in the same class.This is known as constructor chaining within the same class.
- Passing Current Object as a Parameter
    - this can be used to pass the current object as a parameter to another method.

**Uses of super keyword**

- Calling Superclass Methods
    - super is used to call a method from the superclass that has been overridden in the subclass.
- Accessing Superclass Variables
    - super is used to access superclass variables when they are shadowed by subclass variables.
- Calling Superclass Constructor
    - super\(\) is used to call the superclass's constructor. This is useful for initializing the superclass part of the subclass object.

**Abstraction**

- Hiding the complex implementation details and showing only the essential features of the object.
- Focuses on what an object does rather than how it does it.
- Abstract classes and interfaces are used to achieve abstraction.
- Simplifies complex systems by breaking them into smaller, manageable units.
- Enhances code readability and reduces complexity.

**Abstraction using abstract class**

An abstract class is a class that cannot be instantiated on its own and is meant to be subclassed. It can have abstract methods \(methods without a body\) and concrete methods \(methods with a body\). Abstract classes are used to define a common interface for subclasses.

**Characteristics**:

- Can have both abstract and concrete methods.
- Can have member variables.
- Can have constructors.
- Can implement methods from an interface.
- Cannot be instantiated.

**Abstraction using Interface**

An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. All methods in an interface are abstract by default \(except default and static methods\).

**Characteristics**:

- Can only have abstract methods \(until Java 7\).
- From Java 8, can have default and static methods.
- From Java 9, can have private methods.
- Cannot have constructors.
- Cannot have instance variables, only static and final variables.
- A class can implement multiple interfaces.

**Abstract Class vs Interface**

![](https://whimuc.com/XhDvKC3gTinJ3qS7MQym7i/EsNWFeWUXZ5rFE.png)
| **Feature** | **Abstract Class** | **Interface** |
| --- | --- | --- |
| Methods | Can have abstract and concrete methods | Can have abstract, default, and static methods \(since Java 8\) |
| Variables | Can have instance variables  | Can only have static and final variables |
| Multiple Inheritance | Does not support multiple inheritance | Supports multiple inheritance |
| Constructors  | Can have constructors | Cannot have constructors |
| Implementation | Can provide method implementation | Cannot provide method<br>implementation \(except default<br>and static methods\) |
|  |  |  |

**Interface versus Concrete class**

| **Feature** | **Concrete Class** | **Interface** |
| --- | --- | --- |
| Instantiation | Can be instantiated | Cannot be instantiated |
| Methods | Can have abstract, default, and static methods | Can have concrete methods |
| Variables | Can have instance variables | Can only have static and final variables |
|  |  |  |

**Abstract class versus Concrete class**

| Feature | **Abstract Class** | **Concrete Class** |
| --- | --- | --- |
| Instantiation | Cannot be instantiated | Cannot be instantiated |
| Methods | Can have abstract, default, and static methods | Can have concrete methods |
| Variables | Can only have static and final variables | Can have instance variables |

