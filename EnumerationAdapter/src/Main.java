import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList();
        myArrayList.add("One");
        myArrayList.add("Two");
        myArrayList.add("Three");

        System.out.println("\nPrint elements using iterator");
        Iterator<String> myIterator = myArrayList.iterator();

        while(myIterator.hasNext()) {
            System.out.println("My list element: " + myIterator.next());
        }

        System.out.println("\nPrint elements using enumerator adapter");

        myIterator = myArrayList.iterator();
        IteratorEnumerationAdapter myEnumeratorAdapter = new IteratorEnumerationAdapter(myIterator);

        while(myEnumeratorAdapter.hasMoreElements()) {
            System.out.println("My list element: " + myEnumeratorAdapter.nextElement());
        }
    }
}
