/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_10;

import javax.swing.JOptionPane;

class Exercicio_10 {

public static void main(String[] args) {
double numero1, numero2, resultado;
       numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número1:"));
       numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número2:"));
       resultado = numero1 + numero2;
       if (resultado >= 10) {
       JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
    }else{
       if (resultado < 10)
           JOptionPane.showMessageDialog(null, "Não  é maior que 10");
       }
       }
    }