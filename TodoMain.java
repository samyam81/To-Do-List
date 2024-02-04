package TODO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TodoMain extends JFrame implements ActionListener {

    JFrame frame;
    Font myFont1=new Font("Monospaced",Font.ITALIC,25);
    TextField[] Tf=new TextField[10];
    JButton Close,Add,Priority;
    int i;
    public static void main(String[] args) {
        new TodoMain();
    }
 TodoMain(){

            frame =new JFrame("To-Do-List");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420,550);
            frame.setLayout(null);
           
           
            // Tf=new TextField();
            // Tf.setBounds(21, 21, 210, 37);
            for (int i = 0; i < Tf.length; i++) {
                int x= 21;
                int y=37*(i+1)+15;
                Tf[i]=new TextField();
                Tf[i].setFont(myFont1);
                Tf[i].setBounds(x,y,500,37);
            }

            Add= new JButton("Add");
            Add.setBounds(206,421,142,49);
            Add.addActionListener(this);


            Close=new JButton("CLose");
            Close.addActionListener(this);
            Close.setBounds(50,421,142,49);

            frame.add(Add);
            frame.add(Close);
            frame.setVisible(true);
  }
  @Override
    public  void actionPerformed(ActionEvent e){
        if (e.getSource()==Add) {
            frame.add(Tf[i]);
            this.i=i+1;
        }
        if (e.getSource()==Close) {
           frame.remove(Tf[i]); 
           this.i=i-1;
        }
    }
}
