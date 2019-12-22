package com.Spring_mvc_ofos.dao;

//package com.javatpoint.dao;    
import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;    
//import com.javatpoint.beans.Emp;    

import com.Spring_mvc_ofo.bean.Agent;
    
public class AgentDao {    
JdbcTemplate template;    
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
} 

public int save(Agent p){    
    String sql="insert into FEEDBACK(CNAME,FDES) values('"+p.getCname()+"','"+p.getFdes()+"')";    
    return template.update(sql);    
}    

/*public int update(Agent p){    
    String sql="update purchase_order set order_status='deliver' where order_id="+p.getOrder_id()+"";    
    return template.update(sql);    
}    */
   
   
public Agent getAgentById(int id){    
    String sql="select * from purchase_order where order_id=?";    
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Agent>(Agent.class));    
}    
public List<Agent> getAgent(){    
    return template.query("select * from purchase_order",new RowMapper<Agent>(){    
        public Agent mapRow(ResultSet rs, int row) throws SQLException {    
            Agent e=new Agent(); 
            e.setCname(rs.getString(2));
            e.setFdes(rs.getString(3));
           /* e.setOrder_id(rs.getInt(1));    
            e.setCustomer_id(rs.getString(2));    
            e.setTotal_price(rs.getInt(3)); 
            e.setOrder_status(rs.getString(4));   
            e.setOrder_date(rs.getString(5)); */   
            return e;    
        }    
    });    
}  


public List<Agent> getFeedback(){    
    return template.query("select * from FEEDBACK",new RowMapper<Agent>(){    
        public Agent mapRow(ResultSet rs, int row) throws SQLException {    
        	Agent e=new Agent();    
            e.setFid(rs.getString(1));    
            e.setCname(rs.getString(2));    
            e.setFdes(rs.getString(3));    
             
            return e;    
        }    
    });    
}    

} 
