package com.gl.f.dp;


public class FacadeDP{
	
	public static void main(String[] args) {
		
		OSFacade.getPerformance(OsType.LENUX);
	}
}

class WindowsDownloader{
	
	public static String getWindowsImage() {
		return "windows image";
		
	}
	public void getWindowsPerformance() {
		System.out.println("windows performance report");
	}
}

class LenuxDownloader{
	
	public static String getLenuxImage() {
		return "windows image";
		
	}
	public void getLenuxPerformance() {
		System.out.println("lenux performance report");
	}
}

class MacDownloader{
	
	public static String getMacImage() {
		return "windows image";
		
	}
	public void getMacPerformance() {
		System.out.println("mac performance report");
	}
}

//define facade class

class OSFacade{
	public static void getPerformance(OsType osType) {
		switch(osType) {
		case WINDOWS:
			WindowsDownloader windowsDownloader=new WindowsDownloader();
			windowsDownloader.getWindowsPerformance();
			break;
		case LENUX:
			LenuxDownloader LenuxDownloader=new LenuxDownloader();
			LenuxDownloader.getLenuxPerformance();
			System.out.println(LenuxDownloader.getLenuxImage());
			break;
		case MAC:
			MacDownloader MacDownloader=new MacDownloader();
			MacDownloader.getMacPerformance();
			break;
		}
	}

}
