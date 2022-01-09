fun main() {
    var list = listOf<Int>(1,2,3,4,5,6)
    /*for( i in list){
        println(i)
    }*/
    println(list)
    var li = mutableListOf<Int>(6,7,8,9)
    li.addAll(list)
    println("Now List is  : \n")
    var s = li.sorted()
    println(s)
}