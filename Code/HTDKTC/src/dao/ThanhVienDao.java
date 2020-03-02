package dao;

import Model.ThanhVien;
import java.util.List;

public interface ThanhVienDao extends GennericDao<ThanhVien> {

    public ThanhVien getThanhVienById(int idThanhVien);

    public List<ThanhVien> getListThanhVien();
}
