package com.medipol.dSpringBootOrnek;

public class Ogrenci {
	private static int COUNT = 1;
	private int id;
	public String ad;
	public String soyad;
	public Ogrenci(String ad, String soyad) 
		{
		this.id = ++COUNT;
		this.ad = ad;
		this.soyad = soyad;
		}
	public String getAd() { return ad; }
	public String getSoyad() { return soyad;}
}
