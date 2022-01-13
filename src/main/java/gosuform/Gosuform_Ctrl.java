package gosuform;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


/**
 * Servlet implementation class Gosuform_Ctrl
 */
@WebServlet(name = "insGosuform.do", urlPatterns = { "/insGosuform.do" })
public class Gosuform_Ctrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Gosuform_Service service2;

    
 /**
  * @see HttpServlet#HttpServlet()
  */
    public Gosuform_Ctrl() {
        super();
        service2 = new Gosuform_Service();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		String page = "login.jsp";
		HttpSession session = request.getSession();		
		
		String SAVEFOLDER = "D:\\javaexp\\workspace\\project9\\src\\main\\webapp\\upload";
		String ENCTYPE = "UTF-8";
		int MAXSIZE =  1024 * 1024 *100;
		MultipartRequest multi = null;
		String filename = null;
		File file = new File(SAVEFOLDER);
		if (!file.exists())
			file.mkdirs();
		multi = new MultipartRequest(request, SAVEFOLDER, MAXSIZE, ENCTYPE, new DefaultFileRenamePolicy());
		if (multi.getFilesystemName("formimg") != null) {
			filename = multi.getFilesystemName("formimg");

		}
		
		
		String id = multi.getParameter("id"); //hidden
		String pass = request.getParameter("pass");
		
		String classcode = multi.getParameter("classcode");
		String nickname = multi.getParameter("nickname");
		String info = multi.getParameter("info");
		String history = multi.getParameter("history");
		String title = multi.getParameter("title");
		String sns = multi.getParameter("sns");
		String category = multi.getParameter("category");
		String ftf = multi.getParameter("ftf");
		String loc = multi.getParameter("loc");
		String price = multi.getParameter("price");
		String classtime = multi.getParameter("classtime");
		
		System.out.println(id);
		if (id != null) {
				
				Gosuform gosu = new Gosuform();
				gosu.setId(id);
				gosu.setNickname(nickname);
				gosu.setInfo(info);
				gosu.setHistory(history);
				gosu.setTitle(title);
				gosu.setSns(sns);
				gosu.setCategory(category);
				gosu.setFtf(ftf);
				gosu.setLoc(loc);
				gosu.setPrice(price);
				gosu.setClasstime(classtime);
				gosu.setFormimg(filename);
				
				service2.insGosuformJson(gosu);
				
				page = "index.jsp";
			
		} else {
			page = "gosuform.jsp";
			
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
