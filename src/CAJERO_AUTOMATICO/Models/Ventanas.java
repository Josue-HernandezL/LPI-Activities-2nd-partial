package CAJERO_AUTOMATICO.Models;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIProgram extends JFrame {
    private static  JTextField textField;
    private static  JTextArea  textArea;
    private static  JButton buttonRegister;
    private static  JButton buttonIniciar;

    public GUIProgram () {
        //Configuracion de la ventana
        setTitle("Cajero automatico");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        //Creacion de componentes
        textField = new JTextField(10);
        textField.setText("Seleccione una opcion");
        buttonRegister = new JButton("Registrarse");
        buttonIniciar = new JButton("Iniciar");

        //Agregar los componentes a la ventana
        add(textField);
        add(buttonRegister);
        add(buttonIniciar);

        //configurar los eventos
        buttonRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

    }
}