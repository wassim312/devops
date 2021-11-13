package tn.esprit.spring;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;



@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {
	@Autowired
	IEmployeService es;
	Employe emp = new Employe("test", "junit", "test@junit.com", true, Role.ADMINISTRATEUR);


	private static final Logger l = LogManager.getLogger(EmployeServiceImplTest.class);
	
	@Test
	public void testAddUSer()  {
	assertTrue(emp.getRole().equals(Role.ADMINISTRATEUR));
	es.ajouterEmploye(emp);
	}
	
	@Test
	public void testGetNombreEmployeJPQL() {
		es.getNombreEmployeJPQL(); 
	}
	
	@Test
	public void testGetAllEmployeNamesJPQL() {
		es.getAllEmployeNamesJPQL(); 
	}


}
