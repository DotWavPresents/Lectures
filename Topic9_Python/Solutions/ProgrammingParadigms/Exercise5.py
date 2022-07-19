import math


def main():
    def isPerfectNumber(number):
        """A number is perfect if the sum of its divisors is equal to it.
        For example, 6 is perfect because its divisors are (1, 2, 3), and 1 + 2 + 3 = 6.
        Another example is 28: 1 + 2 + 4 + 7 + 14 = 28

        Returns True if the given number is perfect. Returns False otherwise.
        """

        # Auxiliary recursive function 1
        def getDivisors(number, divisor):
            if divisor == number:
                # Bottom case: divisor is number, because initially, divisor will be 1 and it will increment
                return []
            else:
                if number % divisor == 0:
                    return [divisor] + getDivisors(number, divisor + 1)
                else:
                    return getDivisors(number, divisor + 1)

        # Auxiliary recursive function 2
        def sum(numbersList):
            if len(numbersList) == 0:
                return 0
            else:
                return numbersList[0] + sum(numbersList[1:])

        return sum(getDivisors(number, 1)) == number

    print(isPerfectNumber(6)) # True
    print(isPerfectNumber(28)) # True
    print(isPerfectNumber(496)) # True
    print(isPerfectNumber(10)) # False
    print(isPerfectNumber(8)) # False
    print(isPerfectNumber(100)) # False


if __name__ == '__main__':
    main()
