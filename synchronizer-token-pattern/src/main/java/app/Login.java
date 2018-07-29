package app;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.DatatypeConverter;

@WebServlet(name = "Login", urlPatterns = { "/login" })
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;
	String jsession;
	private final SecureRandom secureRandom = new SecureRandom();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			if (username.equals("admin") && password.equals("admin")) {

				// get generated session cookies
				Cookie[] cookies = request.getCookies();
				if (cookies != null) {
					for (Cookie cookie : cookies) {
						if (cookie.getName().equals("JSESSIONID")) {
							jsession = cookie.getValue();
						}
					}
				}
				System.out.println("jsession " + jsession);

				// generate cookies CSRF token
				String csrfToken = UUID.randomUUID().toString();
				System.out.println("csrfToken " + csrfToken);

				// store session identifier
				new Map().setValue(jsession, csrfToken);

				//
				HttpSession session = request.getSession();
				session.setAttribute("csrf", csrfToken);

				response.sendRedirect("form.jsp");

			} else {
				out.println("Invalid username and/or password");
			}

		} finally {
			out.close();
		}
	}
}
