using System;
using WSDL.mensajes;
using System.Collections;

namespace WSDL.operaciones{
    public class Operaciones : Mensajes
    {
        public int Dividir(int num1, int num2)
        {
            return num1 / num2;
        }

        public double Exponencial(double num1, double num2)
        {
            return Math.Pow(num1, num2);
        }

        public int Multiplicar(int num1, int num2)
        {
            return num1 * num2;
        }

        public double Raiz(double num1)
        {
            return Math.Sqrt(num1);
        }

        public int Restar(int num1, int num2)
        {
            return num1 - num2;
        }

        public int Sumar(int num1, int num2)
        {
            return num1 + num2;
        }
    }
}