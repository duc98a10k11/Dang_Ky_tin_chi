package htdktc;

import Model.ThanhVien;
import daoImpl.ThanhVienDaoImpl;
import java.util.List;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class HTDKTC {

    public static void main(String[] args) {
//        ThanhVienDaoImpl tvImpl = new ThanhVienDaoImpl();
//        ThanhVien tv = tvImpl.getThanhVienById(1);
//        System.out.println(tv.toString());
//        System.out.println("List Thanh vien: ");
//        List<ThanhVien> list = tvImpl.getListThanhVien();
//        for(ThanhVien a: list){
//            System.out.println(a.toString());
//        }

        String password = "Minhduc@97";
//        String bcryptHashString = BCrypt.withDefaults().hashToString(12, password.toCharArray());
//        System.out.println(bcryptHashString);
        BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
        System.out.println(bcrypt.encode(password));
    }

}
