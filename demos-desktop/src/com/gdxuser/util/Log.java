package com.gdxuser.util;

import com.badlogic.gdx.Gdx;

public class Log {
	
	public static void out(String str) {
		Gdx.app.log("gdxdemos", str);
	}
	public static void out(String str, int x, int y) {
		Gdx.app.log("gdxdemos", str + x + ", " + y);
	}
	public static void out(String str, float x, float y) {
		Gdx.app.log("gdxdemos", str + x + ", " + y);
	}

	//FIXME doesnt accept string right way
	static void splog(String s, float... vars) {
		String s2 = String.format(s, vars);
		out(s2);
	}


}
