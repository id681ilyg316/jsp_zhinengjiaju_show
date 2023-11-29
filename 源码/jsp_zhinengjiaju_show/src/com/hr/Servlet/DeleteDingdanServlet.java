package com.hr.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hr.dao.EASYBUY_DDDao;
import com.hr.dao.EASYBUY_DdanDao;
import com.hr.dao.EASYBUY_USERDao;
import com.hr.entity.EASYBUY_Ddan;
import com.hr.entity.EASYBUY_USER;
import com.hr.util.EncodeUtil;

public class DeleteDingdanServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	EncodeUtil.encode(req);
	resp.setContentType("text/html;charset=utf-8");
	String id=req.getParameter("id");
	PrintWriter out=resp.getWriter();
	int count=EASYBUY_DdanDao.deleteDingdanById(id);
	if(count>0){
		EASYBUY_USER user = (EASYBUY_USER)req.getSession().getAttribute("commom_user");
		ArrayList<EASYBUY_Ddan> dan=EASYBUY_DdanDao.selectById(user.getEU_USER_ID());
		req.setAttribute("dan", dan);
		resp.sendRedirect("Dan.jsp");
	}else{
		out.write("<script>");
		out.write("alert('删除失败');");
		out.write("location.href='Dan.jsp'");
		out.write("</script>");
		out.close();
	}
}
}
