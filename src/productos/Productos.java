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
        
        int n = 2,valor = 0;
        String resultado = "", posicion = "";
        String productos[] = new String[n];
        int precios[] = new int[n];
        String resultadoFinal = " ";
        

        //Ciclo para pedir los nombres de productos y sus precios
        for(int i = 0; i<productos.length;i++){
           productos[i] = JOptionPane.showInputDialog("Digite el producto #"+(i+1));
           precios[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del producto #"+(i+1)));
        }
        

        for(int k = 0;k<precios.length;k++){
            //Si el valor del producto es mayor a 3000, guarde la cantidad de productos mayores a 3000.
            if(precios[k] >=3000){
                valor += 1;
                
                //posicion = k + " ";
            }else{
                valor = 0;
            }
            //Casteamos el valor para tener la posición del elemento
            posicion = k + " ";
            
//            resultado +="""
//                        Productos mayores a $3000 COP"""+valor+" "+
//                        """
//                        Producto #"""+(k+1)+productos[k]+" "+
//                        """
//                        Precio: $"""+precios[k]+" "+
//                        """
//                        Posición: """+posicion+"\n";
            
            resultado +="""
                         PRODUCTO #"""+(k+1)+": "+productos[k]+" "+
                        """
                         PRECIO: $"""+precios[k]+" "+
                        """
                         POSICIÓN: """+posicion+"\n";

            
        }
        resultadoFinal += """
                        Productos mayores a $3000 COP: """+valor+"\n"+resultado;
        

        JOptionPane.showMessageDialog(null, resultadoFinal);
    }
    
}
