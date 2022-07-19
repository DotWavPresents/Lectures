def main():

    def invert_Imperative(lis):
        """Receives a list containing integers. Returns a new list containing the same
        elements but in reversed order"""
        inverted = []

        #TODO- Fill the 'inverted' list with the correct elements so it may be returned.
        # Use imperative programming only (variable declarations, if, else, while, for)

        return inverted

    def invert_Functional(lis):
        """Receives a list containing integers. Returns a new list containing the same
        elements but in reversed order"""

        #TODO- Use recursion to return a new incrementally built list containing only correct elements
        # from 'lis'. You may not use variable declarations or while or for. Only recursion.

        pass



    print(invert_Imperative([1,2,3,4])) # Must print [4,3,2,1]
    print(invert_Imperative([4,3,2,1])) # Must print [1,2,3,4]
    print(invert_Imperative([5])) # Must print [5]
    print(invert_Functional([1,2,3,4])) # Must print [4,3,2,1]
    print(invert_Functional([4,3,2,1])) # Must print [1,2,3,4]
    print(invert_Functional([5])) # Must print [5]

if __name__ == '__main__':
    main()