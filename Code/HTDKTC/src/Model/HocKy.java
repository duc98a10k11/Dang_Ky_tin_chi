
package Model;

public class HocKy {
    private int idHocKy;
    private NamHoc namhoc;
    private int hocky;

    public HocKy() {
    }

    public HocKy(int idHocKy, NamHoc namhoc, int hocky) {
        this.idHocKy = idHocKy;
        this.namhoc = namhoc;
        this.hocky = hocky;
    }

    public int getIdHocKy() {
        return idHocKy;
    }

    public void setIdHocKy(int idHocKy) {
        this.idHocKy = idHocKy;
    }

    public NamHoc getNamhoc() {
        return namhoc;
    }

    public void setNamhoc(NamHoc namhoc) {
        this.namhoc = namhoc;
    }

    public int getHocky() {
        return hocky;
    }

    public void setHocky(int hocky) {
        this.hocky = hocky;
    }
    
}
