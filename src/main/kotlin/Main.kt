fun main() {
    print("Enter input data:")
    var input = readLine()!!.toInt()
    try {
        var data= checkFactorial(input)
        println("Factorial vvedennogo chisla = ${factorial(input)}")
    }
    catch (e: Exception){
        println(e.message)
    }
}
fun checkFactorial (n: Int): Int {
    if (n < 0) throw Exception("Invalid value $n. n must be greater than 0")
    println("n=$n is valid")
    return n
}
 fun factorial (n:Int): Int{
    if (n!=1){
        return n * factorial(n-1);
    }else return 1


}
