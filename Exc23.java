/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exc23;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Exc23 {

    public static void main(String[] args) {
        
        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome");
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        double altura;
        altura = Double.parseDouble(    JOptionPane.showInputDialog("Digite a sua altura"));
        
        
        JOptionPane.showMessageDialog(null, "Olá " + nome);
        JOptionPane.showMessageDialog(null, "Sua idade é " + idade);
        JOptionPane.showMessageDialog(null, "Sua altura é " + altura);
    }
}
