

import java.util.*;

fun main() {
    val input = Scanner(System.`in`);
    print("Input bilangan = ");
    var angka: Int = input.nextInt();
    var x = angka;
    repeat(7) {
        angka+=x;

        if(angka % 2 == 0 || angka % 3 == 0) {
            print("${angka} ");
        }
    }
}