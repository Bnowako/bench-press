package engineering.nomore

fun main() {
    val kE = KotlinExample()
//    val plain = kE.plainReplace("012")
//    val sb = kE.sbReplace("012")
//    val sb = kE.charrArrayReplace("012")
//    println(plain)
//    println(sb)
//    println(plain == "abc")
//    println(sb == "abc")
    Thread.sleep(10_000)
    val TEST_STRING =
        "a123431321382183218192389123891283982139321813282318u1238u8u91238u9123u88u91238u1238u91238u98u12381239891238921838u12389u21389u82139u8u92138u921389u8u912389u12389u3218u9823918u91238u91238u92138u982u1398u9123u892138u91238u9"

    repeat(1_000_000) {
        kE.plainReplace(TEST_STRING)
        kE.sbReplace(TEST_STRING)
        kE.charrArrayReplace(TEST_STRING)
    }



}
