package com.redhat.openshift.spring.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.enunciate.ClientName;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	@ClientName(value = "usersList")
	private final List<User> users = new ArrayList<>();

	public Users() {
	}

	public List<User> getUsers() {
		return users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Users other = (Users) obj;
		if (users == null) {
			if (other.users != null) {
				return false;
			}
		} else if (!users.equals(other.users)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Users [users=" + users + "]";
	}

}
