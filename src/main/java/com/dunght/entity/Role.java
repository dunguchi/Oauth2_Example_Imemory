package com.dunght.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "app_role")
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7493319448025698267L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "role_name")
	private String roleName;

	@Column(name = "description")
	private String description;

    @ManyToMany(mappedBy = "roles")
    @JsonIgnore
    private Set<User> user;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(String roleName, String description) {
		super();
		this.roleName = roleName;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}
}
