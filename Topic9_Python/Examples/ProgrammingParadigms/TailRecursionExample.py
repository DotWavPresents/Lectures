import math


def main():

    def biggest(lis):
        """Receives a list containing integers. Returns the biggest element.
        You may assume 'lis' is never empty"""

        # Creating an auxiliary function with tail recursion.
        # The function's tail, AKA, 'biggest', holds the biggest number found so far
        def biggestAux(lis, biggestSoFar):
            if len(lis) == 0:
                # We reached the end of the list. That means this list's biggest number
                # is the biggest number found so far (biggestSoFar)
                return biggestSoFar
            else:
                if lis[0] > biggestSoFar:
                    # We found an element that is bigger than the previous biggest so far
                    # That means that this element is now the biggest one so far
                    return biggestAux(lis[1:], lis[0])
                else:
                    return biggestAux(lis[1:], biggestSoFar)

        return biggestAux(lis, -math.inf)

    print(biggest([4,6,9,100,57]))


if __name__ == '__main__':
    main()