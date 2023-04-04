/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventorysystemmanagement;

/**
 *
 * @author TUOYINTIR ABEL. Y. J
 */
public class InventorySystemManagement {

    public static void main(String[] args) {
        InventoryManagementSystem ho = new InventoryManagementSystem();
        ho.setVisible(true);
        
        try{
            for (int x = 0; x <= 100; x++){
            Thread.sleep(20);
            
            InventoryManagementSystem.load.setText(Integer.toString(x) + "%");
            InventoryManagementSystem.LoadingBar.setValue(x);
            }
        } 
        catch (InterruptedException e){
            
        }
    }
}
