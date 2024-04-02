package mx.uv;

import static spark.Spark.*;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        get("/", (rq, rs) -> {
            String respuesta = "<note>\r\n" + //
                                "  <to>Tove</to>\r\n" + //
                                "  <from>Jani</from>\r\n" + //
                                "  <heading>Reminder</heading>\r\n" + //
                                "  <body>Don't forget me this weekend!</body>\r\n" + //
                                "</note>";
            rs.type("application/xml");
            return respuesta;
        });

        get("/xml", (rq,rs)->{
            Alumno alumno = new Alumno();
            alumno.setNombre("Sebastian");
            alumno.setId("7");
            rs.type("application/xml");
            XmlMapper xml = new XmlMapper();
            String respuesta = xml.writeValueAsString(alumno);
            // return "<nombre>" + alumno.getNombre() + "</nombre>";
            return respuesta;   
        });
    }
}

    class Alumno {
        String nombre;
        String apellido;
        String id;

        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getApellido() {
            return apellido;
        }
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        
    }
