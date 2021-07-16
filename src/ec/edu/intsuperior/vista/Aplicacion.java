/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Punto;
import ec.edu.intsuperior.modelo.Circulo;
import javax.swing.JOptionPane;


public class Aplicacion {
    public static void main(String[] args){
      
        Punto p1=new Punto (4,3);
        Punto p2=new Punto (-3,1);   
        Circulo c1=new Circulo(5,p1);
         
        System.out.println("La diferencia entre en punto 1 y 2 es:"+ p1.distanciaDosPuntos(p2.getx(),p1.getx(),p2.getY(),p1.getY()));
        System.out.println("La distancia del punto al centro es: "+p1.distanciaAlCentro(p1.getx(),p1.getY()));
        System.out.println("La distancia del punto al centro es: "+p2.distanciaAlCentro(p2.getx(),p2.getY()));
        
        JOptionPane.showMessageDialog(null, "El circulo se encuntra en el punto:"+"p1("+c1.getCentro().getx()+";"+c1.getCentro().getY()+ ")"+ "\nEl radio del circulo es:"+c1.getRadio()+"\n"
                +"El area del circulo es:"+c1.areaCirculo());
    }
    
     
    
}

