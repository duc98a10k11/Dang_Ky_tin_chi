package daoImpl;

import Model.SinhVien;
import Model.ThanhVien;
import dao.SinhVienDao;
import java.util.List;
import mapper.LoginMapper;

public class SinhVienDaoImpl extends AbstractDao<SinhVien> implements SinhVienDao {

    @Override
    public SinhVien getSinhVienByUsername(String username) {
        StringBuilder sb = new StringBuilder("SELECT * \n"
                + "FROM tbl_sinh_vien as sv\n"
                + "LEFT JOIN tbl_thanh_vien as tv\n"
                + "ON sv.id_thanh_vien = tv.id\n"
                + "WHERE tv.username= ?");
        List<SinhVien> list = this.query(sb.toString(), new LoginMapper(), username);
        if (list.size() == 0) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public void updatePassword(String newPassword, int id) {
        StringBuilder sb = new StringBuilder("UPDATE tbl_thanh_vien tv\n"
                + "SET tv.passwords = ? \n"
                + "WHERE tv.id =? ");
        update(sb.toString(), newPassword, id);
    }

}
