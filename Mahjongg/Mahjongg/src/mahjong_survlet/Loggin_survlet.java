package mahjong_survlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loggin_survlet
 */
@WebServlet(description = "ログイン判定", urlPatterns = { "/Loggin_survlet" })
public class Loggin_survlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loggin_survlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id;
		String password;

		id = request.getParameter("id");
		password = request.getParameter("password");

        response.setContentType("text/html");
        // 出力する画面の文字コードをUTF-8に設定
        response.setCharacterEncoding("UTF-8");

        // 画面に出力するためのWriterクラスインスタンスを取得
        PrintWriter pw = response.getWriter();

        // HTMLを出力
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>入力結果</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h1>入力結果</h1>");
        pw.println("<p>id</p><br>");
        pw.println("<p>password</p>");
        pw.println("</body>");
        pw.println("</html>");
	}

}
