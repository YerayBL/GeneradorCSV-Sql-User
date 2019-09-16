package generadorcsv;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GeneradorCSV {

    public static void main(String[] args) throws FileNotFoundException {
        /*File directorio = new File("C:\\Program Files\\saveCsvConsult");
         if (!directorio.exists()) {
         directorio.mkdir();
         System.out.println(directorio.mkdir());
         // If you require it to make the entire directory path including parents,
         // use directory.mkdirs(); here instead.
         }*/

        if (args.length > 0) {
            if (args[0].equals("start")) {
                ConexionSql conn = new ConexionSql();
                conn.Conexion2();
                System.exit(0);
            }
            /*if (args[0].equals("install")) {
                System.out.println();
                System.out.println();
                String directorio = "C:\\GeneradorCSV";
                File aux = new File(directorio);
                String query = "";
                if (aux.mkdir()) {
                    System.out.println("Directorio creado correctamente");
                    ConexionSql c = new ConexionSql();
                    c.generadorFichero();
                } else {
                    System.out.println("El directorio ya existe");
                }

            }*/ else if (args[0].equals("help")) {
                System.out.println();
                System.out.println();
                System.out.println("Lista de comandos:");
                System.out.println();
                System.out.println("start: Inicia la aplicación sin interfaz y de modo automatico");
                System.out.println();
                //System.out.println("install: Genera un dierctorio en C:/ para guardar archivos para la aplicación");
                //System.out.println();
                System.out.println("encript: para encriptar texto en cifrado 'MD5' (útil para las contraseñas)");
                System.out.println();
            } else if (args[0].equals("encrypt")) {
                System.out.println();
                System.out.println();
                System.out.println("Introduzca la contraseña para encriptarla.\nEsta se guardará en su portapapeles encriptada.");
                System.out.println();
                Scanner sc = new Scanner(System.in);
                String aux = sc.nextLine();
                aux = ConexionSql.Encripter(aux);
                StringSelection selection = new StringSelection(aux);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(selection, selection);
                System.out.println();
                System.out.println("Su contraseña ha sido encriptada");

            } else {
                System.out.println("Parametro Incorrecto");
                System.exit(0);
            }
        } else {

            //ventana
           /*String directorio = "C:\\GeneradorCSV";
            File aux = new File(directorio);
            String query = "";
            if (aux.mkdir()) {
                System.out.println("Directorio creado correctamente");
                ConexionSql c = new ConexionSql();
                c.generadorFichero();
            } else {
                System.out.println("El directorio ya existe");
            }*/

            String[] cadena;
            cadena = new String[7];
            ConexionSql csql = new ConexionSql();
            Window w = new Window();

            try {
                cadena = csql.Reader(cadena[6]);
            } catch (Exception e) {
                System.out.println("no hay archivo");
            }
            w.setVisible(true);
            w.rellenador(cadena[0], cadena[1], cadena[2], cadena[3], cadena[4], cadena[5], cadena[6]);

            w.getContentPane().setBackground(new java.awt.Color(0, 55, 100));
        }
        /*w.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
         ConexionSql conn = new ConexionSql();
         conn.cerrarConexion();
         System.exit(0);
         }
         });*/

        /*ConexionSql cSql = new ConexionSql();
        
         try {
         cSql.Reader();
         } catch (FileNotFoundException ex) {
         Logger.getLogger(GeneradorCSV.class.getName()).log(Level.SEVERE, null, ex);
         }*/
    }

}
