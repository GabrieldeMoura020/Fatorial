import javax.swing.*;

public class Main {

    public static void main (String [] args){

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));

        Fatorial b = new Fatorial();

        n = b.fatorialRecurasivo(n);

        JOptionPane.showMessageDialog(null,"O fatorial é: " + n);

    }
}
