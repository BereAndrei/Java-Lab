package lab10;

import javax.swing.*;
import java.awt.*;

class text extends JFrame {


    public static JFrame addTextField(JFrame j, String txt){
        JPanel p = new JPanel();
        JLabel l = new JLabel(txt);
        JTextField t = new JTextField(16);

        p.add(l);
        p.add(t);
        j.add(p);


        return j;
    }

    public static JFrame addCheckField(JFrame j, String txt){
        JPanel p = new JPanel();
        JLabel l = new JLabel(txt);
        JCheckBox c = new JCheckBox();

        p.add(l);
        p.add(c);
        j.add(p);


        return j;
    }
    public static JFrame addRadioField(JFrame j, String[] txt){
        JPanel p = new JPanel();
        for (String tx : txt)
                if(tx!=""){



            JLabel l = new JLabel(tx);
            JRadioButton c = new JRadioButton();

            p.add(l);
            p.add(c);

        }
        j.add(p);
        return j;
    }

    public static JFrame addTextareaField(JFrame j, String[] txt){
            JPanel p = new JPanel();
            JLabel l = new JLabel();
            JRadioButton c = new JRadioButton();

            p.add(l);
            p.add(c);


        j.add(p);
        return j;
    }

    public static void main(String[] args)
    {
        JFrame j = new JFrame("Form");

        /*/JLabel l = new JLabel();
        JTextField txtf;
        txtf = new JTextField(16);
        l.setText("Nume:");
        JPanel p = new JPanel();
        l.setBounds(10,100,90,30);
        p.add(l);
        txtf.setBounds(100,100,500,30);
        txtf.setSize(300,30);
        p.add(txtf);
        f.add(p);
        /*/
        j.setLayout(new GridLayout(3, 7));
        j = addTextField(j, "Nume:");
        j = addCheckField(j, "");
        String[] radios = {"1", "2", "3"};
        j = addRadioField(j, radios);


        j.setSize(1920, 1080);
        j.show();
    }
}
