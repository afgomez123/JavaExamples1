import javax.swing.*;
import java.awt.event.*;

public class FormularioButton extends JFrame implements ActionListener {
    
    JButton boton1;
    public FormularioButton(){
        setLayout(null);
        boton1 = new JButton("Cerrar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            System.exit(0);
        }
    }

    public static void main(String args[]){
        FormularioButton formulario1 = new FormularioButton();
        formulario1.setBounds(0,0,450,350);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }  
}