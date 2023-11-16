/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author CrisKun
 */
public class giaoDichDat extends GiaoDich{
     private String loaiDat; // a , b , c 

    public giaoDichDat(String loaiDat, String magd, String ngaygd, double donGia, double dienTich) {
        super(magd, ngaygd, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public double tinhThanhTien() {
        double tt ;
        if(loaiDat.toUpperCase().equalsIgnoreCase("A")) {
            tt = dienTich*donGia*1.5;
        }
        else if(loaiDat.toUpperCase().equalsIgnoreCase("B") || loaiDat.toUpperCase().equalsIgnoreCase("C") ) {
            tt=dienTich*donGia*0.9;
        }
        return 1;
    }
     
}
