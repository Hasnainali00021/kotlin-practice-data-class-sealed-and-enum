fun main(){

            // Lecture 7   --  Null pointers

//    var name:String = " Ali "      // ->  init is must
    var name: String? = null    // null value can be accepted
//    name = null
//    println(name.length)

//option 1
//    if(name == null){
//        -1
//    }
//    else{
//        println(name.length)
//    }

//option 2
   //?  Illvis Operator ----  safe call

//    println(name?.length)

//option 3   ->  !!

    println(name!!.length)

}