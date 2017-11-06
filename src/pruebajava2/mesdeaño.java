/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import javax.swing.JOptionPane;

//Trabajando con meses y numero
 //datos Personal

/*/*Autor Graciela Clavel
 *Fecha 06 de Noviembre 2017
Clase de programa prueba 2 java
Responsabilidad clase Principal
 *
 * @author LAB18
 */
public class mesdeaño 
{
   public static void main(String[] args) 
   { 
   float mes = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un mes "));
    //El metodo round es para redondear un decimal
     
     switch(Math.round(mes)) //Se recibe un valor
     {
         case 1://Caso 1- si el valor 7
             JOptionPane.showMessageDialog(null,"Enero");
             
         break;
          case 2://Caso 2- si el valor 6
             JOptionPane.showMessageDialog(null,"Febrero");
             
         break;
          case 3://Caso 3- si el valor 5
             JOptionPane.showMessageDialog(null,"Marzo");
             
         break;
          case 4://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"Abril");
             
        break;
        case 5 ://Caso 2- si el valor 6
             JOptionPane.showMessageDialog(null,"Mayo");
             
         break;
          case 6://Caso 3- si el valor 5
             JOptionPane.showMessageDialog(null,"Junio");
             
         break;
          case 7://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"Julio");
              break;
          case 8://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"Agosto");
             
        break;
        case 9 ://Caso 2- si el valor 6
             JOptionPane.showMessageDialog(null,"Septiembre");
             
         break;
          case 10://Caso 3- si el valor 5
             JOptionPane.showMessageDialog(null,"Octbre");
             
         break;
          case 11://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"Noviembre");
              break;
          case 12://Caso 4- si el valor 4
             JOptionPane.showMessageDialog(null,"Diciembre");
             
         break;
          default:
               JOptionPane.showMessageDialog(null,"Los meses del año");
             
              
     }
    
    }   
}
          

