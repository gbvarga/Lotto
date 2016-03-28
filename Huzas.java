/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lotto;

/**
 *
 * @author hu3b1249
 */
public class Huzas {

    public Number[] numbers;
    
    
    public Huzas (){
        int lottoType = Lotto.getLottoType();
        switch (lottoType){
            case 5:{
                this.numbers = new Number[5];
            }
            break;
            case 6:{
                this.numbers = new Number[6];
            }
            break;
            case 7:{
                this.numbers = new Number[7];
            }
            break;
            default:{
                System.out.println("kocsog");
            }
        }
    }
    
    public void setNumber(int index, Number number){
        this.numbers[index] = number;
    }
}
