package yogita.CollectionDemo;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Set<Integer>set=new HashSet();
        Set<Integer>set1=new HashSet();
     
        set.add(1);
        set.add(2);
        set.add(3);
       
        
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(6);
        System.out.println(set.containsAll(set1));
        
        set1.removeAll(set);
        System.out.println(set1);
        
        
    }
}
