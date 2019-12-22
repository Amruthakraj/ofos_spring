package com.Spring_mvc_ofos.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;
import com.Spring_mvc_ofos.dao.AgentDao;
import com.Spring_mvc_ofo.bean.Agent;     
//import com.javatpoint.beans.Emp;    
//import com.javatpoint.dao.EmpDao;    



@Controller    
public class AgentController {    
    @Autowired    
    AgentDao dao;//will inject dao from XML file    
        
    /*It displays a form to input data, here "command" is a reserved request attribute  
     *which is used to display object data into form  
     */  
    
    @RequestMapping("/AddFeedback")    
    public String showform(Model m){    
        m.addAttribute("command", new Agent());  
        return "feedback/AddFeedback";   
    }    
    
    
    @RequestMapping(value="/save",method = RequestMethod.POST)   
    
    public String save(@Valid @ModelAttribute("emp") Agent emp, BindingResult br){    
    	if(br.hasErrors())  

        {  

   return "employee/empform";//will redirect to viewemp request mapping    

           

        }  

        else  

        {  

        dao.save(emp);    
        return "redirect:/viewFeedback";
        }
    }//will redirect to viewemp request mapping    
       /* It provides list of employees in model object */    
   /* @RequestMapping("/viewFeedback")    
    public String viewemp(Model m){    
        List<Agent> list=dao.getAgent();    
        m.addAttribute("list",list);  
        return "feedback/viewFeedback";    
    }  */
    @RequestMapping(value="/editagent/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Agent emp=dao.getAgentById(id);    
        m.addAttribute("command",emp);  
        return "agent/viewagent";    
    }    
    
    @RequestMapping("/viewFeedback")    
    public String viewFeedback(Model m){    
        List<Agent> list=dao.getFeedback();    
        m.addAttribute("list",list);  
        return "feedback/viewFeedback";    
    }    

    /* It updates model object. */    
   // @RequestMapping(value="/editsave",method = RequestMethod.POST)    
   /* public String editsave(@ModelAttribute("emp") Agent emp){    
        dao.update(emp);    
        return "redirect:/viewagent";    
    }*/ 
    /* It displays object data into form for the given id.   
     * The @PathVariable puts URL data into variable.*/    
   }  
