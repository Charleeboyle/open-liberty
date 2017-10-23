package jpa22injection.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Inject_Ent_A")
public class InjectEntityA {
	@Id
	@GeneratedValue
	private long id;
	
	@Basic
	private String strData;
	
	public InjectEntityA() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStrData() {
		return strData;
	}

	public void setStrData(String strData) {
		this.strData = strData;
	}

	@Override
	public String toString() {
		return "InjectEntityA [id=" + id + ", strData=" + strData + "]";
	}
}
