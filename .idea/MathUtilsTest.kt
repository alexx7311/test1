import kotlin.test.Test
import kotlin.test.assertEquals

class MathUtilsTest {
    @Test
    fun testSum() {
        assertEquals(6, MathUtils.sum(2, 3))
    }
}
