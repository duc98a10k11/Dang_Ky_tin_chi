package mapper;

import Model.SinhVien;
import Model.ThanhVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginMapper implements IRowMapper<SinhVien> {

    @Override
    public SinhVien mapRow(ResultSet rs) {
        SinhVien sv = new SinhVien();
        try {
            sv.setIdSinhVien(rs.getInt("id"));
            sv.setMaSV(rs.getString("ma_sv"));
            try {
                ThanhVien tv = new ThanhVien();
                tv.setIdThanhVien(rs.getInt("id_thanh_vien"));
                tv.setUsername(rs.getString("username"));
                tv.setEmail(rs.getString("email"));
                tv.setPassword(rs.getString("passwords"));
                tv.setNgaySinh(rs.getDate("ngay_sinh"));
                tv.setPhoneNumber(rs.getString("phone"));
                tv.setTen(rs.getString("ho_ten"));
                sv.setThanhvien(tv);
            } catch (Exception e) {
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sv;
    }

}
