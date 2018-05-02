package jd.dao.testcases;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import jd.dao.UserDAO;
import jd.model.User;

public class UserDAOTest {
	UserDAO userDAO;
	User user;
	
	@Before
	public void testPrep() {
		userDAO = new UserDAO();
		user = new User();
		
		//Set expected data to user
		user.setUser_email("test");
		user.setUser_name("Jacob Nartey");
		user.setUser_password("test password");
	}
	
	@Test
	public void loginTest() throws SQLException {
		User actualUser = userDAO.login(user.getUser_email(), user.getUser_password());
		//assertThat(user.getUser_name(), equalTo(actualUser.getUser_name()));
		assertThat(actualUser, hasProperty("user_name", equalTo(user.getUser_name())));
		
	}
}
