class CH2 {
    var num1:Int?=null
    var num2:Int?=null

     constructor() {}        // Primary
    constructor(_num1: Int=34, _num2: Int=23) {
        this.num1 = _num1
        this.num2 = _num2
    }   // Secondary

    constructor(name:String) {
        println(name)
    }

    //initializer Block nai use hota

    fun add() {
//        Local Variables
        //    var num1 = 10
        //    var num2 = 20
        println("Sum of 2 numbers is: ${num1!! + num2!!}")
    }

}

fun main() {

//    var obj = CH1(23, 14)
//    var obj = CH2(_num2 =34)
    var obj = CH2("Hasnain")
   // obj.add()

}