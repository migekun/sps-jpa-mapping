package org.formacio.setmana2.repositori;

<<<<<<< HEAD
import org.formacio.setmana2.domini.Curs;
import org.formacio.setmana2.domini.Matricula;

/**
 * Modifica aquesta classe per tal que sigui un component Spring que realitza les 
 * operacions de persistencia tal com indiquen les firmes dels metodes
 */
public class RepositoriEscola {

	
	public Curs carregaCurs(String nom) {
		return null;
	}
	
	
	public Matricula apunta (String alumne, String curs) throws EdatIncorrecteException {
	    return null;	
=======
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.formacio.setmana2.domini.Alumne;
import org.formacio.setmana2.domini.Curs;
import org.formacio.setmana2.domini.Matricula;
import org.springframework.stereotype.Repository;

/**
 * Modifica aquesta classe per tal que sigui un component Spring que realitza les 
 * operacions de persistencia tal com indiquen les firmes dels metodes
 */
@Repository
@Transactional
public class RepositoriEscola {

	@PersistenceContext
	private EntityManager em;
	
	public Curs carregaCurs(String nom) {
		return em.find(Curs.class, nom);
	}
	
	
	public Matricula apunta (String alumne, String curs) throws EdatIncorrecteException {
		  Matricula matricula = new Matricula();
		  matricula.setAlumne(em.find(Alumne.class, alumne));
		  matricula.setCurs(em.find(Curs.class, curs));
		  return matricula;
>>>>>>> refs/remotes/origin/master
	}
	
	
}
