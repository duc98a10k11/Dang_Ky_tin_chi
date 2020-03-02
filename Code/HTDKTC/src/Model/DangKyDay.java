
package Model;

public class DangKyDay {
    private int idDangKyDay;
    private LopHocPhan lophocphan;
    private ThanhVien thanhvien;

    public DangKyDay() {
    }

    public DangKyDay(int idDangKyDay, LopHocPhan lophocphan, ThanhVien thanhvien) {
        this.idDangKyDay = idDangKyDay;
        this.lophocphan = lophocphan;
        this.thanhvien = thanhvien;
    }

    public int getIdDangKyDay() {
        return idDangKyDay;
    }

    public void setIdDangKyDay(int idDangKyDay) {
        this.idDangKyDay = idDangKyDay;
    }

    public LopHocPhan getLophocphan() {
        return lophocphan;
    }

    public void setLophocphan(LopHocPhan lophocphan) {
        this.lophocphan = lophocphan;
    }

    public ThanhVien getThanhvien() {
        return thanhvien;
    }

    public void setThanhvien(ThanhVien thanhvien) {
        this.thanhvien = thanhvien;
    }
    
}
