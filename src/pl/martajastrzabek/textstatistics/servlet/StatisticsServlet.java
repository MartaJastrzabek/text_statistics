package pl.martajastrzabek.textstatistics.servlet;

import pl.martajastrzabek.textstatistics.service.TextStatistics;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/statistics")
public class StatisticsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String text = request.getParameter("text");
        printStatistics(response, text);
    }

    private static void printStatistics(HttpServletResponse response, String text) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        TextStatistics statistics = new TextStatistics();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Tekstowe statystyki</title>");
        writer.println("<style>");
        writer.println("p {\n" +
                "font-style: italic\n" +
                "}");
        writer.println("</style>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<p>" + text + "</p>");
        writer.println("<h3>Ilość słów: " + statistics.countWords(text) + "</h3>");
        writer.println("<h3>Ilość znaków: " + statistics.countSigns(text) + "</h3>");
        writer.println("<h3>Ilość znaków (bez spacji): " + statistics.countSignsNoSpace(text) + "</h3>");
        writer.println("<h3>Palindrom: " + statistics.isPalindrome(text) + "</h3>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
