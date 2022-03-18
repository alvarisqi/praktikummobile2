import java.util.*;

fun main() {
    val input = Scanner(System.`in`);
    print("Nilai x = ")
    val x = input.nextInt();
    val hasil : Double = 2*Math.pow(x.toDouble(), 2.0)+(5*x)-8;
    println("$hasil");
}