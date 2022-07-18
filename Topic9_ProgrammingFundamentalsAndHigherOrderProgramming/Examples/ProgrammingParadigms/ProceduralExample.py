def main():
    # The list that I want to sort
    list = [4, 7, 9, 1, 4, 6, 12, 45, 99, 50, 66]
    # The resulting list
    filteredList = []
    temporaryList = []

    # Procedure to filter out odd numbers
    def filterOddNumbers(fromList, toList):
        # For each element...
        for element in fromList:
            if element % 2 == 0:
                # If it's even, keep it
                toList.append(element)
            # else: If it's odd, remove it. In this case, do nothing

    # Procedure to filter out big numbers
    def filterBigNumbers(fromList, toList):
        # For each element...
        for element in fromList:
            if element < 30:
                # If it's small, keep it
                toList.append(element)

    # Algorithm / recipe

    # We can see 'list' as being the shelf of ingredients
    # in our house in the cake example 'temporaryList'
    # would be the bowl that's receiving the ingredients from the shelf
    # Just like many recipes need flour, eggs and milk to be poured,
    # many algorithms need to filter out odd numbers. To make those
    # steps re-usable, they get placed inside a
    # procedure
    filterOddNumbers(list, temporaryList)
    filterBigNumbers(temporaryList, filteredList)

    print(filteredList)


if __name__ == '__main__':
    main()