/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class TareaDeMemoriaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ArrayList <String> frases = new ArrayList<String>();
        
        ArrayList <String> Cadenas;//Creando un objeto o instancia de tipo ArrayList
        Cadenas = new ArrayList<String>();
        String frase, respuesta;
        do{
          frase = JOptionPane.showInputDialog(null,"Ingresa la frase: ");
          //Agregando la frasede la lista 
          Cadenas.add(frase);
          respuesta=JOptionPane.showInputDialog(null, "¿Desea ingresar otra frase? (SI/NO)");
          respuesta= respuesta.toUpperCase();
        }while(!respuesta.equals("NO"));
        //Mostrando el contenido de cadenas
        System.out.println("Frases Originales");
        for (int i=0;i<Cadenas.size();i++){
            System.out.println(Cadenas.get(i));
        }
         //Utilizando el metodo set 
         Cadenas.set(1, "La que modifique ");
         //Mostrando el contenido de cadenas
        System.out.println("Frases Modificar");      
        for (int i=0;i<Cadenas.size();i++){ 
            System.out.println(Cadenas.get(i));
    }
        Cadenas.remove(0);
        System.out.println("Frases Que nos quedan");
        for (int i=0;i<Cadenas.size();i++){ 
            System.out.println(Cadenas.get(i));
     }
    }
}
