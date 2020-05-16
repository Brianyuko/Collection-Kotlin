fun main(){

    // Collection Map
        // Key to Value
        // list[key]

    // Immutable
    val members = mapOf<Int, String>(12 to "Ahmad", 27 to "Bagaz", 38 to "Charles")
    println("Print menggunakan for biasa")
    for (id in members.keys){
        println(members[id])
    }
    println("")
    println("Print Menggunakan For Each")
    members.forEach{ (key, value) -> println("ID $value adalah: $key")
    }
    println("")

    // Mutable
    val members2 = mutableMapOf<String, Int>("Alan" to 90, "Byan" to 70, "Salman" to 88)
    println("Sebelum Dirubah")
    members2.forEach{ (nama, nilai) -> println("Nama $nama, Nilai: $nilai")
    }

    members2["Jodhy"] = 20 //members2.put("Jodhy", 20)
    members2.replace("Alan", 90, 20)

    println("")

    println("Sudah dirubah")
    members2.forEach{ (nama, nilai) -> println("Nama $nama, Nilai: $nilai")
    }
}