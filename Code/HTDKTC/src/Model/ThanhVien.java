package Model;

import java.sql.Date;

public class ThanhVien {

    private int idThanhVien, idDonVi;
    private String ten, email, username, password, phoneNumber;
    private Date ngaySinh;

    public ThanhVien() {
    }

    public ThanhVien(int idThanhVien, String phoneNumber, String ten, String email, String username, String password, int idDonVi, Date ngaySinh) {
        this.idThanhVien = idThanhVien;
        this.phoneNumber = phoneNumber;
        this.ten = ten;
        this.email = email;
        this.username = username;
        this.password = password;
        this.idDonVi = idDonVi;
        this.ngaySinh = ngaySinh;
    }

    public int getIdThanhVien() {
        return idThanhVien;
    }

    public void setIdThanhVien(int idThanhVien) {
        this.idThanhVien = idThanhVien;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdDonVi() {
        return idDonVi;
    }

    public void setIdDonVi(int idDonVi) {
        this.idDonVi = idDonVi;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "ThanhVien{" + "idThanhVien=" + idThanhVien + ", idDonVi=" + idDonVi + ", ten=" + ten + ", email=" + email + ", username=" + username + ", password=" + password + ", phoneNumber=" + phoneNumber + ", ngaySinh=" + ngaySinh + '}';
    }

}
