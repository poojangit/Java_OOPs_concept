//todo --------------ABSTRACTION----------------------

//^ Abstaction is one of the four pillers of oops.
//^ It is a process of hiding the implementaion details of a system and exposing only the essential features to the user.

//? Abstarction can be achived using -
//& Abstarct class -(0-100% abstarction)
//& Interfaces - (100% abstarction)

//? Rules for achiving abstraction
//^ abstract class or interface with abstract methods
//^ IS-A  relationship
//^ method overriding
//^ upcasting

//& ----------------Abstarct-----------------
//! Abstarct is a keyword which is using with class and methods

//^ Concrete class-
//! It is not declared using abstract keyword.
//! Can be refered as non-abstract class.
//! Objects can be created
//! It can have contructor 
//! Inheritance is possible.
//! It can only allow concrete methods.

//^ Abstract class-
//! class declared using abstract keyword.
//! Objects cannot be created
//! It can have contructor only through contructor chaining.
//! It can allow both concrete and abstract methods.

//^ concrete method-
//! it is a non-abstract method
//! these methods will have both declaration as well as implementation

//^ Abstract method-
//! abstract method is declared using abstract keyword.
//! these methods will have only declaration and no implementaion
//~ syntax - abstract returntype methodName(parameter)

//? Contract of abtsract-
//! when a class extends an abstract class-
//!                  - make the class as abstarct
//!                  - override the abstract method

//& -------------Interface ---------------------

//! Interface is a java type defination which has to be declared using interface keyword.
//! Interface is a Blueprint of a class and class is a blue print of an object.
//! Interface acts as a medium between the two systems where one system acts as a client and another system will act as object with services or resources.
//! we can create a reference variable in interface.
//~ syntax - Interface interfaceName {}
//! where as in interface class, abstract keyword is defaultly present.
//! Interface can allow variables and all the variables inside the Interface are PUBLIC STATIC FINAL
//! So interface does not allow contructors.
//! static blocks are not allowed.
//! Interface allow methods and all the methods in interface are PUBLIC ABSTRACT.
//! Interface can have main methods but it is not a good practice.
//! a class can implement multiple interface(multiple inheritence with respect to interface is possible)

//? Inheritance
//! Class can implements Interface - follow contract of abstract
//! Interface can extend Interface
//! Interface cannot extends class

