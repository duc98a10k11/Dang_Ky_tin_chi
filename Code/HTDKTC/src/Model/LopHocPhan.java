
package Model;

public class LopHocPhan {
    private int idLopHocPhan;
    private String ten,mota;
    private MonHoc monhoc;

    public LopHocPhan() {
    }

    public LopHocPhan(int idLopHocPhan, String ten, String mota, MonHoc monhoc) {
        this.idLopHocPhan = idLopHocPhan;
        this.ten = ten;
        this.mota = mota;
        this.monhoc = monhoc;
    }

    public int getIdLopHocPhan() {
        return idLopHocPhan;
    }

    public void setIdLopHocPhan(int idLopHocPhan) {
        this.idLopHocPhan = idLopHocPhan;
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

    public MonHoc getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(MonHoc monhoc) {
        this.monhoc = monhoc;
    }
    
}
