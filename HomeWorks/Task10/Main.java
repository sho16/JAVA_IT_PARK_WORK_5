package ch;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here

        

        LinkedList a2 = new LinkedList();
        a2.add(12);
        a2.add(13);
        a2.add(14);
        a2.add(15);
        a2.add(16);
        a2.add(17);
        a2.add(18);
        a2.add(19);
        
        a2.getFirst();
        System.out.println(a2.getFirst());

        a2.element();
        System.out.println(a2.element());


        Iterator iter2 = a2.iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }


       
        }

    }
}
