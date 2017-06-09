package com.packt.patterninspring.chapter2.prototype.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public abstract class Account implements Cloneable{
	abstract public void accountType();
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
