//todo -------------POLYMORPHISM-------------

//^ Polymorphism is one if the core principles oof OOPS.
//^ poly means means many morph means forms. so polymorphism means many forms.
//^ The ability of a method to behave differently for different objects is called polymorphism.
//^ In other words the smartness for a method to show different behavious upon different objects is called polymorphism.

//^ Types of polymorphism
//& Compile time polymorphism - (Static binding or method overloading)
//& Run time polymorshism - (Dynamic binding or method overriding)

//~ Method binding---
//! The process of mapping or associating method caller to its method implementation is called  method binding.
//! or attaching method caller to its implementation is called method binding.

//&  Compile time polymorphism - (Static binding or method overloading)
//! ctp is also static binding or early binding.
//! ctp is achived using method overloading.
//! in ctp, method binding happens during compile time and it is decided by compiler.
//! Inheritance is not necessary
//! Method with the same name but different signatures
//! scope - applies to the same class
//! can have different return type

//& Run time polymorshism - (Dynamic binding or method overriding)
//! rtp is also called dynamic binding or late binding.
//! rtp is achived using IS-A relationship, method overriding, upcasting
//! in rtp, method binding happens during run time and it is decided by JVM.
//! Inheritance is must 
//! Methods with the same name and same signatures
//! scope - applies to the applies to parent child classes
//! must have same return type.

//^ Advantage of using polymorphism
//! code reusability
//! Flexibility
//! maintainability
//! scalability