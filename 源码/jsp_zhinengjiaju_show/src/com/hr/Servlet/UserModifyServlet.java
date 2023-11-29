package com.hr.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.dao.EASYBUY_USERDao;
import com.hr.entity.EASYBUY_USER;
import com.hr.util.EncodeUtil;

/**
 * Servlet implementation class UserModifyServlet
 */
public class UserModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserModifyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EncodeUtil.encode(request);
		response.setContentType("text/html;charset=utf-8");
		EASYBUY_USER user = (EASYBUY_USER)request.getSession().getAttribute("commom_user");
		response.setContentType("text/html;charset=utf-8");
		String username=request.getParameter("userName");
		String name=request.getParameter("name");
		String pwd=request.getParameter("passWord");
		String sex=request.getParameter("sex");
		String birthday=request.getParameter("birthday");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		String courty=request.getParameter("courty");
		String like = request.getParameter("like");

		EASYBUY_USER updateuser=new EASYBUY_USER(username, name, pwd, sex, birthday, null, email, mobile, address, courty,like, user.getEU_STATUS());
		int count=EASYBUY_USERDao.update(updateuser);
		
		if(count>0){
			request.getSession().setAttribute("commom_user", updateuser);
			response.sendRedirect("myindex.jsp");
		}else{
			PrintWriter out=response.getWriter();
			out.print("<script>");
			out.print("alert('修改失败');");
			out.print("location.href='"+request.getContextPath()+"'");
			out.print("</script>");
			out.close();
		}
	}

}
