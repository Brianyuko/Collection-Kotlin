fun main(){

    //Collection Set
        //Uniqe -> Isinya tidak boleh ada yang kembar

    //Immutable Set
    val members = setOf<String>("Ian", "Bayu", "Mustafa", "Bayu")
    println(members.toList()) // Bayu hanya akan di print sekali, karena Bayu ada 2

    //Mutable Set
    val member2 = mutableSetOf<String>("Arsyad", "Wahyu")
    println(member2.toList())
    // member2.add("Arsyad") ini tidak akan ditambahkan, karena sudah ada
    member2.add("Rhevin")
    println(member2.toList())


}