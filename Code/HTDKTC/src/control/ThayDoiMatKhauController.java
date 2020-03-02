package control;

import Model.SinhVien;
import daoImpl.SinhVienDaoImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ThayDoiMatKhauController {

    private SinhVienDaoImpl svImpl;
    private SinhVien sinhVien;
    private BCryptPasswordEncoder bcrypt;

    public ThayDoiMatKhauController(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
        svImpl = new SinhVienDaoImpl();
        bcrypt = new BCryptPasswordEncoder();
    }

    public boolean updatePassword(String oldPassword, String newPassword, SinhVien sv) {
        if (bcrypt.matches(oldPassword, sv.getThanhvien().getPassword())) {
            String enCode = bcrypt.encode(newPassword);
            svImpl.updatePassword(enCode, sv.getThanhvien().getIdThanhVien());
            return true;
        } else {
            return false;
        }

    }
}
