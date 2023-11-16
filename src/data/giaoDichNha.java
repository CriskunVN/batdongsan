/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author CrisKun
 */
public class giaoDichNha extends GiaoDich{
    private String loaiNha; // PHO , kiet

    public giaoDichNha(String magd, String ngaygd, double donGia, double dienTich, String loaiNha) {
        super(magd, ngaygd, donGia, dienTich);
        this.loaiNha = loaiNha;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    @Override
    public double tinhThanhTien() {
        if(loaiNha.toUpperCase().equalsIgnoreCase("PHO") ) {
            
        }
        else if(loaiNha.toUpperCase().equalsIgnoreCase("KIET")) {
            
        }
        else {
            System.out.println(" Ko co ");
        }
            return 1;
        }

    
}
