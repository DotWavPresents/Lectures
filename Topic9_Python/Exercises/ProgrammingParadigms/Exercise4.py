import math


def main():
    def mirror(number):
        """Returns the mirror of a number, which is the same number with its
        digits' order inverted.
        You may assume the given number is always positive
        Ex: mirror(4798) -> 8974"""

        # TODO- Use functional programming only (tail recursion)
        # Hint: n // 10 -> yields every digit except the last one (whole division by 10)
        # Ex: 625 // 10 = 62
        # Hint 2: n % 10 -> yields the last digit (rest of division by 10)
        # Ex: 625 % 10 = 5

        pass

    print(mirror(67)) # 76
    print(mirror(28)) # 82
    print(mirror(777)) # 777
    print(mirror(1000)) # 1
    print(mirror(12345)) # 54321


if __name__ == '__main__':
    main()
