package ShopItemDetail;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class ShopItemDetail extends JFrame {
    private JPanel panel1;
    private JTextArea listaitems;

    private JButton botonpocion;
    private JButton botoncasco;
    private JButton botonespada;
    private JButton botonpastel;
    private JButton botonmascota;

    private JButton bcomprar;
    private JButton bagregar;
    private JButton beliminar;

    private Vector<String> itemList;
    private String selectedItem;

    public ShopItemDetail(){
        componentes();
        itemList = new Vector<>();
        selectedItem = null;
    }

    private void componentes(){
        setSize(600,510);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(Color.white);

        panel1 = new JPanel();
        setContentPane(panel1);
        panel1.setLayout(null);

        //Etiqueta creada para contener nuestra imagen de fondo
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(0,0,585,480);
        etiqueta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("tiendag.jpg")));
        panel1.add(etiqueta1);

        //Area de texto en la que se imprimira la lista de objetos que selecciono el usuario
        listaitems = new JTextArea();
        listaitems.setBounds(34,82,154,295);
        listaitems.setFont(new Font("Arial",Font.BOLD, 12 ));
        listaitems.setForeground(Color.WHITE);
        listaitems.setBorder(null);
        listaitems.setBackground(Color.decode("#AA8948"));
        listaitems.setEditable(false);
        panel1.add(listaitems);
        panel1.setComponentZOrder(listaitems,0);

        /////////////BOTONES

        botonpocion = new JButton();
        botonpocion.setBounds(232,107,76,39);
        botonpocion.setOpaque(false);
        botonpocion.setContentAreaFilled(false);
        botonpocion.setBorderPainted(false);
        botonpocion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedItem = "Poción";
            }
        });
        panel1.add(botonpocion);
        panel1.setComponentZOrder(botonpocion, 0);

        botoncasco = new JButton();
        botoncasco.setBounds(232,164,76,39);
        botoncasco.setOpaque(false);
        botoncasco.setContentAreaFilled(false);
        botoncasco.setBorderPainted(false);
        botoncasco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedItem = "Casco";
            }
        });
        panel1.add(botoncasco);
        panel1.setComponentZOrder(botoncasco, 0);

        botonespada = new JButton();
        botonespada.setBounds(232,219,76,39);
        botonespada.setOpaque(false);
        botonespada.setContentAreaFilled(false);
        botonespada.setBorderPainted(false);
        botonespada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedItem = "Espada";
            }
        });
        panel1.add(botonespada);
        panel1.setComponentZOrder(botonespada, 0);

        botonpastel = new JButton();
        botonpastel.setBounds(232,274,76,39);
        botonpastel.setOpaque(false);
        botonpastel.setContentAreaFilled(false);
        botonpastel.setBorderPainted(false);
        botonpastel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedItem = "Pastel";
            }
        });
        panel1.add(botonpastel);
        panel1.setComponentZOrder(botonpastel, 0);

        botonmascota = new JButton();
        botonmascota.setBounds(232,329,76,39);
        botonmascota.setOpaque(false);
        botonmascota.setContentAreaFilled(false);
        botonmascota.setBorderPainted(false);
        botonmascota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedItem = "Mascota";
            }
        });
        panel1.add(botonmascota);
        panel1.setComponentZOrder(botonmascota, 0);

        bcomprar = new JButton();
        bcomprar.setBounds(53,397,116,38);
        bcomprar.setOpaque(false);
        bcomprar.setContentAreaFilled(false);
        bcomprar.setBorderPainted(false);
        bcomprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!itemList.isEmpty()) {
                    JOptionPane.showMessageDialog(panel1, "Compra exitosa!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(panel1, "No hay ítems para comprar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel1.add(bcomprar);
        panel1.setComponentZOrder(bcomprar, 0);

        bagregar = new JButton();
        bagregar.setBounds(249,410,119,41);
        bagregar.setOpaque(false);
        bagregar.setContentAreaFilled(false);
        bagregar.setBorderPainted(false);
        bagregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedItem != null) {
                    itemList.add(selectedItem);
                    updateItemList();
                }
            }
        });
        panel1.add(bagregar);
        panel1.setComponentZOrder(bagregar, 0);

        beliminar = new JButton();
        beliminar.setBounds(420,410,119,41);
        beliminar.setOpaque(false);
        beliminar.setContentAreaFilled(false);
        beliminar.setBorderPainted(false);
        beliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedItem != null && itemList.contains(selectedItem)) {
                    itemList.remove(selectedItem);
                    updateItemList();
                }
            }
        });
        panel1.add(beliminar);
        panel1.setComponentZOrder(beliminar, 0);
    }

    private void updateItemList() {
        StringBuilder items = new StringBuilder();
        for (String item : itemList) {
            items.append(item).append("\n");
        }
        listaitems.setText(items.toString());
    }

    public static void main(String[] args) {
        ShopItemDetail shopItemDetail = new ShopItemDetail();
        shopItemDetail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        shopItemDetail.setVisible(true);
    }
}
