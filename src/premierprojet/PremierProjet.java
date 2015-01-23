/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package premierprojet;
import mystere.Mystere;
/**
 *
 * @author sergedelil
 */
public class PremierProjet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//sout suivi de tab
        System.out.println("Hello Serge");
        Mystere m = new Mystere();
        m.methodeMystere();
        System.out.println(args[0]);
        System.out.println(args[1]);
        String str = "426.75$";
        System.out.println(str.substring(6, 7));
        System.out.println("deuxieme ajout");
         
    }
    
}
