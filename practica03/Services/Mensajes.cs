using System;
using System.ServiceModel;

namespace WSDL.mensajes{
        [ServiceContract]
    public interface Mensajes{
        [OperationContract]
        int Sumar (int num1, int num2);
        [OperationContract]
        int Restar (int num1, int num2);
        [OperationContract]
        int Multiplicar (int num1, int num2);
        [OperationContract]
        int Dividir (int num1, int num2);
        [OperationContract]
        double Raiz (double num1);
        [OperationContract]
        double Exponencial (double num1, double num2);
    }

}