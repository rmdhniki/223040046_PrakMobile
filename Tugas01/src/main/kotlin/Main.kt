package org.example

fun main(args: Array<String>) {
    val indeksNilaiMatkul = IndeksNilaiMatkul()

    println("No\tInput\tOutput")

    for (i in args.indices) {
        val input = args[i]

        val nilai = input.toIntOrNull()

        val indeks = indeksNilaiMatkul.hitungIndeks(nilai)

        println("${i + 1}\t${input}\t${indeks}")
    }

    if (args.isEmpty()) {
        println("1\t{kosong}\tNilai harus diisi")
    }
}