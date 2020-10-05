
package dao;

import model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProdutoDAO{

private  Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;


private final ArrayList<Produto>Lista=new ArrayList<>();






  
   public void ProdutoDAO(){
    conn = new ConnectionFactory().getConexao();
   
     
  
  }  
  

 public void Inserir(Produto PRODUTO){
 
 String SQL ="INSERT INTO PRODUTO (NOMEVEICULO,MODELOVEICULO,NUMERO_DOC,ESTADO,CIDADE,PVEICULO,ANOVEIC,VALORTOTAL,OBS,V_VENDIDO) VALUES (?,?,?,?,?,?,?,?,?,?)";
 try{
    
     
     stmt=conn.prepareStatement(SQL);
     
     stmt.setString(1, PRODUTO.getNOMEVEICULO());
     stmt.setString(2,PRODUTO.getMODELOVEICULO());
     stmt.setInt(3,PRODUTO.getNUMERO_DOC());
     stmt.setString(4, PRODUTO.getESTADO());
     stmt.setString(5, PRODUTO.getCIDADE());
     stmt.setInt(6, PRODUTO.getPVEICULO());
     stmt.setInt(7, PRODUTO.getANOVEIC());
     stmt.setDouble(8, PRODUTO.getVALORTOTAL());
     stmt.setString(9, PRODUTO.getOBS());
     stmt.setInt(10, PRODUTO.getV_VENDIDO());
     stmt.execute();
     stmt.close();
     
     
     
     
     
     
             
     
     
     
 
 } catch(SQLException erro){
 
   throw new RuntimeException("Erro2: " +erro);
 
 }
 }
    


 public void Alterar(Produto PRODUTO){
 
 String sql="UPDATE PRODUTO SET NOMEVEICULO=?,MODELOVEICULO=?,NUMERO_DOC=?,ESTADO=?,CIDADE=?,PVEICULO=?,ANOVEIC=?,VALORTOTAL=?,OBS=?,V_VENDIDO=? WHERE ID_PRODUTO=?" ;
 try{
      stmt=conn.prepareStatement(sql);
     stmt.setString(1, PRODUTO.getNOMEVEICULO());
     stmt.setString(2,PRODUTO.getMODELOVEICULO());
     stmt.setInt(3,PRODUTO.getNUMERO_DOC());
     stmt.setString(4, PRODUTO.getESTADO());
     stmt.setString(5, PRODUTO.getCIDADE());
     stmt.setInt(6, PRODUTO.getPVEICULO());
     stmt.setInt(7, PRODUTO.getANOVEIC());
     stmt.setDouble(8, PRODUTO.getVALORTOTAL());
     stmt.setString(9, PRODUTO.getOBS());
     stmt.setInt(10, PRODUTO.getV_VENDIDO());
     stmt.execute();
     stmt.close();
     
     
 
 } catch(Exception erro){
 
   throw new RuntimeException("Erro3: " +erro);
 
 }
 }
 
 public ArrayList<Produto> listarTodos(){
     String sql="SELECT * FOM PRODUTO";
     
     try{
     
     st=conn.createStatement();
     rs=st.executeQuery(sql);
     while(rs.next()){
     
     Produto PRODUTO =new Produto();
     PRODUTO.setID_PRODUTO(rs.getInt(""));
     PRODUTO.setNOMEVEICULO(rs.getString(""));
     PRODUTO.setMODELOVEICULO(rs.getString(""));
     PRODUTO.setVALORTOTAL(rs.getDouble(""));
     PRODUTO.setV_VENDIDO(rs.getInt(""));
     Lista.add(PRODUTO);
     }
     
     }catch(SQLException erro){
         
         throw new RuntimeException("Erro4: " +erro);
     }
  return Lista;
               
 }

}

 
 
 
     
  
 
 
     
    
 
 
 





