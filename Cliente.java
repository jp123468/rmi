import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
      public static void main(String[] args)  {
        Registry registro;
       
        try {
            registro=LocateRegistry.getRegistry("172.31.115.130",1099);
            //crear una instancia de la implementacion de la interfaz
     
            interfaz objetoRemoto=(interfaz) registro.lookup("ClienteRemoto");

            String mensaje=objetoRemoto.mensaje();
            System.out.println(mensaje);
            double respuesta=objetoRemoto.suma(5, 9);
            System.out.println(respuesta);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
      }
}
