package me.rmrf.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.*;

/**
 * Servlet implementation class UploadFile
 */
@MultipartConfig
@WebServlet(urlPatterns="/uploadFile")
public class UploadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("you are posting file");
		response.setContentType("text/plain");
		Part part = request.getPart("uploadFile");
		writer.println("content-type:"+part.getContentType());
		writer.println(this.getServletContext().getRealPath("/uploadFiles"));
		String fileName = part.getName();
		writer.println(fileName);
		
//		part.write(this.getServletContext().getRealPath("/uploadFiles")+"/"+fileName);
	}

}
