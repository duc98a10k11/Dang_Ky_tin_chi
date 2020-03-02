
package Model;

public class NamHoc {
    private int idNamHoc;
    private int nam;

    public NamHoc() {
    }

    public NamHoc(int idNamHoc, int nam) {
        this.idNamHoc = idNamHoc;
        this.nam = nam;
    }

    public int getIdNamHoc() {
        return idNamHoc;
    }

    public void setIdNamHoc(int idNamHoc) {
        this.idNamHoc = idNamHoc;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
}
