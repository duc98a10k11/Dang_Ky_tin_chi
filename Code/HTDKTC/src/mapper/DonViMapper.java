package mapper;

import Model.DonVi;
import Model.ThanhVien;
import Model.Truong;
import daoImpl.TruongDaoImpl;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DonViMapper implements IRowMapper<DonVi> {

    @Override
    public DonVi mapRow(ResultSet rs) {

        DonVi dv = new DonVi();
        try {
            dv.setIdDonVi(rs.getInt("id"));
            dv.setMota(rs.getString("mo_ta"));
            dv.setTen(rs.getString("ten_don_vi"));
            int id_truong = rs.getInt("id_truong");
            TruongDaoImpl tdi = new TruongDaoImpl();
            Truong tr = tdi.getTruongById(id_truong);
            dv.setTruong(tr);

        } catch (SQLException ex) {
            System.out.println("Converter ThanhVien:" + ex.getMessage());
            return null;
        }
        return dv;
    }

}
