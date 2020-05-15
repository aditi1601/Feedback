package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class feed_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>Feedback</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"contact1\">\n");
      out.write("\t\t<div class=\"container-contact1\">\n");
      out.write("\t\t\t<div class=\"contact1-pic js-tilt\" data-tilt>\n");
      out.write("\t\t\t\t<img src=\"images/img-01.png\" alt=\"IMG\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<form class=\"contact1-form validate-form\" action=\"feed.jsp\">\n");
      out.write("\t\t\t\t<span class=\"contact1-form-title\">\n");
      out.write("\t\t\t\t\tProvide Your Valuable Feedback\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"wrap-input1 validate-input\" data-validate = \"Name is required\">\n");
      out.write("\t\t\t\t\t<input class=\"input1\" type=\"text\" name=\"name\" placeholder=\"Name\">\n");
      out.write("\t\t\t\t\t<span class=\"shadow-input1\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"wrap-input1 validate-input\" data-validate = \"Valid email is required: ex@abc.xyz\">\n");
      out.write("\t\t\t\t\t<input class=\"input1\" type=\"text\" name=\"email\" placeholder=\"Email\">\n");
      out.write("\t\t\t\t\t<span class=\"shadow-input1\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div> \t\n");
      out.write("\t\t\t\t\t<label for=\"Course: \"> Course:   </label>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t   <select id=\"Courses\" name=\"Courses\">\n");
      out.write("\t\t\t\t\t\t   <br>\n");
      out.write("\t\t\t\t\t<br>\t   \n");
      out.write("\t\t              <option value=\" B-tech\">B-Tech</option>\n");
      out.write("\t\t               <option value=\" B-Sc\">B-Sc</option>\n");
      out.write("\t\t               <option value=\" B.A\">B.A</option>\n");
      out.write("\t            </select>\n");
      out.write("\t          <br>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t<label>How will you rate your Overall experience?</label> <br>\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<label class=\"radio-inline\">\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"experience\" id=\"radio_experience\" value=\"bad\" >\n");
      out.write("\t\t\t\t\t\tBad\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<label class=\"radio-inline\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"experience\" id=\"radio_experience\" value=\"average\" >\n");
      out.write("\t\t\t\t\t\t\tAverage\n");
      out.write("\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\t\t<label class=\"radio-inline\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"experience\" id=\"radio_experience\" value=\"good\" >\n");
      out.write("\t\t\t\t\t\t\tGood\n");
      out.write("\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t</p>\t\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"wrap-input1 validate-input\" data-validate = \"Message is required\">\n");
      out.write("\t\t\t\t\t<textarea class=\"input1\" name=\"Feedback\" placeholder=\"Type in Your Feedback\"></textarea>\n");
      out.write("\t\t\t\t\t<span class=\"shadow-input1\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"container-contact1-form-btn\">\n");
      out.write("\t\t\t\t\t<button class=\"contact1-form-btn\">\n");
      out.write("\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\tSubmit\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-long-arrow-right\" name=\"btnsubmit\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/tilt/tilt.jquery.min.js\"></script>\n");
      out.write("\t<script >\n");
      out.write("\t\t$('.js-tilt').tilt({\n");
      out.write("\t\t\tscale: 1.1\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("<!-- Global site tag (gtag.js) - Google Analytics -->\n");
      out.write("<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-23581568-13\"></script>\n");
      out.write("<script>\n");
      out.write("  window.dataLayer = window.dataLayer || [];\n");
      out.write("  function gtag(){dataLayer.push(arguments);}\n");
      out.write("  gtag('js', new Date());\n");
      out.write("\n");
      out.write("  gtag('config', 'UA-23581568-13');\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");

    
    try
    {
        String name,email,experience,course,feedback;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/feedbackfinal","feedbackfinal","feedbackfinal");
        Statement stmt=conn.createStatement();
        if(request.getParameter("name")!=null)
        {System.out.println("connected");
            name=request.getParameter("name");
            email=request.getParameter("email");
           course=request.getParameter("Courses");
            experience=request.getParameter("experience");
            feedback=request.getParameter("Feedback");
            int rs=stmt.executeUpdate("insert into feedback1 values('"+name+"','"+email+"','"+course+"','"+experience+"','"+feedback+"')");
            if(rs>0)
            {
                out.println("insert successful");
            }
            else
                out.println("insert error");
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }

      out.write("\n");
      out.write("    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
