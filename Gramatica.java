/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 132173
 */
public class Gramatica {


  
    public void gramatica1(String palavra)
    {
         int counta = 0;
         int countb = 0;
         boolean valido = false;
        
        for(char c : palavra.toCharArray())
        {
            if(c == 'a')
                counta ++;
            
            if(c == 'b')
                countb ++;
        }
        if(counta==2 && countb>0)
            valido = true;
        
         if(valido)
            System.out.println("Palavra pertence a gramatica 1"); 
         else
         System.out.println("Palavra nao pertence a gramatica 1"); 
    }
    
    
    public   void gramatica2(String palavra)
    {
       /* String[] alfabeto = {"1","0"};
        String[] regraA = {"A1","A0","1","0"};
        String S = "A0";
        ArrayList<String> combinacoes = new ArrayList<String>();
        
        combinacoes.add(S);
        
        for(String in : )
        */
        boolean valido = true;
        boolean valido1 = false;
        char ultimaletra = '0';
        
        for(char c : palavra.toCharArray())
        {
            if(c != '1' && c != '0' )
                valido = false;
            
            ultimaletra = c;
        }
        
        if(ultimaletra=='0')
            valido1 = true;
        
         if(valido && valido1)
            System.out.println("Palavra pertence a gramatica 1"); 
         else
         System.out.println("Palavra nao pertence a gramatica 1"); 
        
        
    }
    



}
