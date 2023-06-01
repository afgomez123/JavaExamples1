import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FomularioSubMenu extends JFrame implements ActionListener {

  private JMenuBar menubar;
  private JMenu menu1, menu2, menu3;
  private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4;

  //constructor
  public FomularioSubMenu() {
    setLayout(null);
    // barra
    menubar = new JMenuBar();
    setJMenuBar(menubar);
    // menu
    menu1 = new JMenu("Opciones");
    menubar.add(menu1);

    // submenu
    menu2 = new JMenu("Tamano de la ventana");
    menu1.add(menu2);

    menu3 = new JMenu("Color de fondo");
    menu1.add(menu3);

    //opciones o items
    menuitem1 = new JMenuItem("300*200");
    menu2.add(menuitem1);
    menuitem1.addActionListener(this);

    menuitem2 = new JMenuItem("640*480");
    menu2.add(menuitem2);
    menuitem2.addActionListener(this);

    menuitem3 = new JMenuItem("Rojo");
    menu3.add(menuitem3);
    menuitem3.addActionListener(this);

    menuitem4 = new JMenuItem("Verde");
    menu3.add(menuitem4);
    menuitem4.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    Container fondo = this.getContentPane();

    if (e.getSource() == menuitem1) {
      setSize(300, 200);
    }
    if (e.getSource() == menuitem2) {
      setSize(640, 480);
    }
    if (e.getSource() == menuitem3) {
      fondo.setBackground(new Color(255, 0, 0));
    }
    if (e.getSource() == menuitem4) {
      fondo.setBackground(new Color(0, 255, 0));
    }
  }

  // interface
  public static void main(String args[]) {
    FomularioSubMenu formularioSubM = new FomularioSubMenu();
    formularioSubM.setBounds(0, 0, 300, 200);
    formularioSubM.setVisible(true);
    formularioSubM.setResizable(false);
    formularioSubM.setLocationRelativeTo(null);
  }
}
