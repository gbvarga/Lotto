/*
 * HuzasEllenorzoAlgoritmus.java
 *
 * Created on 2008. augusztus 13., 8:13
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package lotto;

import java.util.*;
/**
 *
 * @author Balázs
 */
public class HuzasEllenorzoAlgoritmus extends HuzasAlgoritmus {
    
    /** Creates a new instance of HuzasEllenorzoAlgoritmus */
    public HuzasEllenorzoAlgoritmus(Huzas MyHuzas) {
        super(MyHuzas);
        Viewer = new TextView();
    };

    public void Compute() {
        int i,j;                
        for (i = 0 ; i <  MyHuzas.numbers.length ; ++i ) {
            Integer Ival = MyHuzas.numbers[i].getNthElement( 0 );        
            for (j = 0 ; j < MyHuzas.numbers.length ; ++j ) {
                if  ( Ival.equals( MyHuzas.numbers[j].getNthElement( 0 ) ) && ( i != j ) ) {
                    Map<Integer, Double> szamok = MyHuzas.numbers[j].getValue();
                    szamok.remove( szamok.get( Ival ) );
                }
            }  
        }    
    };    
    
}
