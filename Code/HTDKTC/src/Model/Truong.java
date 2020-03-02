package Model;

public class Truong {

    private String ten, mota;
    private int idTruong;

    public Truong() {
    }

    public Truong(String ten, String mota, int idTruong) {
        this.ten = ten;
        this.mota = mota;
        this.idTruong = idTruong;
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

    public int getIdTruong() {
        return idTruong;
    }

    public void setIdTruong(int idTruong) {
        this.idTruong = idTruong;
    }

}
