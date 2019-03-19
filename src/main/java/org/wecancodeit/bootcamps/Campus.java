package org.wecancodeit.bootcamps;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Campus {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToMany(mappedBy = "campus")
	private Collection<Bootcamp> bootcamps;

	protected Campus() {
	} // why jpa why???

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Bootcamp> getBootcamps() {
		return bootcamps;
	}

	public Campus(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Campus [name=" + name + "]";
	}

}
