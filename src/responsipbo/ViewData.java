/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kurnia Indah N
 */
public class ViewData extends JFrame{

    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID", "Nama", "Posisi", "Gaji Pokok", "Jam Lembur", "Tunjangan", "Total Gaji"};
    JButton btnShow = new JButton("Show");
    JButton btnHome = new JButton("Home");
    JButton btnGaji = new JButton("Gaji");
    JButton btnData = new JButton("Data");
    JButton btnPetunjuk = new JButton("Petunjuk");
    JButton btnAdmin = new JButton("Admin");
   
    public ViewData(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(1000, 500);
        setLocation(100, 200);

        add(btnShow);
        btnShow.setBounds(295, 270, 80, 20);
        add(btnHome);
        btnHome.setBounds(20, 20, 100, 40);
        add(btnGaji);
        btnGaji.setBounds(20, 80, 100, 40);
        add(btnData);
        btnData.setBounds(20, 140, 100, 40);
        add(btnPetunjuk);
        btnPetunjuk.setBounds(20, 200, 100, 40);
        add(btnAdmin);
        btnAdmin.setBounds(880, 20, 100, 40);

        tableModel = new DefaultTableModel (namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);

        add(scrollPane);
        scrollPane.setBounds(400, 70, 700, 220);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        setVisible(true);}
}
