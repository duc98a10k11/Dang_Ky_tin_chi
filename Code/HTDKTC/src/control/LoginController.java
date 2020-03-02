package control;

import Model.SinhVien;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class LoginController {

    private SinhVienController svControl;
    private BCryptPasswordEncoder bcrypt;

    public LoginController() {
        this.svControl = new SinhVienController();
        this.bcrypt = new BCryptPasswordEncoder();
    }

    public SinhVien checkLogin(String username, String password) {
        SinhVien sv = svControl.getSinhVienByUsername(username);
        if (sv != null) {
            boolean checkPass = bcrypt.matches(password, sv.getThanhvien().getPassword());
            if (checkPass) {
                return sv;
            }
            return null;
        }
        return null;
    }
}
