/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productos;

/**
 *
 * @author lalej
 */
import javax.swing.*;
public class Productos {

    public static void main(String[] args) {
        
        int n = 10,valor = 0;
        String resultado = "", posicion = "";
        String productos[] = new String[n];
        int precios[] = new int[n];
        

        //Ciclo para pedir los nombres de productos
        for(int i =0; i<productos.length;i++){
            productos[i] = JOptionPane.showInputDialog("Digite el producto #"+(i+1));
        }
        
        
        //Ciclo para pedir los precios
        for(int j = 0; j<productos.length;j++){
            precios[j] = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del producto #"+(j+1)));
            
        }
        
        for(int k = 0;k<precios.length;k++){
            //Si el valor del producto es mayor a 3000, guarde la cantidad de productos mayores a 3000.
            if(precios[k] >=3000){
                valor = valor+1;
                //Casteamos el valor para tener la posición del elemento
                posicion = k + " ";
            }else{
                valor = 0;
            }
            
            resultado +="""
                        Productos mayores a $3000 COP"""+valor+" "+
                        """
                        Producto #"""+(k+1)+productos[k]+" "+
                        """
                        Precio: $"""+precios[k]+" "+
                        """
                        Posición: """+posicion+"\n";


        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
