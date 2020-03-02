package dao;

import Model.SinhVien;

public interface LoginDao extends GennericDao<SinhVien> {

    public SinhVien checkLogin(String username, String password);
}
