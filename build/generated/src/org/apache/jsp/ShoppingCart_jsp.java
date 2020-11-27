package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import co.edu.utap.ecommerce.domain.Product;
import java.util.List;
import java.util.ArrayList;

public final class ShoppingCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"dist/sweetalert.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/sweetalert.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
 if (request.getAttribute("message") != null) { 
      out.write("\n");
      out.write("\n");
      out.write("        <input type=\"text\" id=\"message\" value=\"");
      out.print( request.getAttribute("message") );
      out.write("\" hidden=\"\" />\n");
      out.write("        <input type=\"text\" id=\"type\" value=\"");
      out.print( request.getAttribute("type") );
      out.write("\" hidden=\"\" />\n");
      out.write("        <script>\n");
      out.write("            var message = document.getElementById(\"message\").value;\n");
      out.write("            var type = document.getElementById(\"type\").value;\n");
      out.write("            swal(\"Notificación\", message, type);\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        ");
}
      out.write("        \n");
      out.write("\n");
      out.write("        ");

            List<Product> products = new ArrayList();
            List<Product> shoppingCart = new ArrayList();

            if (session.getAttribute("products") != null) {
                products = (List<Product>) session.getAttribute("products");
            }

            if (session.getAttribute("shoppingCart") != null) {
                shoppingCart = (List<Product>) session.getAttribute("shoppingCart");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Productos agregados ( ");
      out.print( shoppingCart.size());
      out.write(" )</h1>\n");
      out.write("\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("\n");
      out.write("                ");

                    for (Product item : products) {
                
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"card col-md-3\">\n");
      out.write("                    <img src=\"");
      out.print( item.getImagen());
      out.write("\" \n");
      out.write("                         class=\"card-img-top\" alt=\"...\" height=\"250px\" width=\"25px\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <p class=\"card-text\">\n");
      out.write("                            ");
      out.print( item.getNombre());
      out.write("  <br>\n");
      out.write("                            $ ");
      out.print( item.getPrecio());
      out.write("<br>\n");
      out.write("                            <a href=\"ShoppingCartController?id=");
      out.print( item.getCodigo());
      out.write("&action=add\" class=\"btn btn-outline-primary\">+</a>\n");
      out.write("                            <a href=\"ShoppingCartController?id=");
      out.print( item.getCodigo());
      out.write("&action=remove\" class=\"btn btn-outline-primary\">-</a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>                    \n");
      out.write("\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <h1>Resumen</h1>   \n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Codigo</td>\n");
      out.write("                            <td>Nombre</td>\n");
      out.write("                            <td>Cantidad</td>\n");
      out.write("                            <td>Precio</td>\n");
      out.write("                            <td>Subtotal</td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        ");

                            double total = 0;
                            for (Product item : shoppingCart) {
                                total += item.getPrecio() * item.getCantidad();
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( item.getCodigo());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( item.getNombre());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( item.getCantidad());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( item.getPrecio());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( item.getPrecio() * item.getCantidad());
      out.write(" </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    <label>Total de la compra: ");
      out.print( total);
      out.write("</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
