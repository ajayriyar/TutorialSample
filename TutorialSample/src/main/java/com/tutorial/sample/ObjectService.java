/**
 * 
 */
package com.tutorial.sample;

/**
 * @author Praveen.Verma
 *
 */
public class ObjectService {
	EntityDao dao;
	
	public Entity getEntity() {
		dao = new EntityDao();
		return (dao.getEntity());
	}
}
