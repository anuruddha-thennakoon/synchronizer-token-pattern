package app;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Submit", urlPatterns = { "/submit" })
public class Submit extends HttpServlet {

	private static final long serialVersionUID = 1L;
	String csrfToken = null;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String csrf = request.getParameter("csrftoken");
			Cookie[] cookies = request.getCookies();

			if (cookies != null) {
				for (Cookie cookie : cookies) {
					if (cookie.getName().equals("JSESSIONID")) {
						csrfToken = new Map().getValue(cookie.getValue());
					}
				}
			}
			
			if (csrf != null) {
				if (csrf.equals(csrfToken)) {
					out.println("Form submitted successfully");
				} else {
					out.println("Error occur while validating the CSRF token");
				}
			} else {
				out.println("CSRF token absent or value is null/empty");
			}

		} finally {
			out.close();
		}
	}
}
