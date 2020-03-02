
package Model;

public class SinhVien {
    private int idSinhVien;
    private String maSV, nganh;
    private ThanhVien thanhvien;
    private DonVi donVi;
    public SinhVien() {
    }

    public SinhVien(int idSinhVien, String maSV, String nganh, DonVi donVi, ThanhVien thanhvien) {
        this.idSinhVien = idSinhVien;
        this.maSV = maSV;
        this.nganh = nganh;
        this.donVi = donVi;
        this.thanhvien = thanhvien;
    }

    public int getIdSinhVien() {
        return idSinhVien;
    }

    public void setIdSinhVien(int idSinhVien) {
        this.idSinhVien = idSinhVien;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public DonVi getIdDonVi() {
        return donVi;
    }

    public void setIdDonVi(DonVi donVi) {
        this.donVi = donVi;
    }

    public ThanhVien getThanhvien() {
        return thanhvien;
    }

    public void setThanhvien(ThanhVien thanhvien) {
        this.thanhvien = thanhvien;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "idSinhVien=" + idSinhVien + ", maSV=" + maSV + ", nganh=" + nganh + ", thanhvien=" + thanhvien + ", donVi=" + donVi + '}';
    }
    
}
