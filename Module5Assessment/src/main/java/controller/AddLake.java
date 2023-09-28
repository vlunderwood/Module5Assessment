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
 * Servlet implementation class addLake
 */
@WebServlet("/addLake")
public class AddLake extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLake() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Lake l = new Lake();
		LakeHelper helper = new LakeHelper();
		l.setLakeName(request.getParameter("lakeName"));
		l.setAvgTemperature(Double.parseDouble((request.getParameter("avgTemperature"))));
		l.setMaxDepth(Double.parseDouble((request.getParameter("maxDepth"))));
		helper.add(l);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
