/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatabase;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 62813
 */
public class Update {

    KoneksiServer konek = new KoneksiServer();

    public void update(String Nama, String Sekolah, String Asal, String Kelas) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql_Sekolah = "update santrippts set Sekolah='" + Sekolah + "'where Nama='" + Nama + "'";
            String sql_Asal = "update santrippts set Asal='" + Asal + "'where Nama='" + Nama + "'";
            String sql_Kelas = "update santrippts set Kelas='" + Kelas + "'where Nama='" + Nama + "'";

            statement.executeUpdate(sql_Sekolah);
            statement.executeUpdate(sql_Asal);
            statement.executeUpdate(sql_Kelas);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
