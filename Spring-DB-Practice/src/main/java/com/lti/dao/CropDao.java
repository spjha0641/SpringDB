package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Crop;

@Component("cropdetails")
public class CropDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addCropDetail(Crop crop) {
		entityManager.persist(crop);
	}
	
	public List<Crop> getDetailsOfCrop(){
		Query q = entityManager.createQuery("select cp from Crop cp");
		List <Crop> list =q.getResultList();
		
		return list;
		
	}

}
