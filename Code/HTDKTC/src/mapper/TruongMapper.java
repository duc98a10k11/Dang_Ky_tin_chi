package mapper;

import Model.Truong;
import java.sql.ResultSet;

public class TruongMapper implements IRowMapper<Truong> {

    @Override
    public Truong mapRow(ResultSet rs) {
        Truong tr = new Truong();
        try {
            tr.setIdTruong(rs.getInt(1));
            tr.setMota(rs.getString(3));
            tr.setTen(rs.getString(2));

        } catch (Exception ex) {
            System.out.println("Converter ThanhVien:" + ex.getMessage());
            return null;
        }
        return tr;
    }

}
