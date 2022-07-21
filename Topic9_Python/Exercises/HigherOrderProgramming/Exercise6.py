import math


def main():
    testList = [1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9, 9, 9, 10, 15, 25, 29, 67, 100]

    # Here are some naive implementations of filtering functions
    def filterOutOddNumbers(lis):
        filteredList = []

        for element in lis:
            if element % 2 == 0:
                filteredList += [element]

        return filteredList

    def filterOutNumbersEndingIn0(lis):
        filteredList = []

        for element in lis:
            if element % 10 != 0:
                filteredList += [element]

        return filteredList

    # TODO 6.1: Implement this naively. You may choose whatever Paradigm you want. Try using Functional to gain
    # more practice.
    # Hint: 'element in lis' returns True if the element is inside the list
    # Note: You don't need to worry about preserving the order of the original list
    # Ex: filterOutRepeatedNumbers([1,1,1,2]) may return [2,1] and that's fine
    def filterOutRepeatedNumbers(lis):
        pass

    print("Naive odd filter: ", filterOutOddNumbers(testList))
    print("Naive 0 filter: ", filterOutNumbersEndingIn0(testList))
    print("Naive repeated filter: ", filterOutRepeatedNumbers(testList))

    # Higher Order implementation
    def filterList(lis, apply):
        pass  # TODO 6.1: Implement this

    def oddFilter(filteredList, element):
        pass  # TODO 6.1: Implement this. Returns True when the element is to be discarded

    def endingIn0Filter(filteredList, element):
        pass  # TODO 6.1: Implement this. Returns True when the element is to be discarded

    def repeatedNumberFilter(filteredList, element):
        pass  # TODO 6.1: Implement this. Returns True when the element is to be discarded

    print("Function odd filter: ", filterList(testList, oddFilter))
    print("Function 0 filter: ", filterList(testList, endingIn0Filter))
    print("Function repeated filter: ", filterList(testList, repeatedNumberFilter))

    # TODO 6.2: Using lambdas, apply the desired filter on each list

    # TODO 6.2: Apply an odd filter
    print("Lambda odd filter: ", filterList(testList, TODO))
    # TODO 6.2: Apply a 0 filter
    print("Lambda 0 filter: ", filterList(testList, TODO))
    # TODO 6.2: Apply a repeated filter
    print("Lambda repeated filter: ", filterList(testList, TODO))

    # TODO 6.2: Apply a filter that removes multiples of 3
    print("Lambda multiples of 3 filter: ", filterList(testList, TODO))
    # TODO 6.2: Apply a filter that removes numbers whose squared value is greater than 20
    print("Lambda square greater than 20 filter: ", filterList(testList, TODO))
    # TODO 6.2: Apply a filter that removes numbers smaller than ((sum of elements of the list) / 10)
    # Hint: Use the built-in 'sum()' function from Python
    print("Lambda smaller than sum / 10 filter: ", filterList(testList, TODO))


TODO = None

if __name__ == '__main__':
    main()
