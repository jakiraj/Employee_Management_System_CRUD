package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html ng-app=\"myApp\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Information Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/angular.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/app.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .header, .footer-area{\n");
      out.write("                border: 1px solid #DDD;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                box-shadow: 0px 0px 10px #DDD;\n");
      out.write("            }\n");
      out.write("            .content-area, .menu{\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("            .sidebar, .content{\n");
      out.write("                border: 1px solid #DDD;\n");
      out.write("                padding: 20px;\n");
      out.write("                box-shadow: 0px 0px 10px #DDD;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body ng-controller=\"myCtrl\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"header col-md-12\">\n");
      out.write("                    <center><h1>Product Information Form</h1></center>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"menu col-md-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"sidebar col-md-8\"></div>\n");
      out.write("                        <div>\n");
      out.write("                        <nav class=\"navbar navbar-default\">\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("                                <ul class=\"nav navbar-nav\">\n");
      out.write("                                    <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                    <li><a href=\"#\">Product</a></li>\n");
      out.write("                                    <li><a href=\"#\">About Us</a></li>\n");
      out.write("                                    <li><a href=\"#\">Blog</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-12 content-area\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"sidebar col-md-3\">\n");
      out.write("                            <ul class=\"\">\n");
      out.write("                                <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                                <li><a href=\"#\">Buy Product</a></li>\n");
      out.write("                                <li><a href=\"#\">Order Product</a></li>\n");
      out.write("                                <li><a href=\"#\">Feedback</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"content col-md-9\">\n");
      out.write("\n");
      out.write("                            <button data-toggle=\"modal\" data-target=\"#myModalSave\" type=\"button\" class=\"btn btn-success\">Add New product</button>\n");
      out.write("                            <br/>\n");
      out.write("                            <br/>\n");
      out.write("                            <div class=\"alert alert-success alert-dismissable\" ng-show=\"message\">\n");
      out.write("                                <a href=\"#\" class=\"close\" ng-click=\"messageClose()\">&times;</a>\n");
      out.write("                                <strong>Success!</strong> {{message}}\n");
      out.write("                            </div>\n");
      out.write("                            <table class=\"table table-striped table-bordered\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>ID</th>\n");
      out.write("                                        <th>Product Name</th>\n");
      out.write("                                        <th>Price</th>\n");
      out.write("                                        <th>Quantity</th>\n");
      out.write("                                        <th colspan=\"2\">Action</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr ng-repeat=\"product in products\">\n");
      out.write("                                        <td>{{$index + 1}}</td>\n");
      out.write("                                        <td>{{product.pname}}</td>\n");
      out.write("                                        <td>{{product.price}}</td>\n");
      out.write("                                        <td>{{product.qty}}</td>\n");
      out.write("                                        <td><button data-toggle=\"modal\" data-target=\"#myModalEdit\" type=\"button\" class=\"btn btn-primary\" ng-click=\"selectProduct(product)\">Edit</button></td>\n");
      out.write("                                        <td><button data-toggle=\"modal\" data-target=\"#myModalDelete\" type=\"button\" class=\"btn btn-danger\" ng-click=\"selectProduct(product)\">Delete</button></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("\n");
      out.write("                            <!-- Save Modal -->\n");
      out.write("                            <div id=\"myModalSave\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("                                <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                                    <!-- Modal content-->\n");
      out.write("                                    <div class=\"modal-content\">\n");
      out.write("                                        <div class=\"modal-header\">\n");
      out.write("                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                            <h4 class=\"modal-title\">Insert Product</h4>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                                            <form>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"pname\">Product Name:</label>\n");
      out.write("                                                    <input ng-model=\"newProduct.pname\" type=\"text\" class=\"form-control\" id=\"pname\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"price\">Price:</label>\n");
      out.write("                                                    <input ng-model=\"newProduct.price\" type=\"text\" class=\"form-control\" id=\"price\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"qty\">Quantity: </label>\n");
      out.write("                                                    <input ng-model=\"newProduct.qty\" type=\"text\" class=\"form-control\" id=\"qty\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <button ng-click=\"saveProduct()\" data-dismiss=\"modal\" type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("                                            </form>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"modal-footer\">\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        <!-- Edit Modal -->\n");
      out.write("                            <div id=\"myModalEdit\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("                                <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                                    <!-- Modal content-->\n");
      out.write("                                    <div class=\"modal-content\">\n");
      out.write("                                        <div class=\"modal-header\">\n");
      out.write("                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                            <h4 class=\"modal-title\">Update Product</h4>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                                            <form>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"pname\">Product Name:</label>\n");
      out.write("                                                    <input ng-model=\"clickedProduct.pname\" type=\"text\" class=\"form-control\" id=\"pname\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"price\">Price:</label>\n");
      out.write("                                                    <input ng-model=\"clickedProduct.price\" type=\"text\" class=\"form-control\" id=\"price\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <label for=\"qty\">Quantity: </label>\n");
      out.write("                                                    <input ng-model=\"clickedProduct.qty\" type=\"text\" class=\"form-control\" id=\"qty\">\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <button ng-click=\"updateProduct()\" data-dismiss=\"modal\" type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("                                            </form>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"modal-footer\">\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Delete Modal -->\n");
      out.write("                            <div id=\"myModalDelete\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("                                <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                                    <!-- Modal content-->\n");
      out.write("                                    <div class=\"modal-content\">\n");
      out.write("                                        <div class=\"modal-header\">\n");
      out.write("                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                            <h4 class=\"modal-title\">Delete Product</h4>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                                            You are now delete {{clickedProduct.pname}}\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"modal-footer\">\n");
      out.write("                                            <button ng-click=\"deleteProduct()\" type=\"button\" class=\"btn btn-success\" data-dismiss=\"modal\">Ok</button>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-12 footer-area\">\n");
      out.write("                    <center>&COPY Copyright by Jakir</center>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
