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
public class Delete {

    KoneksiServer konek = new KoneksiServer();

    public void delete(String Nama) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "delete from santrippts where Nama = '" + Nama + "'";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
