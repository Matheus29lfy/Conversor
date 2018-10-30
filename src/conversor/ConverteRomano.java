/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author matheus
 */
public class ConverteRomano {
    
        public int desconverte (String numeroRomano){
        int decimal = 0;
        int ultimoNumero = 0;
        String romanoNumeral = numeroRomano.toUpperCase();
        for (int x = romanoNumeral.length() - 1; x >= 0 ; x--) {
            char converterParaDecimal = romanoNumeral.charAt(x);
       

            switch (converterParaDecimal) {
                case 'M':
                    decimal = processoDecimal(1000, ultimoNumero, decimal);
                    ultimoNumero = 1000;
                    break;

                case 'D':
                    decimal = processoDecimal(500, ultimoNumero, decimal);
                    ultimoNumero = 500;
                    break;

                case 'C':
                    decimal = processoDecimal(100, ultimoNumero, decimal);
                    ultimoNumero = 100;
                    break;

                case 'L':
                    decimal = processoDecimal(50, ultimoNumero, decimal);
                    ultimoNumero = 50;
                    break;

                case 'X':
                    decimal = processoDecimal(10, ultimoNumero, decimal);
                    ultimoNumero = 10;
                    break;

                case 'V':
                    decimal = processoDecimal(5, ultimoNumero, decimal);
                    ultimoNumero = 5;
                    break;

                case 'I':
                    decimal = processoDecimal(1, ultimoNumero, decimal);
                    ultimoNumero = 1;
                    break;
                     default: System.out.println("Dígito Romano Errado.");
            }
        }
        
        
        System.out.println(decimal);
        return decimal;
    }

    public static int processoDecimal(int decimal, int ultimoNumero, int ultimoDecimal) {
        if (ultimoNumero > decimal) {
            return ultimoDecimal - decimal;
        } else {
            return ultimoDecimal + decimal;
        }
    }
               
}

    

