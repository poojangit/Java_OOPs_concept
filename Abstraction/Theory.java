//todo --------------ABSTRACTION----------------------

//^ Abstaction is one of the four pillers of oops.
//^ It is a process of hiding the implementaion details of a system and exposing only the essential features to the user.

//? Abstarction can be achived using -
//! Abstarct class -(0-100% abstarction)
//! Interfaces - (100% abstarction)

//^ Abstarct
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
//& syntax - abstract returntype methodName(parameter)

//? Contract of abtsract-
//! when a class extends an abstract class-
//!                  - make the class as abstarct
//!                  - override the abstract method