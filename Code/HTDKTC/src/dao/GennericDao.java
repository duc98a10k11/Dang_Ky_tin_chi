
package dao;

import java.util.List;
import mapper.IRowMapper;

public interface GennericDao<T> {

    public List<T> query(String sql, IRowMapper<T> rowMapper, Object... parameters);

    public void update(String sql, Object... parameters);

    public Long insert(String sql, Object... parameters);

    public int count(String sql, Object... parameters);

    public Long delete(String sql, Object... parameters);
}
