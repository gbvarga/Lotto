/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

import java.io.*;

/**
 *
 * @author hu3b1249
 */
public class Lotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            init();
        } catch (Exception ioException) {
            System.out.println("IOException = " + ioException);
        }

    }
    private static final String OTOS = "d:/otos.csv";
    private static final String HATOS = "d:/hatos.csv";
    private static final String HETES = "d:/skandi.csv";
    private static int lottoType;

    public static int getLottoType(){
        return lottoType;
    }
    
    private static void init() throws IOException {
        try {
            System.out.println("Lotto type: ");
            InputStreamReader stdin = new InputStreamReader(System.in);
            BufferedReader console = new BufferedReader(stdin);
            String type = console.readLine();
            lottoType = Integer.parseInt(type);
            if (!((lottoType == 5) || (lottoType == 6) || (lottoType == 7))) {
                System.out.println("Please type 5 or 6 or 7.");
                return;
            }
        } catch (Exception ioException) {
            System.out.println("IOEXception = " + ioException);
        }

        CSVReader csvReader = new CSVReader();
        switch (lottoType) {
            case 5:
                 {
                    csvReader = new CSVReader(new FileReader(OTOS));
                }
                break;
            case 6:
                 {
                    csvReader = new CSVReader(new FileReader(HATOS));
                }
                break;
            case 7:
                 {
                    csvReader = new CSVReader(new FileReader(HETES));
                }
                break;
            default: {
                System.out.println("Please type 5 or 6 or 7.");
                return;
            }
        }
        fileParser(csvReader);
    }

    private static void fileParser(CSVReader csvReader) throws IOException {
        String[] nextLine;
        while ((nextLine = csvReader.readNext()) != null) {
            System.out.println(nextLine[11] + " " + nextLine[12] + " " + nextLine[13] + " " + nextLine[14] + " " + nextLine[15]);
        }
    }
}
