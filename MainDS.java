import javax.swing.*;

public class MainDS {

    public static void main(String[] args) {

        checaDiaSemana();

    }

    private static void checaDiaSemana() {

        Integer numDiaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia da semana (número)"));

        if (numDiaSemana < 1 || numDiaSemana > 7) {
            JOptionPane.showMessageDialog(null, "Dia Inválido");
            checaDiaSemana();

        }
    }
}