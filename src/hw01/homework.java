package hw01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/homework")
public class homework extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out=res.getWriter();
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<boby>");
		
		String clientName=req.getParameter("name");
		String clientSex=req.getParameter("sex");
		String clientYear=req.getParameter("year");
		String clientBirthMonth=req.getParameter("birthMonth");
		String clientMonth=req.getParameter("month");
		String clientAffiliation=req.getParameter("affiliation");
		String clientMarriage=req.getParameter("marriage");
		String clientPhone=req.getParameter("firstNumber")+req.getParameter("middleNumber")+req.getParameter("lastNumber");
		String clientNumberPlace=req.getParameter("numberPlace");
		String clientCellPhone=req.getParameter("firstNumberM")+req.getParameter("middleNumberM")+req.getParameter("lastNumberM");
		String clientPhoneProvider=req.getParameter("phoneProvider");
		
		out.println("<li>이름 : "+ clientName);
		out.println("<li>성별 : "+ clientSex);
		out.println("<li>생년월일 : "+clientYear+" "+clientMonth);
		out.println("<li>소속 : "+clientAffiliation);
		out.println("<li>결혼여부 : "+clientMarriage);
		out.println("<li>전화번호 : "+clientPhone+" "+clientNumberPlace);
		out.println("<li>휴대폰 : "+clientCellPhone+" "+clientPhoneProvider);
		
		
		
		
		out.println("</body></html>");
	}

}
