import javax.swing.event.*;
import javax.swing.*;

public class FormularioCheckbox extends JFrame implements ChangeListener {

  private JCheckBox check1, check2, check3;

  //constructor
  public FormularioCheckbox() {
    setLayout(null);
    // barra
    check1 = new JCheckBox("Ingles");
    check1.setBounds(10, 10, 150, 30);
    check1.addChangeListener(this);
    add(check1);

    check2 = new JCheckBox("Francés");
    check2.setBounds(10, 50, 150, 30);
    check2.addChangeListener(this);
    add(check2);

    check3 = new JCheckBox("Aleman");
    check3.setBounds(10, 90, 150, 30);
    check3.addChangeListener(this);
    add(check3);
  }

  public void stateChanged(ChangeEvent e) {
    String cadena = "";

    if (check1.isSelected() == true) {
      cadena = cadena + "Ingles-";
    }
    if (check2.isSelected() == true) {
      cadena = cadena + "Francés-";
    }
    if (check3.isSelected() == true) {
      cadena = cadena + "Aleman-";
    }
    setTitle(cadena);
  }

  // interface
  public static void main(String args[]) {
    FormularioCheckbox FormularioCheck = new FormularioCheckbox();
    FormularioCheck.setBounds(0, 0,350, 200);
    FormularioCheck.setVisible(true);
    FormularioCheck.setResizable(false);
    FormularioCheck.setLocationRelativeTo(null);
  }
}
