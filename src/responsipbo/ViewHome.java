/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 *
 * @author Kurnia Indah N
 */
public class ViewHome extends JFrame{
    
   JLabel lTitle = new JLabel ("Selamat Datang,");
   JLabel lTitle1= new JLabel ("Silahkan Masuk ke Menu Gaji untuk melakukan perhitungan gaji");
   JLabel lTitle2= new JLabel ("Jika mengalami kesulitan, klik Menu Petunjuk");
   JLabel lTitle3= new JLabel ("APLIKASI PERHITUNGAN GAJI PT.VETERAN JAYA");
   JButton btnHome = new JButton("Home");
   JButton btnGaji = new JButton("Gaji");
   JButton btnData = new JButton("Data");
   JButton btnPetunjuk = new JButton("Petunjuk");
   JButton btnAdmin = new JButton("Admin");
   
    public ViewHome(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(1000, 300);
        setLocation(200, 300);

        add(lTitle);     
        lTitle.setBounds(200, 100, 500, 20);
        add(lTitle1);
        lTitle1.setBounds(200, 125, 500, 20);
        add(lTitle2);
        lTitle2.setBounds(200, 150, 500, 20);
        add(lTitle3);
        lTitle3.setBounds(200, 260, 500, 30);
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

        setVisible(true);
        
    }
}
