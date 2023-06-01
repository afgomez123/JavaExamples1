import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Principal extends JFrame implements ActionListener {

  private JMenuBar mb;
  private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
  private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
  private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelPaterno, labelMaterno, labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
  private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  String nombreAdministrador = "";

  public Principal() {
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla Principal");
    getContentPane().setBackground(new Color(255, 0, 0));
    setIconImage(
      new ImageIcon(getClass().getResource("images/icon.png")).getImage()
    );
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombreAdministrador = ventanaBienvenida.texto;

    mb = new JMenuBar();
    mb.setBackground(new Color(255, 0, 0));
    setJMenuBar(mb);

    menuOpciones = new JMenu("Opciones");
    menuOpciones.setBackground(new Color(255, 0, 0));
    menuOpciones.setFont(new Font("Andale Mono", 1, 14));
    menuOpciones.setForeground(new Color(255, 255, 255));
    mb.add(menuOpciones);

    menuColorFondo = new JMenu("Color de fondo");
    menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
    menuColorFondo.setForeground(new Color(255, 0, 0));
    menuOpciones.add(menuColorFondo);
    menuColorFondo.addActionListener(this);

    miRojo = new JMenuItem("Rojo");
    miRojo.setFont(new Font("Andale Mono", 1, 14));
    miRojo.setForeground(new Color(255, 0, 0));
    menuColorFondo.add(miRojo);
    miRojo.addActionListener(this);

    miNegro = new JMenuItem("Negro");
    miNegro.setFont(new Font("Andale Mono", 1, 14));
    miNegro.setForeground(new Color(255, 0, 0));
    menuColorFondo.add(miNegro);
    miNegro.addActionListener(this);

    miMorado = new JMenuItem("Morado");
    miMorado.setFont(new Font("Andale Mono", 1, 14));
    miMorado.setForeground(new Color(255, 0, 0));
    menuColorFondo.add(miMorado);
    miMorado.addActionListener(this);

    miNuevo = new JMenuItem("Nuevo");
    miNuevo.setFont(new Font("Andale Mono", 1, 14));
    miNuevo.setForeground(new Color(255, 0, 0));
    menuOpciones.add(miNuevo);
    miNuevo.addActionListener(this);

    miSalir = new JMenuItem("Salir");
    miSalir.setFont(new Font("Andale Mono", 1, 14));
    miSalir.setForeground(new Color(255, 0, 0));
    menuOpciones.add(miSalir);
    miSalir.addActionListener(this);

    menuCalcular = new JMenu("Calcular");
    menuCalcular.setBackground(new Color(255, 0, 0));
    menuCalcular.setFont(new Font("Andale Mono", 1, 14));
    menuCalcular.setForeground(new Color(255, 255, 255));
    mb.add(menuCalcular);

    miCalculo = new JMenuItem("Vacaciones");
    miCalculo.setFont(new Font("Andale Mono", 1, 14));
    miCalculo.setForeground(new Color(255, 0, 0));
    menuCalcular.add(miCalculo);
    miCalculo.addActionListener(this);

    menuAcercaDe = new JMenu("Acerca de");
    menuAcercaDe.setBackground(new Color(255, 0, 0));
    menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
    menuAcercaDe.setForeground(new Color(255, 255, 255));
    mb.add(menuAcercaDe);

    miElCreador = new JMenuItem("El creador");
    miElCreador.setFont(new Font("Andale Mono", 1, 14));
    miElCreador.setForeground(new Color(255, 0, 0));
    menuAcercaDe.add(miElCreador);
    miElCreador.addActionListener(this);

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    labelLogo = new JLabel(imagen);
    labelLogo.setBounds(5, 5, 250, 100);
    add(labelLogo);

    labelBienvenido = new JLabel("Bienvenido: " + nombreAdministrador);
    labelBienvenido.setBounds(280, 30, 300, 50);
    labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
    labelBienvenido.setForeground(new Color(255, 255, 255));
    add(labelBienvenido);

    labelTitle =
      new JLabel("Datos del trabajador para el calculo de vacaciones");
    labelTitle.setBounds(45, 140, 900, 25);
    labelTitle.setFont(new Font("Andale Mono", 0, 24));
    labelTitle.setForeground(new Color(255, 255, 255));
    add(labelTitle);

    labelNombre = new JLabel("Nombre completo:");
    labelNombre.setBounds(25, 188, 180, 25);
    labelNombre.setFont(new Font("Andale Mono", 1, 12));
    labelNombre.setForeground(new Color(255, 255, 255));
    add(labelNombre);

    txtNombreTrabajador = new JTextField();
    txtNombreTrabajador.setBounds(25, 213, 150, 25);
    txtNombreTrabajador.setBackground(new Color(224, 224, 224));
    txtNombreTrabajador.setFont(new Font("Andale Mono", 1, 14));
    txtNombreTrabajador.setForeground(new Color(255, 0, 0));
    add(txtNombreTrabajador);

    labelPaterno = new JLabel("Apellido Paterno:");
    labelPaterno.setBounds(25, 248, 180, 25);
    labelPaterno.setFont(new Font("Andale Mono", 1, 12));
    labelPaterno.setForeground(new Color(255, 255, 255));
    add(labelPaterno);

    txtAPaternoTrabajador = new JTextField();
    txtAPaternoTrabajador.setBounds(25, 273, 150, 25);
    txtAPaternoTrabajador.setBackground(new Color(224, 224, 224));
    txtAPaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
    txtAPaternoTrabajador.setForeground(new Color(255, 0, 0));
    add(txtAPaternoTrabajador);

    labelMaterno = new JLabel("Apellido Materno:");
    labelMaterno.setBounds(25, 308, 180, 25);
    labelMaterno.setFont(new Font("Andale Mono", 1, 12));
    labelMaterno.setForeground(new Color(255, 255, 255));
    add(labelMaterno);

    txtAMaternoTrabajador = new JTextField();
    txtAMaternoTrabajador.setBounds(25, 334, 150, 25);
    txtAMaternoTrabajador.setBackground(new Color(224, 224, 224));
    txtAMaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
    txtAMaternoTrabajador.setForeground(new Color(255, 0, 0));
    add(txtAMaternoTrabajador);

    labelDepartamento = new JLabel("Selecciona el Departamento:");
    labelDepartamento.setBounds(220, 188, 180, 25);
    labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
    labelDepartamento.setForeground(new Color(255, 255, 255));
    add(labelDepartamento);

    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(220, 213, 220, 25);
    comboDepartamento.setBackground(new Color(224, 224, 224));
    comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
    comboDepartamento.setForeground(new Color(255, 0, 0));
    add(comboDepartamento);
    comboDepartamento.addItem("");
    comboDepartamento.addItem("Atencion al Cliente");
    comboDepartamento.addItem("Departamento de Logistica");
    comboDepartamento.addItem("Departamento de Gerencia");

    labelAntiguedad = new JLabel("Selecciona la Antiguedad:");
    labelAntiguedad.setBounds(220, 248, 180, 25);
    labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
    labelAntiguedad.setForeground(new Color(255, 255, 255));
    add(labelAntiguedad);

    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(220, 273, 220, 25);
    comboAntiguedad.setBackground(new Color(224, 224, 224));
    comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
    comboAntiguedad.setForeground(new Color(255, 0, 0));
    add(comboAntiguedad);
    comboAntiguedad.addItem("");
    comboAntiguedad.addItem("1 ano de servicios");
    comboAntiguedad.addItem("2 a 6 anos de servicio");
    comboAntiguedad.addItem("7 anos o mas de servicio");

    labelResultado = new JLabel("Resultado del Calculo:");
    labelResultado.setBounds(220, 307, 180, 25);
    labelResultado.setFont(new Font("Andale Mono", 1, 12));
    labelResultado.setForeground(new Color(255, 255, 255));
    add(labelResultado);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setBackground(new Color(224, 224, 224));
    textarea1.setFont(new Font("Andale Mono", 1, 11));
    textarea1.setForeground(new Color(255, 0, 0));
    textarea1.setText(
      "\n    Aqui aparece el resultado del calculo de las vacaciones."
    );
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(220, 333, 385, 90);
    add(scrollpane1);

    labelfooter =
      new JLabel("@2017 The Coca-Cola Company | Todos los derechos reservados");
    labelfooter.setBounds(135, 445, 500, 30);
    labelfooter.setFont(new Font("Andale Mono", 1, 12));
    labelfooter.setForeground(new Color(255, 255, 255));
    add(labelfooter);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == miCalculo) {
      String nombreTrabajador = txtNombreTrabajador.getText();
      String AP = txtAPaternoTrabajador.getText();
      String AM = txtAMaternoTrabajador.getText();
      String Departamento = comboDepartamento.getSelectedItem().toString();
      String Antiguedad = comboAntiguedad.getSelectedItem().toString();

      if (
        nombreTrabajador.equals("") ||
        AP.equals("") ||
        AM.equals("") ||
        Departamento.equals("") ||
        Antiguedad.equals("")
      ) {
        JOptionPane.showMessageDialog(
          null,
          "Debes de llenar todos los campos."
        );
      } else {
        if (Departamento.equals("Atencion al Cliente")) {
          if (Antiguedad.equals("1 ano de servicios")) {
            textarea1.setText(
              "\n   El trabajador " +
              nombreTrabajador +
              " " +
              AP +
              " " +
              AM +
              " " +
              "\n   Quien labora en " +
              Departamento +
              " con " +
              Antiguedad +
              "\n   Recibe 6 dias de vacaciones."
            );
          }
          if (Antiguedad.equals("2 a 6 anos de servicio")) {
            textarea1.setText(
              "\n   El trabajador " +
              nombreTrabajador +
              " " +
              AP +
              " " +
              AM +
              " " +
              "\n   Quien labora en " +
              Departamento +
              " con " +
              Antiguedad +
              "\n   Recibe 14 dias de vacaciones."
            );
          }
          if (Antiguedad.equals("7 anos o mas de servicio")) {
            textarea1.setText(
              "\n   El trabajador " +
              nombreTrabajador +
              " " +
              AP +
              " " +
              AM +
              " " +
              "\n   Quien labora en " +
              Departamento +
              " con " +
              Antiguedad +
              "\n   Recibe 20 dias de vacaciones."
            );
          }
        }
        if (Departamento.equals("Departamento de Logistica")) {
          if (Antiguedad.equals("1 ano de servicios")) {
            textarea1.setText(
              "\n   El trabajador " +
              nombreTrabajador +
              " " +
              AP +
              " " +
              AM +
              " " +
              "\n   Quien labora en " +
              Departamento +
              " con " +
              Antiguedad +
              "\n   Recibe 7 dias de vacaciones."
            );
          }
          if (Antiguedad.equals("2 a 6 anos de servicio")) {
            textarea1.setText(
              "\n   El trabajador " +
              nombreTrabajador +
              " " +
              AP +
              " " +
              AM +
              " " +
              "\n   Quien labora en " +
              Departamento +
              " con " +
              Antiguedad +
              "\n   Recibe 15 dias de vacaciones."
            );
          }
          if (Antiguedad.equals("7 anos o mas de servicio")) {
            textarea1.setText(
              "\n   El trabajador " +
              nombreTrabajador +
              " " +
              AP +
              " " +
              AM +
              " " +
              "\n   Quien labora en " +
              Departamento +
              " con " +
              Antiguedad +
              "\n   Recibe 22 dias de vacaciones."
            );
          }
        }
        if (Departamento.equals("Departamento de Gerencia")) {
          if (Antiguedad.equals("1 ano de servicios")) {
            textarea1.setText(
              "\n   El trabajador " +
              nombreTrabajador +
              " " +
              AP +
              " " +
              AM +
              " " +
              "\n   Quien labora en " +
              Departamento +
              " con " +
              Antiguedad +
              "\n   Recibe 10 dias de vacaciones."
            );
          }
          if (Antiguedad.equals("2 a 6 anos de servicio")) {
            textarea1.setText(
              "\n   El trabajador " +
              nombreTrabajador +
              " " +
              AP +
              " " +
              AM +
              " " +
              "\n   Quien labora en " +
              Departamento +
              " con " +
              Antiguedad +
              "\n   Recibe 20 dias de vacaciones."
            );
          }
          if (Antiguedad.equals("7 anos o mas de servicio")) {
            textarea1.setText(
              "\n   El trabajador " +
              nombreTrabajador +
              " " +
              AP +
              " " +
              AM +
              " " +
              "\n   Quien labora en " +
              Departamento +
              " con " +
              Antiguedad +
              "\n   Recibe 30 dias de vacaciones."
            );
          }
        }
      }
    }
    if (e.getSource() == miRojo) {
      getContentPane().setBackground(new Color(255, 0, 0));
    }
    if (e.getSource() == miNegro) {
      getContentPane().setBackground(new Color(0, 0, 0));
    }
    if (e.getSource() == miMorado) {
      getContentPane().setBackground(new Color(51, 0, 51));
    }
    if (e.getSource() == miNuevo) {
      txtNombreTrabajador.setText("");
      txtAPaternoTrabajador.setText("");
      txtAMaternoTrabajador.setText("");
      comboDepartamento.setSelectedIndex(0);
      comboAntiguedad.setSelectedIndex(0);
      textarea1.setText(
        "\n    Aqui aparece el resultado del calculo de las vacaciones."
      );
    }
    if (e.getSource() == miSalir) {
      Bienvenida formBienvenida = new Bienvenida();
      formBienvenida.setBounds(0, 0, 350, 450);
      formBienvenida.setVisible(true);
      formBienvenida.setResizable(false);
      formBienvenida.setLocationRelativeTo(null);
      this.setVisible(false);
    }
    if (e.getSource() == miElCreador) {
      JOptionPane.showMessageDialog(
        null,
        "Desarrollado por Andrew Here\n" + "www.appdream.com/app"
      );
    }
  }

  public static void main(String args[]) {
    Principal formularioPrincipal = new Principal();
    formularioPrincipal.setBounds(0, 0, 640, 535);
    formularioPrincipal.setVisible(true);
    formularioPrincipal.setResizable(false);
    formularioPrincipal.setLocationRelativeTo(null);
  }
}
