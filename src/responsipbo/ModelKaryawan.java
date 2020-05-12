/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Kurnia Indah N
 */
public class ModelKaryawan {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsipbo";
    static final String USER = "root";
    static final String PASS = "";
    Connection koneksi;
    Statement statement;

   
    public  ModelKaryawan(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Koneksi berhasil");
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi gagal");
        }
    }

    public void Simpan (String ID, String Nama, String Posisi, String Gaji, String Lembur, String Tunjangan, String Total){
        try{
            String query = "INSERT INTO `karyawan` (`id`, `nama`, `posisi`, `gaji`, `lembur`, `tunjangan`, `total`) VALUES ('"+ID+"', '"+Nama+"', '"+Posisi+"', '"+Gaji+"', '"+Lembur+"', '"+Tunjangan+"', '"+Total+"')";
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
        } catch (Exception sql){
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }

    public String[][] Show(){
        try{
            int jmlData = 0;
            int no = 0;
            String data[][] = new String[getBanyakData()][8];
            String query = "Select * from `karyawan`";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                no++;
                String str = Integer.toString(no);
                data[jmlData][0] = resultSet.getString("id");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("posisi");
                data[jmlData][3] = resultSet.getString("gaji");
                data[jmlData][4] = resultSet.getString("lembur");
                data[jmlData][5] = resultSet.getString("tunjangan");
                data[jmlData][6] = resultSet.getString("total");
                jmlData++;
            }
            return data;
        } catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL ERROR");
            return null;
        }
    }

    public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from `karyawan`";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            } return jmlData;
        } catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL ERROR");
            return 0;
        }
    }
}
 
