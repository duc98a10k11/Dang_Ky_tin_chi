
package Model;

public class LichHoc {
    private int idLichHoc;
    private PhongHoc phonghoc;
    private LopHocPhan lophocphan;
    private KipHoc kiphoc;

    public LichHoc() {
    }

    public LichHoc(int idLichHoc, PhongHoc phonghoc, LopHocPhan lophocphan, KipHoc kiphoc) {
        this.idLichHoc = idLichHoc;
        this.phonghoc = phonghoc;
        this.lophocphan = lophocphan;
        this.kiphoc = kiphoc;
    }

    public int getIdLichHoc() {
        return idLichHoc;
    }

    public void setIdLichHoc(int idLichHoc) {
        this.idLichHoc = idLichHoc;
    }

    public PhongHoc getPhonghoc() {
        return phonghoc;
    }

    public void setPhonghoc(PhongHoc phonghoc) {
        this.phonghoc = phonghoc;
    }

    public LopHocPhan getLophocphan() {
        return lophocphan;
    }

    public void setLophocphan(LopHocPhan lophocphan) {
        this.lophocphan = lophocphan;
    }

    public KipHoc getKiphoc() {
        return kiphoc;
    }

    public void setKiphoc(KipHoc kiphoc) {
        this.kiphoc = kiphoc;
    }
    
}
