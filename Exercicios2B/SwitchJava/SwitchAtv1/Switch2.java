/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package switchcase;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Switch2 {
    public static void main(String[] args) {
        // TODO code application logic here
            String n1Str = JOptionPane.showInputDialog(null,"Digite o primeiro numero");
                double n1 =  Double.parseDouble(n1Str);
            String op = JOptionPane.showInputDialog(null,"Adicione a operacao que deseja fazer \n"
                    + "* --> multiplicacao \n"
                    + "/ --> divisao \n"
                    + "+ --> adicao \n"
                    + "- --> subtracao \n");
            String n2Str = JOptionPane.showInputDialog(null,"Digite o segundo numero");
                double n2 =  Double.parseDouble(n2Str);

            switch (op){
                case "*":
                  JOptionPane.showMessageDialog(null,"O resultado é " + (n1*n2));
                break;
                case "/":
                  JOptionPane.showMessageDialog(null,"O resultado é " + (n1/n2));
                break;
                case "-":
                  JOptionPane.showMessageDialog(null,"O resultado é " + (n1-n2));
                break;
                case "+":
                  JOptionPane.showMessageDialog(null,"O resultado é " + (n1+n2));
                break;
                default:
                JOptionPane.showMessageDialog(null,"Opcao invalida");
            break;
            }
}
}           