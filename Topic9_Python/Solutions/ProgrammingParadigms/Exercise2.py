def main():

    def invert_Imperative(lis):
        """Receives a list containing integers. Returns a new list containing the same
        elements but in reversed order"""
        inverted = []

        for element in lis:
            inverted = [element] + inverted

        return inverted

    def invert_Functional(lis):
        """Receives a list containing integers. Returns a new list containing the same
        elements but in reversed order"""

        if len(lis) == 0:
            return []
        else:
            return invert_Functional(lis[1:]) + [lis[0]]


    print(invert_Imperative([1,2,3,4])) # Must print [4,3,2,1]
    print(invert_Imperative([4,3,2,1])) # Must print [1,2,3,4]
    print(invert_Imperative([5])) # Must print [5]
    print(invert_Functional([1,2,3,4])) # Must print [4,3,2,1]
    print(invert_Functional([4,3,2,1])) # Must print [1,2,3,4]
    print(invert_Functional([5])) # Must print [5]

if __name__ == '__main__':
    main()