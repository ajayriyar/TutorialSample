/**
 * 
 */
package com.tutorial.sample;

/**
 * @author Praveen.Verma
 *
 */
public class EntityService {
	EntityDao dao;
	public EntityService(EntityDao dao){
		this.dao=dao;
	}
	
	public Entity getEntity() {
		return (dao.getEntity());
	}
}
