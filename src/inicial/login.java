/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicial;


 
 //@author Alejandro Dávila
public class login {

      
        
        public static String usuarioArray[] = new String[5];
        public static String contraseñaArray[] = new String[5];
        static String usuario,contraseña,continuar;
        public static boolean usuarios_ocupados[] = new boolean[usuarioArray.length]; 
        public static jugadores listaj[] = new jugadores[usuarioArray.length];
        public static String ult10[] = new String[10];
        public static boolean usuarioEncontrado = false;
        public static boolean registroExitoso = false;
        public boolean condicionante=true;
        public static int c_reg=0;
    
        public void registro(){
            usuarioArray[c_reg]=usuario;
            contraseñaArray[c_reg] = contraseña;
            if(usuarioArray[c_reg].length() > 0 && contraseñaArray[c_reg].length() > 0){                            
                registroExitoso = true;
                usuarios_ocupados[c_reg] = true;
            }
        }
        public boolean usuario_encontrado(){
            for (String user: usuarioArray){
                if (usuario.equalsIgnoreCase(user)){
                    usuarioEncontrado = true;
                    break;
                }
            }
            return usuarioEncontrado;
        }
        public void login(){
            MenuPrincipal mp = new MenuPrincipal();
            for (int contaNom=0;contaNom<5;contaNom++){
                 /*
                            con este for, se va detectando si el usuario y la password son congruentes.
                            En caso de que no sean iguales, repetira el ciclo
                 */
                if (usuario.equalsIgnoreCase(usuarioArray[contaNom])&&contraseña.equalsIgnoreCase(contraseñaArray[contaNom])){
                    jugadores jugador = new jugadores(usuario,contraseña,0);
                    condicionante = false;
                    mp.setVisible(true);
                    break;
                }
            }                    
        }
                        
            

    
    
    public static String[] usuarios() {
        return(usuarioArray);
    }
    public static String[] contraseñas(){
        return(contraseñaArray);
    }
    public static void main(String[] args) {
        
    }
}
