/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Kurnia Indah N
 */
public class ViewPetunjuk extends JFrame{

    JLabel lTitle = new JLabel ("PETUNJUK KARYAWAN");
    JLabel lTitle1= new JLabel ("Klik tombol gaji untuk menghitung gaji anda");
    JLabel lTitle2= new JLabel ("Klik tombol data untuk melihat data sudah masuk atau belum");
    JButton btnhome = new JButton ("Home");
    
    public ViewPetunjuk(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(700, 300);
        setLocation(200, 300);

        add(lTitle);     
        lTitle.setBounds(150, 20, 500, 50);
        add(lTitle1);
        lTitle1.setBounds(150, 100, 500, 20);
        add(lTitle2);
        lTitle2.setBounds(150, 130, 500, 20);
        add(btnhome);
        btnhome.setBounds(200, 175, 100, 40);
        
        setVisible(true);
    }
}
