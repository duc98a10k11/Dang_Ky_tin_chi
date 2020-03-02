package daoImpl;

import Model.ThanhVien;
import Model.Truong;
import dao.TruongDao;
import java.util.List;
import mapper.ThanhVienMapper;
import mapper.TruongMapper;

public class TruongDaoImpl extends AbstractDao<Truong> implements TruongDao {

    @Override
    public Truong getTruongById(int idTruong) {
        StringBuilder sb = new StringBuilder(" SELECT *\n"
                + "FROM tbl_truong AS tv\n"
                + "WHERE tv.id =?");
        List<Truong> list = this.query(sb.toString(), new TruongMapper(), idTruong);
        if (list.size() == 0) {
            return null;
        } else {
            return list.get(0);
        }
    }

}
