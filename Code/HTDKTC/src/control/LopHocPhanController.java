package control;

import Model.LopHocPhan;
import daoImpl.LopHocPhanDaoImpl;
import java.util.List;
import java.util.Vector;

public class LopHocPhanController {

    private LopHocPhanDaoImpl lhp;

    public LopHocPhanController() {
        this.lhp = new LopHocPhanDaoImpl();
    }

    public Vector byIdMonHoc(int idmonhoc) {
        Vector vct = new Vector();
        List<LopHocPhan> list = lhp.getLHPbyid(idmonhoc);
        for (int i = 0; i < list.size(); i++) {
            Vector temp = new Vector();
            temp.add(list.get(i).getIdLopHocPhan());
            temp.add(list.get(i).getTen());
            temp.add(list.get(i).getMota());
            temp.add(list.get(i).getMonhoc().getTen());
            vct.add(temp);
        }
        return vct;
    }
}
