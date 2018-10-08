/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public enum Infonya {
    save("Berhasil Disimpan"), update("Berhasil Diperbaharui"), 
      delete("Berhassil Dihapus"), cancle("Batal Dihapus"),
      find("Berhasil Ditemukan");  
        
      private String isine;
      
      private Infonya(String isine){
          this.isine = isine;
      }
      public String getPesan(){
          return isine;
      }
      
}
