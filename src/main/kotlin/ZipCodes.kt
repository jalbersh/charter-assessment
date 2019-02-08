package jalbersh

import java.io.File

/**
 * Read in the file of zip codes
 * Process the ones that begin with 8.
 * Multiple each by 1.5
 * For each of the results – print the sorted list.
 *
 * @author jalbersh
 * @date 01/24/2019
 */
fun main(args : Array<String>) {
    val fileName = if (!args.isEmpty() && args.size>0) args[0] else {System.out.println("Usage: java -jar zip.jar filename");return};
    val instance = ZipCodes(fileName)
    val fileList = instance.readCodesFromFile()
    val newList = instance.getEightsAndMultiplyAndSort(fileList)
    newList.forEach(System.out::println)
}
data class ZipCodes(val nameOfFile: String) {
    private val FACTOR = 1.5
    private val UPPER_LIMIT = 89999
    private val LOWER_LIMIT = 80000

    public fun readCodesFromFile(): List<String> =
        if (!nameOfFile.isEmpty()) File(nameOfFile).bufferedReader().readLines() else listOf("ERROR: no filename given")

    public fun convertToLong(s: String) =
            try {s.toLong()} catch(ex:NumberFormatException){0L}

    public fun getEightsAndMultiplyAndSort(list: List<String>): List<String> =
            list.map {convertToLong(it)}.filter { (it >= LOWER_LIMIT && it <= UPPER_LIMIT) }.map { (it * FACTOR).toString() }.sortedBy {it}
}