/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.detectiveconan;

/**
 *
 * @author
 * NAMA     : Rachman Aldiansyah
 * KELAS    : IF-1
 * NIM      : 10119038
 * Deskripsi Program : Program ini berisi class Karakter yang merupakan child-class
 *                     dari class DetectiveConan yang merupakan parent-class
 * 
 */

public class Karakter extends DetectiveConan {
    private String kepribadian, role;

    public Karakter(String nama, String jenisKelamin, int umur, String kepribadian, String role) {
        super(nama, jenisKelamin, umur);
        this.kepribadian = kepribadian;
        this.role = role;
    }

    public String getKepribadian() {
        return kepribadian;
    }

    public String getRole() {
        return role;
    }
    
    @Override
    public void siapaSaya() {
        System.out.println("Saya Karakter Detective Conan");
        super.siapaSaya();
        System.out.println("Kepribadian : ".concat(kepribadian));
        System.out.println("Role        : ".concat(role).concat("\n"));
    }
}