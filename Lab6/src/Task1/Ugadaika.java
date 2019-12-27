package Task1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ugadaika extends JFrame{
    private JButton btnSubmit;
    private JTextField tfAnswer;
    private JPanel rootPanel;
    //Случайное целое число в диапазоне [0;20]
    int rnd = (int) (Math.random() * 20.0D);
    private int attemptCounter = 3;


    public Ugadaika() {
        setContentPane(rootPanel);
        setVisible(true);
        this.setSize(1000, 500);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int userNumber = Integer.parseInt(tfAnswer.getText());
                    if (userNumber > rnd) {
                        JOptionPane.showMessageDialog(null, "Загаданное число меньше " + userNumber, "Неверно", JOptionPane.ERROR_MESSAGE);
                        attemptCounter--;
                    }
                    if (userNumber < rnd){
                        JOptionPane.showMessageDialog(null, "Загаданное число больше " + userNumber, "Неверно", JOptionPane.ERROR_MESSAGE);
                        attemptCounter--;
                    }
                    if (userNumber == rnd){
                        attemptCounter--;
                        JOptionPane.showMessageDialog(null, "Вы угадали с " + (3-attemptCounter) + " раза!", "Победа", JOptionPane.PLAIN_MESSAGE);
                        System.exit(1);
                    }
                    if (attemptCounter == 0){
                        JOptionPane.showMessageDialog(null, "Вы не смогли угадать число.", "Поражение", JOptionPane.PLAIN_MESSAGE);
                        System.exit(1);
                    }
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    public static void main(String args[]){
        new Ugadaika();
    }
}
