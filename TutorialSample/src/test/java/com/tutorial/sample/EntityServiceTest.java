package com.tutorial.sample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class EntityServiceTest {
	
	@Mock private EntityDao dao;
	EntityService service = null;

	

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		Mockito.when(dao.getEntity()).thenReturn(getEntity());
		service = new EntityService(dao);		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Entity entity  = service.getEntity();
        assertEquals("Praveen Verma", entity.toString());
    	Mockito.verify(dao).getEntity();
	}
	
	
	private Entity getEntity(){
		Entity entity = new Entity();
		entity.setFname("Praveen");
		entity.setLname("Verma");
		return entity;
	}
	
}
