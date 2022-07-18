package mainPackage.accountClases;

public class GenericInterfaceConcept<T extends Runnable> {
    // T implements Runnable is n't allowed only extends Keyword is allowed
    // so now whenever we will create the objecct of this class, we can pass the reference of either Runnable
    // interface or it's implementation classes e.g. Thread class.
}
