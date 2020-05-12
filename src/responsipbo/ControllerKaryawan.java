/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Kurnia Indah N
 */
public class ControllerKaryawan {
    ViewHome home;
    ViewGaji gaji;
    ViewData data;
    ViewPetunjuk petunjuk;    
    ModelKaryawan model;
    
    public ControllerKaryawan (ModelKaryawan model, ViewHome home, ViewGaji gaji, ViewData data, ViewPetunjuk petunjuk){
        this.home = home;        
        this.model = model;
        this.gaji = gaji;
        this.data = data;
        this.petunjuk = petunjuk;
        
        if(model.getBanyakData() !=0){
           String databanyak[][]= model.Show();
           data.tabel.setModel((new JTable(databanyak, data.namaKolom)).getModel());
        }
        else{
            JOptionPane.showMessageDialog(null,"Data Tidak ada");          
        }
        
    gaji.btnSimpan.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if ( gaji.getID().equals("")
                    || gaji.getNama().equals("")
                    || gaji.getPosisi().equals("")
                    || gaji.getGaji().equals("")
                    || gaji.getLembur().equals("")
                    || gaji.getTunjangan().equals("")
                    || gaji.getTotal().equals(""));
            }
        }
    ); 
    gaji.btnHome.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ViewHome home = new ViewHome();
            dispose();
        }
   });
    
    gaji.btnGaji.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ViewGaji gaji = new ViewGaji();
            dispose();
        }
    });
    
    gaji.btnData.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ViewData data = new ViewData();
            dispose();
        }
    });

    gaji.btnPetunjuk.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ViewPetunjuk petunjuk = new ViewPetunjuk();
            dispose();
        }
    });
        
   data.btnShow.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String databanyak[][] = model.Show();
            data.tabel.setModel(new JTable (databanyak, data.namaKolom).getModel());   
            gaji.tfID.setText(null);
            gaji.tfNama.setText(null);
            gaji.cmbPosisi.setSelectedItem(this);
            gaji.tfGaji.setText(null);
            gaji.tfLembur.setText(null);
            gaji.tfTunjangan.setText(null);
            gaji.tfTotal.setText(null);
        }
    });
   
    data.btnHome.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ViewHome home = new ViewHome();
            dispose();
        }
   });
    
    data.btnGaji.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ViewGaji gaji = new ViewGaji();
            dispose();
        }
    });
    
    data.btnData.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ViewData data = new ViewData();
            dispose();
        }
    });

    data.btnPetunjuk.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ViewPetunjuk petunjuk = new ViewPetunjuk();
            dispose();
        }
    });
   
    home.btnHome.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ViewHome home = new ViewHome();
            dispose();
        }
   });
    
    home.btnGaji.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ViewGaji gaji = new ViewGaji();
            dispose();
        }
    });
    
    home.btnData.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ViewData data = new ViewData();
            dispose();
        }
    });

    home.btnPetunjuk.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ViewPetunjuk petunjuk = new ViewPetunjuk();
            dispose();
        }
    });
    
    petunjuk.btnhome.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            ViewHome home = new ViewHome();
        }
   }
);
}

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
}
    
