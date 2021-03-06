package main.java.ec.com.ocampana.srv.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the taccaccountsplan database table.
 * 
 */
@Entity
@NamedQuery(name="Taccaccountsplan.findAll", query="SELECT t FROM Taccaccountsplan t")
public class Taccaccountsplan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String code;

	private String name;

	public Taccaccountsplan() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}