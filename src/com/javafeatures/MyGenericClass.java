package com.javafeatures;

public class MyGenericClass <Thing1, Thing2>{
	Thing1 x;
	Thing2 y;

	public MyGenericClass(Thing1 x,Thing2 y) {
		this.x = x;
		this.y=y;
	}


	public Thing1 getX() {
		return x;
	}

	public void setX(Thing1 x) {
		this.x = x;
	}
	public Thing2 getY() {
		return y;
	}

	public void setY(Thing2 y) {
		this.y = y;
	}

}
