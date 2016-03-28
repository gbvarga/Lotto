/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

import java.util.*;

/**
 *
 * @author hu3b1249
 */
class ResultPair {

    private Double key;
    private Integer value;

    public ResultPair(Double key, Integer value) {
        this.key = new Double(key);
        this.value = new Integer(value);
    }

    public Double getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }
}

class ResultPairList {

    ResultPair[] listOfPairs;

    public ResultPairList(Map<Integer, Double> map) {
        listOfPairs = new ResultPair[map.size()];
        int i = 0;
        for (Integer key : map.keySet()) {
            ResultPair pair = new ResultPair(map.get(key), key);
            this.addResultPair(pair, i);
            i++;
        }
    }

    public void addResultPair(ResultPair pair, int index) {
        listOfPairs[index] = pair;
    }

    public void bubbleSort() {
        for (int i = listOfPairs.length - 1; i > -1; i--) {
            for (int j = 0; j < i; j++) {
                if ((listOfPairs[j].getKey().doubleValue()) > (listOfPairs[j + 1].getKey().doubleValue())) {
                    ResultPair tmpPair = new ResultPair(listOfPairs[j].getKey(), listOfPairs[j].getValue());
                    listOfPairs[j] = listOfPairs[j + 1];
                    listOfPairs[j + 1] = tmpPair;
                }
            }
        }
    }
}

public class Number {

    private Map<Integer, Double> value;
    private int minValue;
    private int maxValue;
    private double meanValue;

    public Number() {
        this.value = new HashMap<Integer, Double>();
        this.minValue = 0;
        this.maxValue = 0;
        this.meanValue = 0;
    }

    public Map<Integer, Double> getValue() {
        return value;
    }

    public void setValue(Map<Integer, Double> value) {
        this.value = value;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public double getMeanValue() {
        return meanValue;
    }

    public void setMeanValue(double meanValue) {
        this.meanValue = meanValue;
    }

    public void updateProbability(int index, double probability) {
        this.value.put(index, probability);
    }

    public Integer getNthElement(int index) {
        if (index > value.size()) {
            System.out.println("index > value.size()");
            return 0;
        }
        if (value.size() < 1) {
            System.out.println("value.size() < 1");
            return 0;
        }
        ResultPairList result = new ResultPairList(value);
        result.bubbleSort();
        return result.listOfPairs[result.listOfPairs.length - index].getValue();
    }

    // Test Number
    /*    public static void main(String[] args) {
    Number number = new Number();
    Map newValue = new HashMap<Integer, Double>();
    newValue.put(1, 0.2);
    newValue.put(2, 0.2);
    newValue.put(3, 0.1);
    newValue.put(4, 0.1);
    newValue.put(5, 0.1);
    newValue.put(6, 0.3);
    newValue.put(7, 0.3);
    newValue.put(8, 0.3);
    number.setValue(newValue);
    System.out.println("1. = " + number.getNthElement(1));
    System.out.println("2. = " + number.getNthElement(2));
    System.out.println("3. = " + number.getNthElement(3));
    System.out.println("4. = " + number.getNthElement(4));
    System.out.println("5. = " + number.getNthElement(5));
    System.out.println("6. = " + number.getNthElement(6));
    }*/
}
