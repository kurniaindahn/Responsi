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
public class ViewGaji extends JFrame{
    
   int tunjangan, total, pajak;
   int tun = 15000;
   
   JLabel lTitle = new JLabel ("APLIKASI PERHITUNGAN GAJI PT.VETERAN JAYA");
   JLabel lID = new JLabel("ID Pegawai");
   JTextField tfID = new JTextField();
   JLabel lNama= new JLabel("Nama");
   JTextField tfNama = new JTextField();
   JLabel lPosisi = new JLabel("Posisi");
   String[] namaPosisi =
        {" Surveyor", " Marketing", " Manager", " Programmer"};
   JComboBox cmbPosisi = new JComboBox(namaPosisi);
   JLabel lAlamat = new JLabel("Alamat");
   JTextField tfAlamat = new JTextField();
   JLabel lHP = new JLabel("No HP");
   JTextField tfHP = new JTextField();
   JLabel lGaji = new JLabel("Gaji Pokok");
   JTextField tfGaji = new JTextField();
   JLabel lLembur = new JLabel("Jam Lembur");
   JTextField tfLembur = new JTextField();
   JLabel lTunjangan = new JLabel("Tunjangan");
   JTextField tfTunjangan = new JTextField();
   JLabel lPajak = new JLabel("Pajak");
   JTextField tfPajak= new JTextField();
   JLabel lTotal = new JLabel("Total Gaji");
   JTextField tfTotal = new JTextField();
   JButton btnHitung = new JButton("Hitung");
   JButton btnSimpan = new JButton("Simpan");
   JButton btnHome = new JButton("Home");
   JButton btnGaji = new JButton("Gaji");
   JButton btnData = new JButton("Data");
   JButton btnPetunjuk = new JButton("Petunjuk");
   JButton btnAdmin = new JButton("Admin");
   
    public ViewGaji(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(1000, 500);
        setLocation(100, 200);

        add(lTitle);     
        lTitle.setBounds(380, 420, 900, 40);
        add(lID);
        lID.setBounds(140, 30, 100, 20);
        add(tfID);
        tfID.setBounds(250, 30, 300, 20);
        add(lNama);
        lNama.setBounds(140, 70, 100, 20);
        add(tfNama);
        tfNama.setBounds(250, 70, 300, 20);
        add(lPosisi);
        lPosisi.setBounds(140, 110, 100, 20);
        add(cmbPosisi);
        cmbPosisi.setBounds(250, 110, 300, 20);
        add(lAlamat);
        lAlamat.setBounds(140, 150, 100, 20);
        add(tfAlamat);
        tfAlamat.setBounds(250, 150, 300, 20);
        add(lHP);
        lHP.setBounds(140, 190, 100, 20);
        add(tfHP);
        tfHP.setBounds(250, 190, 300, 20);
        add(lGaji);
        lGaji.setBounds(140, 230, 100, 20);
        add(tfGaji);
        tfGaji.setBounds(250, 230, 300, 20);
        add(lLembur);
        lLembur.setBounds(140, 270, 100, 20);
        add(tfLembur);
        tfLembur.setBounds(250, 270, 300, 20);
        add(lTunjangan);
        lTunjangan.setBounds(140, 310, 100, 20);
        add(tfTunjangan);
        tfTunjangan.setBounds(250, 310, 300, 20);
        add(lPajak);
        lPajak.setBounds(140, 350, 100, 20);
        add(tfPajak);
        tfPajak.setBounds(250, 350, 300, 20);
        add(lTotal);
        lTotal.setBounds(140, 390, 100, 20);
        add(tfTotal);
        tfTotal.setBounds(250, 390, 300, 20);
        add(btnHitung);
        btnHitung.setBounds(850, 290, 100, 40);
        add(btnSimpan);
        btnSimpan.setBounds(850, 350, 100, 40);
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
        
        btnHitung.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){

        }
   });setVisible(true);
    }
    public String getID(){
       return tfID.getText();
    }
    public String getNama(){
       return tfNama.getText();
    }
    public String getPosisi(){
       return (String) cmbPosisi.getSelectedItem();
    }
    public String getGaji(){
       return tfGaji.getText();
    }
    public String getLembur(){
       return tfLembur.getText();
    }
    public String getTunjangan(){
       return tfTunjangan.getText();
    }
    public String getTotal(){
       return tfTotal.getText();
    }
     
}
