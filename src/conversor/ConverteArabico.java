/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author matheus
 */
public class ConverteArabico {      
    
    
//        private String  saida;
//
//    public String getSaida() {
//        return saida;
//    }
//
//    public void setSaida(String saida) {
//        this.saida = saida;
//    }
        
    
    
    public  String converte( int numero){
        int[] varNumeral = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] varRomano = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String saida =  " ";

               if (numero == 0  || numero >= 4000){
                return null;
               }
               System.out.println(" ");
            int i = 0;
              while (numero > 0) {
                if (numero >= varNumeral[i]) {
                    saida += varRomano[i];
                    numero -= varNumeral[i];
                    System.out.print(varRomano[i]);
                } else {
                    i++;
                       }

        }
           return saida;

}
}


                                            



                               
    

