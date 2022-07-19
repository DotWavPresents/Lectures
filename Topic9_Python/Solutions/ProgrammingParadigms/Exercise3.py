import math


def main():

    def biggest_Imperative(lis):
        """Receives a list containing integers. Returns the biggest element.
        You may assume 'lis' is never empty"""

        # Declaring a variable that holds the biggest number found so far
        biggest = -math.inf

        for element in lis:
            if element > biggest:
                biggest = element

        return biggest

    def biggest_Functional(lis):
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


    print(biggest_Imperative([1,2,3,4])) # Must print 4
    print(biggest_Imperative([99,4,7,10])) # Must print 99
    print(biggest_Imperative([7])) # Must print 7
    print(biggest_Functional([1,2,3,4])) # Must print 4
    print(biggest_Functional([99,4,7,10])) # Must print 99
    print(biggest_Functional([7])) # Must print 7

if __name__ == '__main__':
    main()