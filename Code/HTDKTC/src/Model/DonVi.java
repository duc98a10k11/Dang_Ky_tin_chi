
package Model;

public class DonVi {
    private int idDonVi;
    private String ten, mota;
    private Truong truong;
    public DonVi() {
    }

    public DonVi(int idDonVi, String ten, String mota, Truong truong) {
        this.idDonVi = idDonVi;
        this.ten = ten;
        this.mota = mota;
        this.truong = truong;
    }

    public int getIdDonVi() {
        return idDonVi;
    }

    public void setIdDonVi(int idDonVi) {
        this.idDonVi = idDonVi;
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

    public Truong getTruong() {
        return truong;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }
    
}
