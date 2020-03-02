package dao;

import Model.ThanhVien;
import Model.Truong;

public interface TruongDao extends GennericDao<Truong> {

    public Truong getTruongById(int idTruong);

}
