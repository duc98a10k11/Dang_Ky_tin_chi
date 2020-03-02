package mapper;

import Model.DonVi;
import Model.MonHoc;
import daoImpl.DonViImpl;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MonHocMapper implements IRowMapper<MonHoc> {

    @Override
    public MonHoc mapRow(ResultSet rs) {
        MonHoc mh = new MonHoc();
        try {
            mh.setIdMonHoc(rs.getInt("id"));
            mh.setMota(rs.getString("mo_ta"));
            mh.setTen(rs.getString("ten"));
            mh.setSoTinChi(rs.getInt("so_tin_chi"));
            int id_donvi = rs.getInt("id_don_vi");
            DonViImpl dvi = new DonViImpl();
            DonVi dv = dvi.getDonVibyId(id_donvi);
            mh.setDonvi(dv);

        } catch (SQLException ex) {
            System.out.println("Converter ThanhVien:" + ex.getMessage());
            return null;
        }
        return mh;
    }

}
