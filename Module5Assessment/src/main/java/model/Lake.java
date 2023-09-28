
/**
 * @author valei - vlunderwood
 * CIS175 - Fall 2023
 * Sep 25, 2023
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "lakes")
@Table(name = "lakes")
public class Lake {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rowId;
	
	//instance variables
	private String lakeName;
	private double avgTemperature;
	private double maxDepth;
	
	//default no arg constructor
		public Lake() {}
	
	//getters and setters
	public String getLakeName() {
		return lakeName;
	}
	public void setLakeName(String lakeName) {
		this.lakeName = lakeName;
	}
	public double getAvgTemperature() {
		return avgTemperature;
	}
	public void setAvgTemperature(double avgTemperature) {
		this.avgTemperature = avgTemperature;
	}
	public double getMaxDepth() {
		return maxDepth;
	}
	public void setMaxDepth(double maxDepth) {
		this.maxDepth = maxDepth;
	}
	public int getRowId() {
		return rowId;
	}
	public void setRowId(int rowId) {
		this.rowId = rowId;
	}
}
