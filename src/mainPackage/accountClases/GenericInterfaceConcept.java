package mainPackage.accountClases;

public class GenericInterfaceConcept<T extends Runnable> {
    // T implements Runnable is n't allowed only extends Keyword is allowed
    // so now whenever we will create the objecct of this class, we can pass the reference of either Runnable
    // interface or it's implementation classes e.g. Thread class.

    // Now we will see some different combination in type parameter
    // 1-> <T extends Runnable & Comparable> allowed
    // A type parameter can extends any no. of interfaces it means that T can accept the reference of those
    // objects which implements both Runnable and Comparable interface.

    // 2-> <T extends Number & Runnable & Comparable> allowed
    // A type parameter can extends one class and any no. of interfaces it means that T can accept the reference
    // of those objects which are the child class of Number and implements both Runnable and Comparable interface.

    // 3-> <T extends Runnable & Comparable & Number> NOT allowed
    // If a type parameter is extending one class and any no. of interfaces then it should extend the class first
    // then any no. of interfaces (same rule we follow in inheritance that class should extends class first then
    // any no. of interfaces).

    // 4-> <T extends Thread & Number> NOT allowed
    // A type parameter can not extends more than one class, if it does then it'll become Multiple inheritance
    // and multiple inheritance is not allowed in java.
}
