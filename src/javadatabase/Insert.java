/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatabase;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 62813
 */
public class Insert {

    KoneksiServer konek = new KoneksiServer();

    public void insert(String Nama, String Sekolah, String Asal, String Kelas) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "insert into santrippts values('" + Nama + "','" + Sekolah + "','" + Asal + "','" + Kelas + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
