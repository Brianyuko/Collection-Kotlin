fun main(){

    // Ciri - Ciri List
    // 1. Diurutkan berdasarkan index
    // 2. Isinya boleh sama

    // Immutable list

    // Gaya Penulisan Pertama
    //val name = listOf<Tipe Data>(element)
    println("Immutable List")
    val anggota = listOf("Angga", "Arsyi", "Aje")
    println(anggota.toList())
    println("${anggota[0]} berada pada index ke 0")

    // Gaya Penulisan Kedua, lebih eksplisit
    println("Immutable List")
    val anggota1: List<String> = listOf("Bayu", "Arsyad", "Dharman")
    println("${anggota1[2]} berada pada index ke 2")
    println(anggota1.toList())

    // Mutable List
    // Tipe data Any, untuk tipe data apa saja
    println("Muttable List")
    val anggota2: MutableList<Any> = mutableListOf("Arsyad", 19, "Dharman", 20)
    println(anggota2.toList())
    println("Menghapus dan Menambahkan Index 2")
    anggota2.removeAt(2)
    anggota2.add(2, "Ian")
    println(anggota2.toList())
}