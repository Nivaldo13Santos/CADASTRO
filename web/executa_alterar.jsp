

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="model.Produto"%>
<%@page import="dao.ProdutoDAO"%>

<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           try{
               
               Produto pro= new Produto();
               ProdutoDAO prd=new ProdutoDAO();
               
               if(request.getParameter("ID_PRODUTO").equals("")){
                  response.sendRedirect("ID_PRODUTO");  
                  
               }
               
               else{
               
               prd.Alterar(pro);
               
               
               
               
               
               }
                   
                   
           }catch(Exception erro){
                throw new RuntimeException("Erro8: " +erro);
           } 
            %>  
    </body>
</html>
