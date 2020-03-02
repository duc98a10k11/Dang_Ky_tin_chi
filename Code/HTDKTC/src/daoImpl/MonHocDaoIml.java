package daoImpl;

import Model.MonHoc;
import Model.ThanhVien;
import dao.MonHocDao;
import java.util.List;
import mapper.MonHocMapper;
import mapper.ThanhVienMapper;

public class MonHocDaoIml extends AbstractDao<MonHoc> implements MonHocDao {

    @Override
    public List<MonHoc> getListMonHoc() {
        StringBuilder sb = new StringBuilder(" SELECT *\n"
                + "FROM tbl_mon_hoc");
        List<MonHoc> list = this.query(sb.toString(), new MonHocMapper());
        if (list.size() == 0) {
            return null;
        } else {
            return list;
        }
    }

    public MonHoc getMhbyId(int id_mon_hoc) {
        StringBuilder sb = new StringBuilder(" SELECT *\n"
                + "FROM tbl_mon_hoc AS tv\n"
                + "WHERE tv.id =?");
        List<MonHoc> list = this.query(sb.toString(), new MonHocMapper(), id_mon_hoc);
        if (list.size() == 0) {
            return null;
        } else {
            return list.get(0);
        }
    }

    public List<MonHoc> getListbyName(String name) {
        StringBuilder sb = new StringBuilder(" SELECT *\n"
                + "FROM tbl_mon_hoc AS mh\n"
                + "WHERE mh.ten LIKE '%" + name + "%';"
        );
        List<MonHoc> list = this.query(sb.toString(), new MonHocMapper());
        if (list.size() == 0) {
            return null;
        } else {
            return list;
        }
    }

}
