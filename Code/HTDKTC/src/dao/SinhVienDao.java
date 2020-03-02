package dao;

import Model.SinhVien;

public interface SinhVienDao extends GennericDao<SinhVien> {

    public SinhVien getSinhVienByUsername(String username);

    public void updatePassword(String newPassword, int id);
}
