
package Model;

import java.util.Date;

public class KipHoc {
    private Date ngay;
    private int ca;
    private int idKipHoc;

    public KipHoc() {
    }

    public KipHoc(Date ngay, int ca, int idKipHoc) {
        this.ngay = ngay;
        this.ca = ca;
        this.idKipHoc = idKipHoc;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public int getCa() {
        return ca;
    }

    public void setCa(int ca) {
        this.ca = ca;
    }

    public int getIdKipHoc() {
        return idKipHoc;
    }

    public void setIdKipHoc(int idKipHoc) {
        this.idKipHoc = idKipHoc;
    }
    
}
