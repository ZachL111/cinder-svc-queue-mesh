fun main() {
    val signalcase_1 = Signal(80, 78, 13, 23, 6)
    check(Policy.score(signalcase_1) == 107)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(90, 96, 12, 23, 4)
    check(Policy.score(signalcase_2) == 137)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(95, 81, 12, 11, 10)
    check(Policy.score(signalcase_3) == 228)
    check(Policy.classify(signalcase_3) == "accept")
}
