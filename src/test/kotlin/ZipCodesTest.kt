import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.fail

class ZipCodeTest {

    @Test
    fun getEightsAndMultiplyAndSortTest() {
        val expectedList = listOf("120001.5","120003.0","120004.5")
        val list = listOf("80003","12345","80002","23456","34567","80001")
        val actualList = jalbersh.ZipCodes("").getEightsAndMultiplyAndSort(list)
        assertEquals(expectedList, actualList)
    }

    @Test
    fun readCodesFromFileTest() {
        val expectedList = listOf("12345","80303","80302","30308","80002","20008","76543","34567","99001","10099")
        val actualList = jalbersh.ZipCodes("testzipcodes.txt").readCodesFromFile()
        assertEquals(expectedList, actualList)
    }

    // need test to check for handling null filename
    @Test
    fun readCodesFromNoFileNameTest() {
        val expectedList = listOf("ERROR: no filename given")
        val actualList = jalbersh.ZipCodes("").readCodesFromFile()
        assertEquals(expectedList,actualList)
    }

    // need test to check for NumberFormatException
    @Test
    fun convertToLongTestForException() {
        val expectedValue = 0L
        val actualValue = jalbersh.ZipCodes("").convertToLong("dfghj")
        assertEquals(expectedValue,actualValue)
    }

    @Test
    fun convertToLongTest() {
        val expectedValue = 12345L
        val actualValue = jalbersh.ZipCodes("").convertToLong("12345")
        assertEquals(expectedValue,actualValue)
    }
}
