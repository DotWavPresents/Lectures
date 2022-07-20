import math


def main():
    def mirror(number):
        """Returns the mirror of a number, which is the same number with its
        digits' order inverted.
        You may assume the given number is always positive
        Ex: mirror(4798) -> 8974"""

        def mirrorAux(number, accumulated):
            if number == 0:
                # Bottom case: if the number has a single digit, the mirror of it is the same digit
                return accumulated
            else:
                # Every recursive call, we're removing the last digit from 'number' by doing 'number // 10'
                # (ex: 625 // 10 = 62), and placing it in the accumulated argument by doing 'number % 10'
                # (ex: 625 % 10 = 5).
                # By doing this, we are transferring the last digits into the accumulated result
                # 1st recursion with number = 625 and accumulated = 0-
                # return mirrorAux(62, 5)
                # 2nd: return mirrorAux(6, 52)
                # 3rd: return mirrorAux(0, 526)
                # 4th: return 526 because number == 0 and accumulated == 526
                return mirrorAux(number // 10, accumulated * 10 + (number % 10))

        return mirrorAux(number, 0)

    print(mirror(67)) # 76
    print(mirror(28)) # 82
    print(mirror(777)) # 777
    print(mirror(1000)) # 1
    print(mirror(12345)) # 54321


if __name__ == '__main__':
    main()
