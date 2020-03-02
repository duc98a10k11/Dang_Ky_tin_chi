package mapper;

import Model.LopHocPhan;
import Model.MonHoc;
import daoImpl.MonHocDaoIml;
import java.sql.ResultSet;

public class LopHocPhanMapper implements IRowMapper<LopHocPhan> {

    @Override
    public LopHocPhan mapRow(ResultSet rs) {
        LopHocPhan lhp = new LopHocPhan();
        try {
            lhp.setIdLopHocPhan(rs.getInt("id"));
            lhp.setTen(rs.getString("ten"));
            lhp.setMota(rs.getString("mota"));
            int k = rs.getInt("id_mon_hoc");
            MonHocDaoIml iml = new MonHocDaoIml();
            MonHoc mh = iml.getMhbyId(k);
            lhp.setMonhoc(mh);
        } catch (Exception ex) {
            System.out.println("Converter LopHocPhan:" + ex.getMessage());
            return null;

        }
        return lhp;
    }

}
