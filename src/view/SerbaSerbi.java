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
public class SerbaSerbi {
    
 
    public enum pesan{
      save("Berhasil Disimpan"), update("Berhasil Diperbaharui"), 
      delete("Berhassil Dihapus"), cancle("Batal Dihapus"),
      find("Berhasil Ditemukan");  
        
      private String isine;
      
      private pesan(String isine){
          this.isine = isine;
      }
      public String getPesan(){
          return isine;
      }
    }
    
    public void filterHuruf(KeyEvent a){
            if(Character.isAlphabetic(a.getKeyChar())){
                a.consume();
                JOptionPane.showMessageDialog(null,"inputan berupa angka");
            }
        }

    public void filterAngka(KeyEvent b){
            if(Character.isDigit(b.getKeyChar())){
                b.consume();
               JOptionPane.showMessageDialog(null,"Inputan berupa huruf");
            }
        }
    
    public void filterPass(KeyEvent c){
            if(Character.isDigit(c.getKeyChar()) && Character.isAlphabetic(c.getKeyChar()) 
                    && Character.isBmpCodePoint(c.getKeyChar()) ){
                c.consume();
               JOptionPane.showMessageDialog(null,"Inputan berupa huruf");
            }
        }
    
    
}
