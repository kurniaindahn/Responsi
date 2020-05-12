/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

/**
 *
 * @author Kurnia Indah N
 */
public class MVC_Karyawan {
    
    ViewHome home = new ViewHome();
    ViewGaji gaji = new ViewGaji();
    ViewData data = new ViewData();
    ViewPetunjuk petunjuk = new ViewPetunjuk();
    ModelKaryawan model = new ModelKaryawan();
    ControllerKaryawan Controller = new ControllerKaryawan (model, home, gaji, data, petunjuk);
}
