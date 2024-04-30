package mx.uv.practica05;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.saludos.BuscarSaludosResponse;
import mx.uv.t4is.saludos.BuscarSaludosResponse.Saludos;
import mx.uv.t4is.saludos.SaludarRequest;
import mx.uv.t4is.saludos.SaludarResponse;

@Endpoint
public class SaludosEndPoint {
    ArrayList<Saludos> saludos = new ArrayList<Saludos>();
    int i = 0;

    @PayloadRoot(localPart = "SaludarRequest", namespace = "t4is.uv.mx/saludos")
    @ResponsePayload
    public SaludarResponse Saludar(@RequestPayload SaludarRequest nombre) {
        SaludarResponse respuesta = new SaludarResponse();
        respuesta.setRespuesta("Hola " + nombre.getNombre());
        Saludos e = new Saludos();
        e.setId(i);
        e.setNombre(nombre.getNombre());
        i++;
        saludos.add(e);

        return respuesta;
    }   
    
    @PayloadRoot(localPart = "BuscarSaludosRequest", namespace = "t4is.uv.mx/saludos")
    @ResponsePayload
    public BuscarSaludosResponse BuscarSaludos() {
        BuscarSaludosResponse respuesta = new BuscarSaludosResponse();
        for(int j = 0; j < saludos.size(); j++){
            respuesta.getSaludos().add(saludos.get(j));
        }
        return respuesta;
    }   
}
