import java.util.Scanner;
/**
 * Clase contrasena si coincide o no
 * 
 * @author López Santiago Oscar  
 * @version 30/11/2019
 */
public class Contrasena
{
    //inicializar variables de instancia 
    private String con;

    /**
     * Constructor de objetos de clase Contrasena
     * @param c El parametro c define el String que sera la contraseña 
     */
    public Contrasena(String c)
    {
        // pon tu código aquí
        con=c;
    }
    //Cierre del constructor
    /**
     * Método que compara las contraseñas 
     * @parem 
     * @return void
     */
    public void  conparar(){
        //pon tu código aquí
        int cont = 0;
        Scanner contrasena = new Scanner(System.in);
        do{
            System.out.println("Ingrese la contraseña\n Intentos:"+(3-cont));
            con=contrasena.nextLine();
            if(con.equals(contrasena)){
                System.out.println("Contraseña correcta");
                return ;
            }
            cont++;
            System.out.println("Contraseña incorrecta");
        }while(cont<3);
        System.out.println("Bloqueado");
    }//Cierre del método
} //Cierre de la clase 
