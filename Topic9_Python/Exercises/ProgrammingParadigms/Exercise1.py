def main():

    def filterOutBigNumbers_Imperative(lis, biggestNumber):
        """Receives a list containing integers. Returns a new list containing elements
        from the given list that are smaller or equal than provided biggestNumber"""
        filtered = []

        #TODO- Fill the 'filtered' list with the correct elements so it may be returned.
        # Use imperative programming only (variable declarations, if, else, while, for)

        return filtered

    def filterOutBigNumbers_Functional(lis, biggestNumber):
        """Receives a list containing integers. Returns a new list containing elements
        from the given list that are smaller than the provided biggestNumber"""

        #TODO- Use recursion to return a new incrementally built list containing only correct elements
        # from 'lis'. You may not use variable declarations or while or for. Only recursion.

        pass



    print(filterOutBigNumbers_Imperative([1,2,3,4,5,6,7,8], 5)) # Must print [1,2,3,4,5]
    print(filterOutBigNumbers_Imperative([1,2,3,4,5,6,7,8], -1)) # Must print []
    print(filterOutBigNumbers_Imperative([1,2,3,4,5,6,7,8], 9)) # Must print [1,2,3,4,5,6,7,8]
    print(filterOutBigNumbers_Functional([1,2,3,4,5,6,7,8], 5)) # Must print [1,2,3,4,5]
    print(filterOutBigNumbers_Functional([1,2,3,4,5,6,7,8], -1)) # Must print []
    print(filterOutBigNumbers_Functional([1,2,3,4,5,6,7,8], 9)) # Must print [1,2,3,4,5,6,7,8]

if __name__ == '__main__':
    main()