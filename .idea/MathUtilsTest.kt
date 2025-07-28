import kotlin.test.Test
import kotlin.test.assertEquals

class MathUtilsTest {
    @Test
    fun testSum() {
        assertEquals(5, MathUtils.sum(2, 3))
    }
}
