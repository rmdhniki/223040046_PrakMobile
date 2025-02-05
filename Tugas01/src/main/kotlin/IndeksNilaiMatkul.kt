package org.example

class IndeksNilaiMatkul {
    fun hitungIndeks(nilaiAkhir: Int?): String {
        if (nilaiAkhir == null){
            return "Nilai harus diisi"
        }
        if (nilaiAkhir < 0 || nilaiAkhir > 100) {
            return "Nilai di luar jangkauan"
        }
        return when (nilaiAkhir) {
            in 80..100 -> "A"
            in 70..79 -> "AB"
            in 60..69 -> "B"  // Corrected range from 60-89 to 60-69
            in 50..59 -> "BC"
            in 40..49 -> "C"
            in 30..39 -> "D"
            else -> "E" // 0..29
        }
    }
}