

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
        <% try{
          
               Produto pro= new Produto();
               ProdutoDAO prd=new ProdutoDAO();
               
               if(request.getParameter("form").equals("")){
                  response.sendRedirect("form");  
                  
               }
               
               else{
               
              
               prd.Inserir (pro);
               response.sendRedirect("form");
               }
               }catch(Exception erro){throw new RuntimeException("erro7" +erro);
                       }
               
                 
                             
                 
           
            
            %>  
    </body>
</html>