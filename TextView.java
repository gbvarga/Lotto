/*
 * TextView.java
 *
 * Created on 2008. augusztus 13., 6:58
 *
 * Class to print the result of a Huzas class.
 */

package lotto;
import java.util.*;

/**
 *
 * @author Balázs
 */
public class TextView extends View {
    
    /** Creates a new instance of TextView */
    public TextView() {
    }
    
    public void RenderScene(Huzas eredmeny) {
        
        int i = 0;
        System.out.println("A nyero szamok:");
        for (i = 0 ; i <  eredmeny.numbers.length ; ++i ) {
            System.out.print( eredmeny.numbers[i].getNthElement( 0 ) );
        }
        System.out.println("");
    }
    
}
