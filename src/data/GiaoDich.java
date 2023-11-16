/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author CrisKun
 */
public abstract class GiaoDich implements IGiaoDich{
    protected String magd;
    protected String ngaygd;
    protected double donGia;
    protected double dienTich;

    public GiaoDich() {
    }

    
    public GiaoDich(String magd, String ngaygd, double donGia, double dienTich) {
        this.magd = magd;
        this.ngaygd = ngaygd;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
    
    public String getMagd() {
        return magd;
    }

    public void setMagd(String magd) {
        this.magd = magd;
    }

    public String getNgaygd() {
        return ngaygd;
    }

    public void setNgaygd(String ngaygd) {
        this.ngaygd = ngaygd;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "GiaoDich{" + "magd=" + magd + ", ngaygd=" + ngaygd + ", donGia=" + donGia + ", dienTich=" + dienTich + '}';
    }

    
    @Override
    public abstract double tinhThanhTien();

    
    
    
}
