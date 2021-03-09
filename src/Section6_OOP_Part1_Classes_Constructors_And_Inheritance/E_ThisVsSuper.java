package Section6_OOP_Part1_Classes_Constructors_And_Inheritance;

public class E_ThisVsSuper {

    /*
    * SUPER = used to access / call the parent class members (variables & methods)
    *
    * THIS = used to call the current class members (variables & methods).
    * This is required when we have a parameter with the same name as an instance variable (field)
    *
    * We can use both of them anywhere, EXCEPT in static areas.
    *
    * SUPER is commonly used with method overriding, when we call a method with the same name from the parent class.
    *
    * In Java we have the this() and super() call. Notice the braces it is known as a call, since it looks like a regular method call.
    *
    * Use this() to call a constructor from another overloaded constructor in the same class.
    *
    * The call to this() can be used only in a constructor, and it must be the first statement in a constructor.
    * It's used with constructor chaining, in other words when one constructor calls another constructor, and helps to reduce duplicated code.
    *
    * The only way to call a parent constructor is by calling super().
    * The call to super() must be the first statement in each constructor.
    *
    * Even abstract classes have constructors, although you can never instantiate an abstract class using the new keyword.
    *
    * An abstract class is still a super class, so its constructors run when someone makes an instance of a concrete sub-class.
    *
    * NOTE: A constructor can have a call to super() or this() but never both.
    *
    * */
}
