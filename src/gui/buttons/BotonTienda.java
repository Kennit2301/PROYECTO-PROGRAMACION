package gui.buttons;

import ShopItemDetail.ShopItemDetail;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonTienda extends JButton {

    public BotonTienda() {
        super("Abrir Tienda");
        // Propiedades básicas del botón
        setPreferredSize(new Dimension(150, 30));
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.BLACK);

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShopItemDetail shopItemDetail = new ShopItemDetail();
                shopItemDetail.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                shopItemDetail.setVisible(true);
            }
        });
    }
}

