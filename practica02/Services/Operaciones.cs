using System;
using WSDL.mensajes;
using System.Collections;

namespace WSDL.operaciones{
        public class Operaciones : Mensajes
    {
        ArrayList nombres = new ArrayList();
        public string Mostrar(int id){
            string[] arrayNumeros = (string[])nombres.ToArray(typeof(String));
            string nombre = arrayNumeros[id];
            return nombre;
        }

        public string Saludar(string nombre)
        {
            nombres.Add(nombre);
            string msj = "Hola " + nombre;
            return msj;
        }
    }
}