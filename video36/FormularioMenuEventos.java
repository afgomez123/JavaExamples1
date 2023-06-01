import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormularioMenuEventos extends JFrame implements ActionListener {

  private JMenuBar menubar;
  private JMenu menu1;
  private JMenuItem menuitem1, menuitem2, menuitem3;

  //constructor
  public FormularioMenuEventos() {
    setLayout(null);
    // barra
    menubar = new JMenuBar();
    setJMenuBar(menubar);
    // menu
    menu1 = new JMenu("Opciones");
    menubar.add(menu1);
    //opciones o items
    menuitem1 = new JMenuItem("Rojo");
    menuitem1.addActionListener(this);
    menu1.add(menuitem1);

    menuitem2 = new JMenuItem("verde");
    menuitem2.addActionListener(this);
    menu1.add(menuitem2);

    menuitem3 = new JMenuItem("Azul");
    menuitem3.addActionListener(this);
    menu1.add(menuitem3);
  }

  public void actionPerformed(ActionEvent e) {
    Container fondo = this.getContentPane();

    if (e.getSource() == menuitem1) {
      fondo.setBackground(new Color(255, 0, 0));
    }
    if (e.getSource() == menuitem2) {
      fondo.setBackground(new Color(0, 255, 0));
    }
    if (e.getSource() == menuitem3) {
      fondo.setBackground(new Color(0, 0, 255));
    }
  }

  // interface
  public static void main(String args[]) {
    FormularioMenuEventos formularioMenu = new FormularioMenuEventos();
    formularioMenu.setBounds(0, 0, 400, 300);
    formularioMenu.setVisible(true);
    formularioMenu.setResizable(false);
    formularioMenu.setLocationRelativeTo(null);
  }
}
