
package daoImpl;

import Model.LopHocPhan;
import java.util.List;
import javax.swing.UIManager;
import mapper.LopHocPhanMapper;


public class LopHocPhanDaoImpl extends AbstractDao<LopHocPhan> implements dao.LopHocPhanDao{

    @Override
    public List<LopHocPhan> getLopHocPhan() {
         StringBuilder sb = new StringBuilder(" SELECT *\n"
                + "FROM tbl_lop_hoc_phan");
        List<LopHocPhan> list = this.query(sb.toString(), new LopHocPhanMapper());
        if (list.size() == 0) {
            return null;
        } else {
            return list;
        }
    }  public List<LopHocPhan> getLHPbyid(int idmonhoc) {
         StringBuilder sb = new StringBuilder(" SELECT *\n"
                + " FROM tbl_lop_hoc_phan AS qh\n"
                + " WHERE qh.id_mon_hoc =?;");
        List<LopHocPhan> list = this.query(sb.toString(), new LopHocPhanMapper(),idmonhoc);
        if (list.size() == 0) {
            return null;
        } else {
            return list;
        }
    }

    
}
