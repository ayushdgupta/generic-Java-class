package mainPackage.accountClases;

import java.util.ArrayList;
import java.util.List;

public class GenericClassConcept<T extends Number> {

    // here one more thing we need to understand about generic java classes or bounded and unbounded
    // varables or polymorphism
    List<String> demoList = new ArrayList<>();
    // the above line will not throw any error bcz if you see in L.H.S. of assignment operator (=)
    // demoList is of List type which contain String object so here->
    // List is base type and String is type parameter
    // and we assigned the object of ArrayList to a List so we can say in JAVA Plymorphism or Overriding
    // is allowed in base types.

    // Now if we try to run below line
    List<Number> demoList2 = new ArrayList<>();     // fine no problem
    List<Number> demoList3 = new ArrayList<Number>(); // fine no problem
    // so we can say that in JAVA polymorphism is not allowed in type parameters.
    //        List<Number> demoList3 = new ArrayList<>(Integer);  // this line will throw an error
    // Now we will see the use of generic type parameter or (Bounded parameter)
    List<T> demoList4 = new ArrayList<>();
    // now we can see that above line is not throwing any error so demoList can be of any type which will be
    // the subclass os Number class for e.g. Integer, Double etc. but it'll be bounded with Number class. so Now
    // no one will be able to pass String or any other unnecessary class objects which is possible in case of
    // Accounts class / template which we have developed in this project.

}
