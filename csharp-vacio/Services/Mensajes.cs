using System;
using System.ServiceModel;

namespace WSDL.mensajes{
        [ServiceContract]
    public interface Mensajes{
        [OperationContract]
        Double FToC (Double Fahreheit);
        [OperationContract]
        Double CToF (Double Celsius);
    }

}