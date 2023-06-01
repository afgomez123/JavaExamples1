import java.awt.event.*;
import javax.swing.*;

public class FormularioJCombox extends JFrame implements ItemListener {

  private JLabel label1;
  private JComboBox combo1;

  public FormularioJCombox() {
    setLayout(null);

    combo1 = new JComboBox();
    combo1.setBounds(10, 10, 80, 20);
    add(combo1);

    combo1.addItem("rojo");
    combo1.addItem("verde");
    combo1.addItem("azul");
    combo1.addItem("amarillo");
    combo1.addItem("negro");
    combo1.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent e) {
    if (e.getSource() == combo1) {
      String seleccion = combo1.getSelectedItem().toString();
      setTitle(seleccion);
    }
  }

  public static void main(String args[]) {
    FormularioJCombox formularioJCombox = new FormularioJCombox();
    formularioJCombox.setBounds(0, 0, 250, 150);
    formularioJCombox.setVisible(true);
    formularioJCombox.setResizable(false);
    formularioJCombox.setLocationRelativeTo(null);
  }
}
