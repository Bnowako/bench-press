package engineering.nomore

class KotlinExample() {

    private val replacements = mapOf(
        '0' to 'a',
        '1' to 'b',
        '2' to 'c',
        '3' to 'd',
        '4' to 'e',
        '5' to 'f',
        '6' to 'g',
        '7' to 'h',
        '8' to 'i',
        '9' to 'j'
    )


    private val replacementsArray = arrayOf(
        'a',
        'b',
        'c',
        'd',
        'e',
        'f',
        'g',
        'h',
        'i',
        'j'
    )

    fun plainReplace(str: String): String {
        return str
            .replace('0', 'a')
            .replace('1', 'b')
            .replace('2', 'c')
            .replace('3', 'd')
            .replace('4', 'e')
            .replace('5', 'f')
            .replace('6', 'g')
            .replace('7', 'h')
            .replace('8', 'i')
            .replace('9', 'j')
    }

    fun sbReplace(str: String): String {
        val sb = StringBuilder(str.length)
        repeat(str.length) {
            val value = replacements[str[it]] ?: it
            sb.append(
                value
            )
        }
        return sb.toString()
    }

    fun charrArrayReplace(str: String): String {
        val ca = str.toCharArray()
        repeat(str.length) {
            ca.set(it, replacements[ca[it]] ?: ca[it])
        }
        return ca.concatToString()
    }

    fun charrArrayReplaceArray(str: String): String {
        val ca = str.toCharArray()
        for (it in 0..str.lastIndex) {
            val charIdx = ca[it].code.toByte() - '0'.code.toByte()
            if (charIdx < 0 || charIdx > 9) continue
            ca.set(
                it,
                replacementsArray[charIdx]
            )
        }
        return ca.concatToString()
    }

}
