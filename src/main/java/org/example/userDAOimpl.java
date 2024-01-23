package org.example;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class userDAOimpl extends JdbcDaoSupport implements userDAO{
    private String INSERT = "insert into user values (?, ?, ?, ?, ?)";
    private String UPDATE = " update user set email=?, firstname=?, lastname=?, password=? where id=? ";
    private String DELETE = " delete from user where id=? ";

    @Override
    public void delete(int st) {
        getJdbcTemplate().update(DELETE, st);
    }

    /*CREAT OPERATION*/
    public void safe(user st) {
        getJdbcTemplate().update(INSERT, new Object[] {st.getId(), st.getEmail(),
                st.getFirstname(), st.getLastname(), st.getPassword()});

    }
    /*UPDATE OPERATION*/
    @Override
    public void update(user st) {
        getJdbcTemplate().update(UPDATE, new Object[] {st.getEmail(), st.getFirstname(), st.getLastname(), st.getPassword(),st.getId()});

    }

    /*@Override
    *//*READ OPERATION*/
    public List<user> listusers() {
        List <user> user = getJdbcTemplate().query("select * from user", new userMapper());
        return user;
    }


}
