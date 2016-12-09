/**
 * 
 */
package com.tutorial.sample;

/**
 * @author Praveen.Verma
 *
 */
public class EntityServiceJMock {
	EntityDao dao;
	
	
	public Entity getEntity() {
		dao = new EntityDao();
		return (dao.getEntity());
	}
}
