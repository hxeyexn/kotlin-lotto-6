package lotto

import camp.nextstep.edu.missionutils.Randoms

class LottoGenerator {

    private val lottoGenerator: () -> List<Int> = {
        Randoms.pickUniqueNumbersInRange(LOTTO_MIN_NUMBER, LOTTO_MAX_NUMBER, LOTTO_MAX_COUNT)
    }

    fun generateLotto(): List<Int> {
        val numbers = lottoGenerator()
        Lotto(numbers)
        return numbers
    }

    companion object {
        const val LOTTO_MIN_NUMBER = 1
        const val LOTTO_MAX_NUMBER = 45
        const val LOTTO_MAX_COUNT = 6
    }

}