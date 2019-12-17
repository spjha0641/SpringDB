package com.lti.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.CropDao;
import com.lti.entity.Crop;

public class CropTest {
	
	private ApplicationContext ctx;
	
	@Test
	public void testAddCropDetails() {
		ctx =  new ClassPathXmlApplicationContext("applicationConfig.xml");
		Crop crop = new Crop();
		CropDao cropDao = (CropDao) ctx.getBean("cropdetails");
		crop.setCropName("Maize");
		crop.setCropType("Kharif");
		crop.setCropMsp(1760);
		
		cropDao.addCropDetail(crop);
	}
	
	public void testGetAllDetails() {
		ctx= new ClassPathXmlApplicationContext("applicationConfig.xml");
		
	}

}
