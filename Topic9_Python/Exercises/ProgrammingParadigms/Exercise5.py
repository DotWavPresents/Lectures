import math


def main():
    def isPerfectNumber(number):
        """A number is perfect if the sum of its divisors is equal to it.
        For example, 6 is perfect because its divisors are (1, 2, 3), and 1 + 2 + 3 = 6.
        Another example is 28: 1 + 2 + 4 + 7 + 14 = 28

        Returns True if the given number is perfect. Returns False otherwise.
        """

        # TODO- Using tail recursion, make this method return true if the provided number is perfect, and false otherwise.
        #  Hint: make a tail auxiliary function that finds the number's divisors

        pass

    print(isPerfectNumber(6)) # True
    print(isPerfectNumber(28)) # True
    print(isPerfectNumber(496)) # True
    print(isPerfectNumber(10)) # False
    print(isPerfectNumber(8)) # False
    print(isPerfectNumber(100)) # False


if __name__ == '__main__':
    main()
