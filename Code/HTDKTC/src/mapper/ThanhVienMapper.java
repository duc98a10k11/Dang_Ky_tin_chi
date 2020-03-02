package mapper;

import Model.ThanhVien;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ThanhVienMapper implements IRowMapper<ThanhVien> {

    @Override
    public ThanhVien mapRow(ResultSet rs) {
        ThanhVien tv = new ThanhVien();
        try {
            tv.setIdThanhVien(rs.getInt("id"));
            tv.setTen(rs.getString("ho_ten"));
            tv.setNgaySinh(rs.getDate("ngay_sinh"));
            tv.setEmail(rs.getString("email"));
            tv.setUsername(rs.getString("username"));
            tv.setPassword(rs.getString("password"));

        } catch (SQLException ex) {
            System.out.println("Converter ThanhVien:" + ex.getMessage());
            return null;
        }
        return tv;
    }

}
