import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user9 on 10/22/16.
 */
public class GG {
    private JPanel pf;
    private JButton ZATWIERDZButton;
    private JButton nazwaUżytkownikaButton;
    private JTextField textField1;
    private JProgressBar progressBar1;
    private JPasswordField passwordField1;
    private JCheckBox potwierdzSwojWybórCheckBox;
    private JTextArea witajWAplikacjiTestowejTextArea;
    private JSlider slider1;
    private JComboBox comboBox1;
    private JTextArea textArea1;
    private JTextField textField2;
    int ss= 0;
    boolean clickedCheckedBox;

    public GG() {
        nazwaUżytkownikaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText("Wyswietliles zapytanie do przycisku!");
            }
        });
        ZATWIERDZButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                witajWAplikacjiTestowejTextArea.setText("Kliknales przycisk ZATWIERDZAM Oznacza\n to ze jestes na tyle rozgarniety ze poklikales \njuz te przyciski xD");
                if (textField1.getText().trim().length() <= 0) {
                    witajWAplikacjiTestowejTextArea.setText("Podaj login");
                    textField2.setText(" Podaj login");
                } else {
                    textField2.setText(" ------------- ");
                }



            }
        });



        potwierdzSwojWybórCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                ZATWIERDZButton.setEnabled(potwierdzSwojWybórCheckBox.isSelected());
                if (potwierdzSwojWybórCheckBox.isSelected())
                    progressBar1.setValue(ss+10);
                else
                    progressBar1.setValue(ss-10);

            }
        });
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                progressBar1.setValue(slider1.getValue());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GG");
        frame.setContentPane(new GG().pf);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
