//todo ----------ENCAPSULATION-------------------

//^ Encapsulation is one if the four pillers of oops
//^ Wrapping, grouping, binding a data members(variables) and member functions(methods) in a sigle entity.
// ^ Java By default support encapsulation and the best example is  JAVA BEAN class

//? Rules to develop java bean class -
//! 1. class --------> Non-Abstact class.
//! 2. variables ----> Private data members.
//! 3. methods ------> public setter and getter methods.
//! 4. constructors -> non-parameterized constructor.
//! 5. Class should implement serializable interface.

//? Setter methods -
//! Setter methods is always used to initialize the data and the access specifiers.
//! The return type is always public void.

//? Getter methods -
//! Getter method is always used to initialize the data and access specifiers.
//! getter methods is always public 
//! return type will be based on the value or data we returned.

//? Key principles -
//! 1. Data Hiding
//! 2. controlled access
//! 3. enchanced security
//! 4. improved maintainability

//? Data Hinding -
//! restrict for direct access through private keyword.

//? Advantages -
//! READABILITY of a program is improved
//! VALIDATIONS can be performed by avaoiding illogical initialization.
//! Data can be made as - READ ONLY - by having only getter method
//!                       WRITE ONLY - by having only setter method
//!                       READ ONLY and WRITE ONLY - having both setter and getter methods.  