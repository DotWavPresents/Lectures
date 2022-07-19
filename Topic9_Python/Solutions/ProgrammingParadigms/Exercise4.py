import math


def main():
    def mirror(number):
        """Returns the mirror of a number, which is the same number with its
        digits' order inverted.
        You may assume the given number is always positive
        Ex: mirror(4798) -> 8974"""

        def mirrorAux(number, digit):
            if number < 10:
                # Bottom case: if the number has a single digit, the mirror of it is the same digit
                return number
            else:
                # 'number % 10' is fetching the last digit
                # if the number is 625, for it to become 526, we need to add 500 + 20 + 6
                # '10 ** digit' gives us the power of 10 needed to make the 500
                # so we get (625 % 10) * (10 ** 2) which yields 500
                # to get the 20 + 6 we recursively call mirrorAux(62, 1)
                # '625 // 10 = 62'
                return (number % 10) * (10 ** digit) + mirrorAux(number // 10, digit - 1)

        return mirrorAux(number, int(math.log(number, 10)))

    print(mirror(67)) # 76
    print(mirror(28)) # 82
    print(mirror(777)) # 777
    print(mirror(1000)) # 1
    print(mirror(12345)) # 54321


if __name__ == '__main__':
    main()
