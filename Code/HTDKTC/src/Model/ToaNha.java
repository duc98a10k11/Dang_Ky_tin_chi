
package Model;

public class ToaNha {
    private int idToaNha;
    private String ten, mota;
    private Truong truong;

    public ToaNha() {
    }

    public ToaNha(int idToaNha, String ten, String mota, Truong truong) {
        this.idToaNha = idToaNha;
        this.ten = ten;
        this.mota = mota;
        this.truong = truong;
    }

    public int getIdToaNha() {
        return idToaNha;
    }

    public void setIdToaNha(int idToaNha) {
        this.idToaNha = idToaNha;
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
