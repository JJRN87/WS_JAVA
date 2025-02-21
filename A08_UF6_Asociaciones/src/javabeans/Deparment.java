package javabeans;

import java.util.Objects;

public class Deparment {

	private int departmentId;
	private String deparmentName;
	private Employee manager;
	private Location location;
	
	public Deparment(int departmentId, String deparmentName, Employee manager, Location location) {
		super();
		this.departmentId = departmentId;
		this.deparmentName = deparmentName;
		this.manager = manager;
		this.location = location;
	}

	public Deparment() {
		super();
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDeparmentName() {
		return deparmentName;
	}

	public void setDeparmentName(String deparmentName) {
		this.deparmentName = deparmentName;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Deparment [departmentId=" + departmentId + ", deparmentName=" + deparmentName + ", manager=" + manager
				+ ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Deparment))
			return false;
		Deparment other = (Deparment) obj;
		return departmentId == other.departmentId;
	}
	
	
	
	
}
