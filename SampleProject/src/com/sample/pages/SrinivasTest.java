package com.sample.pages;

public class SrinivasTest {
public static void main(String[] args) {
	Srinivas ref=new Srinivas();
//first user
	ref.setName("srinivas");
	ref.setRollnum(24);
	ref.setVillage("warangal");
	System.out.println(ref.getName() +"  "+ ref.getRollnum() +"   "+ref.getVillage());
//second user
	ref.setName("prasanth");
	ref.setRollnum(313);
	ref.setVillage("kolagatla");
	System.out.println(ref.getName() +"  "+ ref.getRollnum() +"   "+ref.getVillage());
}
}
