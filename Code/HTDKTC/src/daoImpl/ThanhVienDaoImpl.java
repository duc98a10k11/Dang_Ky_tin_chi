package daoImpl;

import Model.ThanhVien;
import dao.ThanhVienDao;
import java.util.List;
import mapper.ThanhVienMapper;

public class ThanhVienDaoImpl extends AbstractDao<ThanhVien> implements ThanhVienDao {

    @Override
    public ThanhVien getThanhVienById(int idThanhVien) {
        StringBuilder sb = new StringBuilder(" SELECT *\n"
                + "FROM tbl_thanh_vien AS tv\n"
                + "WHERE tv.id =?");
        List<ThanhVien> list = this.query(sb.toString(),
                new ThanhVienMapper(), idThanhVien);
        if (list.size() == 0) {
            return null;
        } else {
            return list.get(0);
        }

    }

    @Override
    public List<ThanhVien> getListThanhVien() {
        StringBuilder sb = new StringBuilder(" SELECT *\n"
                + "FROM tbl_thanh_vien");
        List<ThanhVien> list = this.query(sb.toString(), new ThanhVienMapper());
        if (list.size() == 0) {
            return null;
        } else {
            return list;
        }
    }
    public static void main(String[] args) {
        ThanhVienDaoImpl dim = new ThanhVienDaoImpl();
        ThanhVien tv = dim.getThanhVienById(1);
        System.out.println(tv.getTen());
    }

}
