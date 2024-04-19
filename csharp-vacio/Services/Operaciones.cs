using System;
using WSDL.mensajes;
using System.Collections;

namespace WSDL.operaciones{
    public class Operaciones : Mensajes
    {
        public double CToF(double Celsius)
        {
            return (Celsius * 1.8) + 32;
        }

        public double FToC(double Fahreheit)
        {
            return (Fahreheit - 32) * 0.5556;
        }
    }
}