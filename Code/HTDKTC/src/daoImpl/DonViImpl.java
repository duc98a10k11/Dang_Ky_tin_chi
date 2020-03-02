/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import Model.DonVi;
import Model.ThanhVien;
import dao.DonViDao;
import java.util.List;
import mapper.DonViMapper;
import mapper.ThanhVienMapper;

/**
 *
 * @author Hiep Si Mat Buon
 */
public class DonViImpl extends AbstractDao<DonVi> implements DonViDao{

    @Override
    public DonVi getDonVibyId(int idDonVi) {
         StringBuilder sb = new StringBuilder(" SELECT *\n"
                + "FROM tbl_don_vi AS dv\n"
                + "WHERE dv.id =?");
        List<DonVi> list = this.query(sb.toString(), new DonViMapper(), idDonVi);
        if (list.size() == 0) {
            return null;
        } else {
            return list.get(0);
        }
    }
  
}
