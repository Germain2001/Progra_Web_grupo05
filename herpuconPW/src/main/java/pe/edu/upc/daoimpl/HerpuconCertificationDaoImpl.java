package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IHerpuconCertificationDao;
import pe.edu.upc.entities.HerpuconCertification;

public class HerpuconCertificationDaoImpl implements IHerpuconCertificationDao{

	@PersistenceContext(unitName="herpuconPW")
	private EntityManager em;
	
	@Transactional
	
	public void insert(HerpuconCertification hc) {
		// TODO Auto-generated method stub
		try {
			em.persist(hc);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	public List<HerpuconCertification> list() {
		// TODO Auto-generated method stub
		List<HerpuconCertification> lista= new ArrayList<HerpuconCertification>();
		
		try {
			
			Query q = em.createQuery("select v from Certification v");
			lista=(List<HerpuconCertification>)q.getResultList();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar");
		}
		return lista;
	}
	

}
