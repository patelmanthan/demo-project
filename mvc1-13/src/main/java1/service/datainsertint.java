package service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface datainsertint {

	void insert(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException;

	//void image(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
}
