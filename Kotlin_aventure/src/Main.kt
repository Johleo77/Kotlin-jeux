import kotlin.random.Random

fun calculDefenseTotal(defense : Int, armure : Int, qualite : Int  ): Int {

    return defense + armure + qualite
}
/**
 *
 */
fun lanceDes(Nb_dés : Int , Nb_face : Int): Int {

    val randomValues = List(Nb_dés) { Random.nextInt(1, Nb_face+1) }
        println(randomValues)
    var somme = 0
    for(dé in randomValues){
        somme += dé
    }
    return somme
}
fun calculDegatArme(Nb_dés : Int ,Nb_face : Int,qualite :Int, seuil_critique : Int,multiplicateurCritique : Int): Int {
    var degat = 0
    var dés = lanceDes(Nb_dés, Nb_face)
    if (dés> seuil_critique) {
        degat += dés * multiplicateurCritique

    }
    degat+=+ qualite
    return degat
}

fun attaque(hp_cible :Int,defTotal:Int, atktotal : Int , nomAtt : String ,nomCible : String ): String {

    var att = atktotal - defTotal
    if(att < 0 ) {
        att = 0
    }
    var pv = hp_cible - att
    if(pv < 0 ){
        pv = 0
    }

    return "$nomAtt attaque $nomCible $att point de dégâts et il lui reste $pv\n"
}










fun main() {
    println(calculDefenseTotal(8,6,5))
    println(lanceDes(3,18))
    println(calculDegatArme(3,20,3,12,2))
    println(attaque(600,530,600,"johan","maxime"))


}