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
 * Servlet implementation class UpdateLake
 */
@WebServlet("/updateLake")
public class UpdateLake extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateLake() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LakeHelper helper = new LakeHelper();
		
		String oldName = request.getParameter("oldName");
		String lakeName = request.getParameter("lakeName");
		Double avgTemperature = (Double.parseDouble(request.getParameter("avgTemperature")));
		Double maxDepth = (Double.parseDouble(request.getParameter("maxDepth")));

		Lake lakeToUpdate = helper.searchLakeByLakeName(oldName);
		lakeToUpdate.setLakeName(lakeName);
		lakeToUpdate.setAvgTemperature(avgTemperature);
		lakeToUpdate.setMaxDepth(maxDepth);
		helper.update(lakeToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
