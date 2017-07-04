/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import javax.swing.JOptionPane;

/**
 *
 * @author 132173
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String palavra = JOptionPane.showInputDialog("Palavra: ");
        int op = Integer.parseInt(JOptionPane.showInputDialog("Testar Gramatica1 ou Gramatica2?: "));
        
        
        Gramatica g = new Gramatica();
        if(op==1)
        g.gramatica1(palavra);
        else
        g.gramatica2(palavra);
        
    }
    
}
