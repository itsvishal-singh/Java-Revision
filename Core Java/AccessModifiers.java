/*
Access Modifiers:  (also known as Access specifiers) are keywords that set the visibility or accessibility of classes, constructors, methods, and variables.

Java provides four levels of access: 

1. Private (private)
-> The most restrictive level. Members declared as private are accessible only within the same class. 
-> Use Case: Hiding sensitive data fields (like passwords or account balances) and internal helper methods that shouldn't be exposed to other classes.
-> Restriction: Top-level classes and interfaces cannot be declared as private (only nested ones can).

2. Default (No keyword) 
-> Often called "package-private," this is applied when no access modifier is specified. It allows access only to other classes within the same package. 
-> Use Case: Grouping related classes that need to work together internally but should be hidden from the rest of the application.

3. Protected (protected)
-> Provides a balance between restricted and open access. Members are accessible within the same package and by subclasses in other packages. 
-> Use Case: Designing for inheritance where you want child classes to use specific base class members, but keep those members hidden from unrelated classes.
-> Restriction: Cannot be applied to top-level classes or interfaces.

4. Public (public)
-> The least restrictive level. Members are accessible from anywhere in the program, regardless of the package. 
-> Use Case: Defining APIs, service classes, constants, or utility methods that need to be globally accessible.

*************** Level Of Access **************************

:Modifier----------> private__default__proteccted__public
:Same Class--------> --Yes--__--Yes--__---Yes----__--Yes-
:Same Package------> --No---__--Yes--__---Yes----__--Yes-
(Sub-Class)
:Same Package------> --No---__--Yes--__---Yes----__--Yes-
(Non-subclass)
:Different Package-> --No---__--Yes--__---Yes----__--No--
(sub-class)
:Different Package-> --No---__--No---__---Yes----__--No--
(Non-Subclass)


*/
public class AccessModifiers {

}
