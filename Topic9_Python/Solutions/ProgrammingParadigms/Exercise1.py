def main():

    def filterOutBigNumbers_Imperative(lis, biggestNumber):
        """Receives a list containing integers. Returns a new list containing elements
        from the given list that are smaller or equal than the provided biggestNumber"""
        filtered = []

        for element in lis:
            if element <= biggestNumber:
                filtered.append(element)
                # Or
                # filtered += [element]
                # which is the same as
                # filtered = filtered + [element]

        return filtered

    def filterOutBigNumbers_Functional(lis, biggestNumber):
        """Receives a list containing integers. Returns a new list containing elements
        from the given list that are smaller than the provided biggestNumber"""

        if len(lis) == 0:
            return []
        else:
            if lis[0] <= biggestNumber:
                return [lis[0]] + filterOutBigNumbers_Functional(lis[1:], biggestNumber)
            else:
                return filterOutBigNumbers_Functional(lis[1:], biggestNumber)


    print(filterOutBigNumbers_Imperative([1,2,3,4,5,6,7,8], 5)) # Must print [1,2,3,4,5]
    print(filterOutBigNumbers_Imperative([1,2,3,4,5,6,7,8], -1)) # Must print []
    print(filterOutBigNumbers_Imperative([1,2,3,4,5,6,7,8], 9)) # Must print [1,2,3,4,5,6,7,8]
    print(filterOutBigNumbers_Functional([1,2,3,4,5,6,7,8], 5)) # Must print [1,2,3,4,5]
    print(filterOutBigNumbers_Functional([1,2,3,4,5,6,7,8], -1)) # Must print []
    print(filterOutBigNumbers_Functional([1,2,3,4,5,6,7,8], 9)) # Must print [1,2,3,4,5,6,7,8]

if __name__ == '__main__':
    main()