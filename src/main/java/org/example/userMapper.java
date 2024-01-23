package org.example;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class userMapper implements RowMapper<user> {
    @Override
    public user mapRow(ResultSet rs, int rowNum) throws SQLException {
        user st = new user();
        st.setId(rs.getInt("id"));
        st.setEmail(rs.getString("firstname"));
        st.setFirstname(rs.getString("lastname"));
        st.setLastname(rs.getString("lastname"));
        st.setPassword(rs.getString("password"));
        return st;
    }
}
