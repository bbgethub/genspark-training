package org.genspark.SPELDemonstration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

	@Value("10")
	private int x;
	
	@Value("#{50}")
	private int y;
	@Value("#{alien.x+alien.y}")
	private int z;
	@Value("#{'Adam'}")
	private String S;
	@Value("#{4>1}")
	private boolean result;
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getS() {
		return S;
	}
	public void setS(String s) {
		S = s;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Value("#{2 > 1 ? 'a' : 'b'}") 
	private String ternary;
	public String getTernary() {
		return ternary;
	}
	public void setTernary(String ternary) {
		this.ternary = ternary;
	}
	@Override
	public String toString() {
		return "Alien [x=" + x + ", y=" + y + ", z=" + z + ", S=" + S + ", result=" + result + ", ternary=" + ternary
				+ "]";
	}
	
}
