/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-06-11 04:31:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"Home.css\">\n");
      out.write("  <!-- CSS only -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\"\n");
      out.write("    integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("  <!-- JS, Popper.js, and jQuery -->\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\n");
      out.write("    integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\n");
      out.write("    integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("  <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"\n");
      out.write("    integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("  <meta name='viewport' content='width=device-width, initial-scale=1'>\n");
      out.write("  <script src='https://kit.fontawesome.com/a076d05399.js'></script>\n");
      out.write("\t<title>Online Food Store</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- Header -->\n");
      out.write("\t<header>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("      <a class=\"navbar-brand p-4\" href=\"Home.html\">\n");
      out.write("        <h3><i class='fas fa-bread-slice' style='font-size:24px'></i> ONLINE FOOD STORE</i></h3>\n");
      out.write("      </a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavAltMarkup\"\n");
      out.write("        aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"collapse navbar-collapse mr-auto\" id=\"navbarNavAltMarkup\">\n");
      out.write("        <!-- <div class=\"topnav-right\"> -->\n");
      out.write("        <div class=\"navbar-nav ml-auto\">\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"index.jsp\"><b>HOME</b></a>\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"Order.html\"><b>ORDER</b></a>\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"Menuitems.html\"><b>MENU</b></a>\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"Feedback.html\"><b>FEEDBACK</b></a>\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"Contact.html\"><b>CONTACT</b></a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Container -->\n");
      out.write("<!-- container -->\n");
      out.write("\n");
      out.write("  <main role=\"main\">\n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("      <ol class=\"carousel-indicators\">\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"1\" class=\"active\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"2\" class=\"\"></li>\n");
      out.write("      </ol>\n");
      out.write("      <div class=\"carousel-inner\">\n");
      out.write("        <div class=\"carousel-item\">\n");
      out.write("          <img class=\"first-slide\"\n");
      out.write("            src=\"https://images.pexels.com/photos/605408/pexels-photo-605408.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940\"\n");
      out.write("            height=\"640px\" width=\"100%\" alt=\"First slide\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"carousel-caption text-left\">\n");
      out.write("              <h1>Example headline.</h1>\n");
      out.write("              <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget\n");
      out.write("                metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"carousel-item active\">\n");
      out.write("          <img class=\"second-slide\"\n");
      out.write("            src=\"https://images.pexels.com/photos/3944308/pexels-photo-3944308.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940\"\n");
      out.write("            height=\"640px\" width=\"100%\" alt=\"Second slide\"/>\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <div class=\"text-center\">\n");
      out.write("                <p><a class=\"btn btn-lg btn-outline-light \" href=\"Menuitems.html\" role=\"button\">OUR MENU</a></p>\n");
      out.write("              </div>\n");
      out.write("              <h1>Another example headline.</h1>\n");
      out.write("              <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget\n");
      out.write("                metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"carousel-item\">\n");
      out.write("          <img class=\"third-slide\"\n");
      out.write("            src=\"https://images.pexels.com/photos/1556688/pexels-photo-1556688.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940\"\n");
      out.write("            height=\"640px\" width=\"100%\" alt=\"Third slide\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"carousel-caption text-right\">\n");
      out.write("              <h1>One more for good measure.</h1>\n");
      out.write("              <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget\n");
      out.write("                metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <a class=\"carousel-control-prev\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("        <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"sr-only\">Previous</span>\n");
      out.write("      </a>\n");
      out.write("      <a class=\"carousel-control-next\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("        <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("        <span class=\"sr-only\">Next</span>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("<!-- !Container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   <!-- Footer -->\n");
      out.write("    <footer class=\"page-footer font-small mdb-color pt-4 bg-light\">\n");
      out.write("\n");
      out.write("      <!-- Footer Links -->\n");
      out.write("      <div class=\"container text-center text-md-left\">\n");
      out.write("\n");
      out.write("        <!-- Footer links -->\n");
      out.write("        <div class=\"row text-center text-md-left mt-3 pb-3\">\n");
      out.write("\n");
      out.write("          <!-- Grid column -->\n");
      out.write("          <div class=\"col-md-3 col-lg-3 col-xl-3 mx-auto mt-3\">\n");
      out.write("            <h6 class=\"text-uppercase mb-4 font-weight-bold\">Company name</h6>\n");
      out.write("            <p>Here you can use rows and columns to organize your footer content. Lorem ipsum dolor sit amet,\n");
      out.write("              consectetur\n");
      out.write("              adipisicing elit.</p>\n");
      out.write("          </div>\n");
      out.write("          <!-- Grid column -->\n");
      out.write("\n");
      out.write("          <hr class=\"w-100 clearfix d-md-none\">\n");
      out.write("\n");
      out.write("\n");
      out.write("          <hr class=\"w-100 clearfix d-md-none\">\n");
      out.write("\n");
      out.write("          <!-- Grid column -->\n");
      out.write("          <hr class=\"w-100 clearfix d-md-none\">\n");
      out.write("\n");
      out.write("          <!-- Grid column -->\n");
      out.write("          <div class=\"col-md-4 col-lg-3 col-xl-3 mx-auto mt-3\">\n");
      out.write("            <h6 class=\"text-uppercase mb-4 font-weight-bold\">Contact</h6>\n");
      out.write("            <p>\n");
      out.write("              <i class=\"fas fa-home mr-3\"></i> Hyderabad, India</p>\n");
      out.write("            <p>\n");
      out.write("              <i class=\"fas fa-envelope mr-3\"></i> contact@foodstore.com</p>\n");
      out.write("            <p>\n");
      out.write("              <i class=\"fas fa-phone mr-3\"></i> 040-34825394</p>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <!-- Grid column -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer links -->\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <!-- Grid row -->\n");
      out.write("        <div class=\"row d-flex align-items-center\">\n");
      out.write("\n");
      out.write("          <!-- Grid column -->\n");
      out.write("          <div class=\"col-md-7 col-lg-8\">\n");
      out.write("\n");
      out.write("            <!--Copyright-->\n");
      out.write("            <p class=\"text-center text-md-left\">Â© 2020 Copyright:\n");
      out.write("                <strong> Onlinefoodstore.com</strong>\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <!-- Grid column -->\n");
      out.write("\n");
      out.write("          <!-- Grid column -->\n");
      out.write("          <div class=\"col-md-5 col-lg-4 ml-lg-0\">\n");
      out.write("\n");
      out.write("            <!-- Social buttons -->\n");
      out.write("            <div class=\"text-center text-md-right\">\n");
      out.write("              <ul class=\"list-unstyled list-inline\">\n");
      out.write("                <li class=\"list-inline-item\">\n");
      out.write("                  <a class=\"btn-floating btn-sm rgba-white-slight mx-1\">\n");
      out.write("                    <i class=\"fab fa-facebook-f\"></i>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"list-inline-item\">\n");
      out.write("                  <a class=\"btn-floating btn-sm rgba-white-slight mx-1\">\n");
      out.write("                    <i class=\"fab fa-twitter\"></i>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"list-inline-item\">\n");
      out.write("                  <a class=\"btn-floating btn-sm rgba-white-slight mx-1\">\n");
      out.write("                    <i class=\"fab fa-google-plus-g\"></i>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"list-inline-item\">\n");
      out.write("                  <a class=\"btn-floating btn-sm rgba-white-slight mx-1\">\n");
      out.write("                    <i class=\"fab fa-linkedin-in\"></i>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <!-- Grid column -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- Grid row -->\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- Footer Links -->\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}