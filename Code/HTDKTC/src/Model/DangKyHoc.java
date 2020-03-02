/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class DangKyHoc {
    private int idDangKyHoc;
    private SinhVien sinhvien;
    private LopHocPhan lophocphan;
    private double diemTP1, diemTP2, diemTP3, diemThi, diemTB;

    public DangKyHoc() {
    }

    public int getIdDangKyHoc() {
        return idDangKyHoc;
    }

    public void setIdDangKyHoc(int idDangKyHoc) {
        this.idDangKyHoc = idDangKyHoc;
    }

    public SinhVien getSinhvien() {
        return sinhvien;
    }

    public void setSinhvien(SinhVien sinhvien) {
        this.sinhvien = sinhvien;
    }

    public LopHocPhan getLophocphan() {
        return lophocphan;
    }

    public void setLophocphan(LopHocPhan lophocphan) {
        this.lophocphan = lophocphan;
    }

    public double getDiemTP1() {
        return diemTP1;
    }

    public void setDiemTP1(double diemTP1) {
        this.diemTP1 = diemTP1;
    }

    public double getDiemTP2() {
        return diemTP2;
    }

    public void setDiemTP2(double diemTP2) {
        this.diemTP2 = diemTP2;
    }

    public double getDiemTP3() {
        return diemTP3;
    }

    public void setDiemTP3(double diemTP3) {
        this.diemTP3 = diemTP3;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
}
