/**
 * @author valei - vlunderwood
 * CIS175 - Fall 2023
 * Sep 25, 2023
 */
package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Lake;

/**
 * Servlet implementation class ShowLake
 */
@WebServlet("/showLake")
public class ShowLake extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowLake() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		LakeHelper helper = new LakeHelper();
		
		List<Lake> lakeList = helper.showAllLakes();

		request.setAttribute("allLakes", lakeList);
		
		String path = "/show.jsp";
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}



}
