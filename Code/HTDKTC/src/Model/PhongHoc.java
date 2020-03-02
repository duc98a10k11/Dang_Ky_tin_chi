
package Model;

public class PhongHoc {
    private int idPhongHoc;
    private String ten, dungluong;
    private ToaNha toanha;
    
    public PhongHoc() {
    }

    public PhongHoc(int idPhongHoc, String ten, String dungluong, ToaNha toanha) {
        this.idPhongHoc = idPhongHoc;
        this.ten = ten;
        this.dungluong = dungluong;
        this.toanha = toanha;
    }

    public int getIdPhongHoc() {
        return idPhongHoc;
    }

    public void setIdPhongHoc(int idPhongHoc) {
        this.idPhongHoc = idPhongHoc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDungluong() {
        return dungluong;
    }

    public void setDungluong(String dungluong) {
        this.dungluong = dungluong;
    }

    public ToaNha getToanha() {
        return toanha;
    }

    public void setToanha(ToaNha toanha) {
        this.toanha = toanha;
    }
    
}
