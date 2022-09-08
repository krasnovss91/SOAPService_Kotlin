package service

import javax.jws.WebMethod
import javax.jws.WebService
import javax.jws.soap.SOAPBinding

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
interface DemoWebService {

    @WebMethod
    fun getResult(a: Int, b: Int, c: Int): Double

    @WebMethod
    fun getResultNeg(a: Int, b: Int, c: Int): Double
}