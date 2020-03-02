package control;

import Model.SinhVien;
import daoImpl.SinhVienDaoImpl;

public class SinhVienController {

    private SinhVienDaoImpl svImpl;

    public SinhVienController() {
        this.svImpl = new SinhVienDaoImpl();
    }

    public SinhVien getSinhVienByUsername(String username) {
        return svImpl.getSinhVienByUsername(username);
    }

}
