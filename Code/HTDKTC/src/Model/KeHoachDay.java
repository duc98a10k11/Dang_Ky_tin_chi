
package Model;

public class KeHoachDay {
    private int idKeHoachDay;
    private HocKy hocky;
    private MonHoc monhoc;
    public KeHoachDay() {
    }

    public KeHoachDay(int idKeHoachDay, HocKy hocky, MonHoc monhoc) {
        this.idKeHoachDay = idKeHoachDay;
        this.hocky = hocky;
        this.monhoc = monhoc;
    }

    public int getIdKeHoachDay() {
        return idKeHoachDay;
    }

    public void setIdKeHoachDay(int idKeHoachDay) {
        this.idKeHoachDay = idKeHoachDay;
    }

    public HocKy getHocky() {
        return hocky;
    }

    public void setHocky(HocKy hocky) {
        this.hocky = hocky;
    }

    public MonHoc getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(MonHoc monhoc) {
        this.monhoc = monhoc;
    }
    
}
