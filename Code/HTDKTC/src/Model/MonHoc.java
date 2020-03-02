
package Model;

public class MonHoc {
    private int idMonHoc;
    private String ten,mota;
    private DonVi donvi;
    private int soTinChi;

    public MonHoc() {
    }

    public MonHoc(int idMonHoc, String ten, String mota, DonVi donvi, int soTinChi) {
        this.idMonHoc = idMonHoc;
        this.ten = ten;
        this.mota = mota;
        this.donvi = donvi;
        this.soTinChi = soTinChi;
    }

    public int getIdMonHoc() {
        return idMonHoc;
    }

    public void setIdMonHoc(int idMonHoc) {
        this.idMonHoc = idMonHoc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public DonVi getDonvi() {
        return donvi;
    }

    public void setDonvi(DonVi donvi) {
        this.donvi = donvi;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }
    
}
