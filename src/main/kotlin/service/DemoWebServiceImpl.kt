package service

import javax.jws.WebService
import kotlin.math.sqrt

@WebService(endpointInterface = "client.DemoWebService")
class DemoWebServiceImpl : DemoWebService {
    override fun getResult(a: Int, b: Int, c: Int): Double {
        val d = (b * b) - (4 * a * c)

        return (b * (-1) + sqrt(d.toDouble())) / (2 * a)
    }

    override fun getResultNeg(a: Int, b: Int, c: Int): Double {
        val d = (b * b) - (4 * a * c)

        return (b * (-1) - sqrt(d.toDouble())) / (2 * a)
    }
}