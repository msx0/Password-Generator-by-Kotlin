package TestCodes
import kotlin.random.Random

class passwordMaker {

    fun getRandomPassword(a: Int): String {
        val characterSet =( 'a'..'Z') + ('A'..'Z')
        var random = Random(System.nanoTime())
        var password = StringBuilder()


        for (i in 0 until a){


            val psMaker = random.nextInt(characterSet.size)
            password.append(characterSet[psMaker])
        }

        return password.toString()
    }


}
