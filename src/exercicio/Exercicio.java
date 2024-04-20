/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author operador
 */
public class Exercicio {

    public static void main(String[] args) {

        int numeroUm;
        int numeroDois;
        int numeroTres;
        int maior;
        int menor;

        //Interger.parse converte para inteiro
        numeroUm = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        numeroDois = Integer.parseInt(JOptionPane.showInputDialog("digite outro numero que va somar com o anterior"));
        numeroTres = Integer.parseInt(JOptionPane.showInputDialog("digite o terceiro numero"));

        JOptionPane.showMessageDialog(null, numeroUm + numeroDois + numeroTres);

        if (numeroUm > numeroDois) {
            JOptionPane.showMessageDialog(null, "muito legalkkkkk");
            maior = numeroUm;
            menor = numeroDois;
            
        } else {
            JOptionPane.showMessageDialog(null, "aí é foda");
            maior = numeroDois;
            menor = numeroUm;
        }
        if (maior > numeroTres) {
            JOptionPane.showMessageDialog(null, "Maior numero " + maior);
                
        }else{
         JOptionPane.showMessageDialog(null,"tu é foda " + numeroTres);
        }
        if (menor < numeroTres) {
            System.out.println("menor numero " + menor);
        } else{
            System.out.println("menor numero " + numeroTres);
        }
    }

}
