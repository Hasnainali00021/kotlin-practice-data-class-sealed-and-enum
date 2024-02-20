// Parameter Constructor   ->   // Secondary Constructor

class CH1(var _num1:Int, var _num2:Int) {       //Primary Constructor ->  // Default Constructor -> CH1()

    //Global variables num1,num2.
    var num1:Int = 10                   //yahan par b initialize kar sakta VALUE lakin phir ya wala rum hoga
    var num2:Int = 20                   // Output 30
    //initializer Block
    init {
        num1=_num1                  //Output 37 kio ka yahan par value initialize hori _numlye value pass main ma horai
        num2=_num2
    }
    fun add() {
//        Local Variables
        //    var num1 = 10
        //    var num2 = 20
        println("Sum of 2 numbers is: ${num1+num2}" )
    }

}
fun main(){

    var obj = CH1(23,14)
    obj.add()

}