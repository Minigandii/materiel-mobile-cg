package fr.epf.mm.gestionclientmin2_cg.model

enum class Gender{
    MAN,WOMAN
}

data class Client (
    val lastName: String,
    val firstName: String,
    val gender: Gender
    ){
    companion object{
        fun all() : List<Client>{
                val clients = (1..20).map {
                Client(
                    "Nom${it}", "Prenom${it}",
                    if (it % 3 == 0) Gender.MAN else Gender.WOMAN
                )
            }.filter {
                it.gender == Gender.MAN
            }
            return clients
        }
    }
}

