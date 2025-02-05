package org.example

class PersegiPanjang(val panjang: Int, val lebar: Int) {

    fun hitungLuas(): Int {
        return panjang * lebar
    }

    fun hitungKeliling(): Int {
        return 2 * (panjang + lebar)
    }
}