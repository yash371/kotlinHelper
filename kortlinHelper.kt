import org.xml.sax.ErrorHandler
import java.util.Scanner


class kortlinHelper {
    var scannerObj = Scanner(System.`in`)
    fun IntegerInput(args: String): Int {
        print(args)
        var data: Int
        try {
            data = scannerObj.nextInt()
        } catch (e: Exception) {
            ErrorHandler(1)
            return 0;
        }
        return data

    }

    fun StringInput(args: String): String {
        print(args)
        var data: String
        try {
            data = scannerObj.nextLine()
        } catch (e: Exception) {
            ErrorHandler(4)
            return "false";
        }
        return data

    }

    fun DoubleInput(args: String): Double {
        print(args)
        var data: Double
        try {
            data = scannerObj.nextDouble()
        } catch (e: Exception) {
            ErrorHandler(3)
            return 0.0;
        }
        return data

    }

    fun FloatInput(args: String): Float {
        print(args)
        var data: Float
        try {
            data = scannerObj.nextFloat()
        } catch (e: Exception) {
            ErrorHandler(2)
            return 0.0f;
        }
        return data

    }

    fun ErrorHandler(code:Int){
        print(when(code){
            1->"Please input integer data only..."
            2->"Please input floating data only..."
            3->"Please input double data only..."
            4->"Please input string data only..."
            else->"error in valid"
        })

    }
}
