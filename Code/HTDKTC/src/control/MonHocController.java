package control;

import Model.MonHoc;
import daoImpl.MonHocDaoIml;
import java.util.List;
import java.util.Vector;

public class MonHocController {

    private MonHocDaoIml impl;

    public MonHocController() {
        this.impl = new MonHocDaoIml();
    }

    public Vector vctMonHoc() {
        Vector vct = new Vector();

        List<MonHoc> lmh = impl.getListMonHoc();
        for (int i = 0; i < lmh.size(); i++) {
            Vector temp = new Vector();
            temp.add(lmh.get(i).getIdMonHoc());
            temp.add(lmh.get(i).getTen());
            temp.add(lmh.get(i).getMota());
            temp.add(lmh.get(i).getSoTinChi());
            vct.add(temp);
        }
        return vct;
    }

    public Vector byName(String name) {
        Vector vct = new Vector();
        List<MonHoc> lmh = impl.getListbyName(name);
        for (int i = 0; i < lmh.size(); i++) {
            Vector temp = new Vector();
            temp.add(lmh.get(i).getIdMonHoc());
            temp.add(lmh.get(i).getTen());
            temp.add(lmh.get(i).getMota());
            temp.add(lmh.get(i).getSoTinChi());
            vct.add(temp);
        }
        if (vct.size() == 0) {
            return null;
        }
        return vct;
    }

}
