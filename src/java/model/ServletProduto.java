
package model;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletProduto extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletProduto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletProduto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        Produto prod = new Produto();
        prod.setNOMEVEICULO(request.getParameter("NOMEVEICULO"));
        prod.setMODELOVEICULO(request.getParameter("MODELOVEICULO"));
        prod.setInteger.parseIntNUMERO_DOC(request.getParameter("NUMERO_DOC"));
        prod.setESTADO(request.getParameter("ESTADO"));
        prod.setCIDADE(request.getParameter("CIDADE"));
        prod.setPVEICULO(request.getParameter("PVEICULO"));
        prod.set.(request.getParameter("ANOVEIC"));
        prod.setDouble.valueOF(str).doubleValue()VALORTOTAL(request.getParameter("VALORTOTAL"));
        prod.setOBS(request.getParameter(request.getParameter("OBS")));
        prod.setV_VENDIDO(request.getParameter(request.getParameter("V_VENDIDO")));
        
        
       /* finally {
                
                RequestDispatcher rd= request.getRequestDispatcher("http://localhost:8080/CADASTROCLIENTE/CADASTRO%20DE%20FORNECEDORES.html");
                request.setAttribute("saida", saida);
                rd.forward(request)(response);
                              
                */
                
    
        /*String saida = "";
        
        try {
        
        Produto pDAO= new Produto();
        saida = Produto.Produto(prod);
                               
        }catch(ClassNotFoundException | SQLException e){saida.getMessage();*/
        
                
                
        
        
        
        
        
        
        
        
        
        
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
