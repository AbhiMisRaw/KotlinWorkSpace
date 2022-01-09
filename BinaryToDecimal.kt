fun main(){
    var str :String = readln();
    var value :Int = convertoToDecimal(str)
    print(value)
}
fun convertoToDecimal(stmt: String): Int {
    var conv :Int = 1
    var res : Int = 0
    var i = 1
    var ch = stmt.toCharArray()
    for( i in 1..(ch.size)) {
        if (ch[ch.size - i] == '1') {
            res += conv
            conv *= 2
        }else{
            conv *= 2
        }
    }
    return res
}