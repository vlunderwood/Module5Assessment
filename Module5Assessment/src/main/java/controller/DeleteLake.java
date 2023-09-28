/**
 * @author valei - vlunderwood
 * CIS175 - Fall 2023
 * Sep 25, 2023
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Lake;

/**
 * Servlet implementation class DeleteLake
 */
@WebServlet("/deleteLake")
public class DeleteLake extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteLake() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LakeHelper helper = new LakeHelper();
		String lakeName = request.getParameter("lakeName");
		Lake deleteable = helper.searchLakeByLakeName(lakeName);
		helper.delete(deleteable);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}
	
}
