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
        # I decided to use Functional Programming, as an exercise
        if len(lis) == 0:
            return []
        else:
            if lis[0] in lis[1:]:
                # There's a copy of this element in the list. Excluding it
                return filterOutRepeatedNumbers(lis[1:])
            else:
                # This element is unique. Adding it
                return [lis[0]] + filterOutRepeatedNumbers(lis[1:])


    print("Naive odd filter: ", filterOutOddNumbers(testList))
    print("Naive 0 filter: ", filterOutNumbersEndingIn0(testList))
    print("Naive repeated filter: ", filterOutRepeatedNumbers(testList))

    # Higher Order implementation
    def filterList(lis, apply):
        filteredList = []

        for element in lis:
            if not apply(filteredList, element):
                # The 'apply' function returns True when the item is supposed to be discarded
                # We enter this if block when the function returns False. Therefore, we add the element
                filteredList += [element]

        return filteredList

    def oddFilter(filteredList, element):
        return element % 2 == 1

    def endingIn0Filter(filteredList, element):
        return element % 10 == 0

    def repeatedNumberFilter(filteredList, element):
        return element in filteredList

    print("Function odd filter: ", filterList(testList, oddFilter))
    print("Function 0 filter: ", filterList(testList, endingIn0Filter))
    print("Function repeated filter: ", filterList(testList, repeatedNumberFilter))

    # TODO 6.2: Using lambdas, apply the desired filter on each list

    # TODO 6.2: Apply an odd filter
    print("Lambda odd filter: ", filterList(testList, lambda fil, el: el % 2 == 1))
    # TODO 6.2: Apply a 0 filter
    print("Lambda 0 filter: ", filterList(testList, lambda fil, el: el % 10 == 0))
    # TODO 6.2: Apply a repeated filter
    print("Lambda repeated filter: ", filterList(testList, lambda fil, el: el in fil))

    # TODO 6.2: Apply a filter that removes multiples of 3
    print("Lambda multiples of 3 filter: ", filterList(testList, lambda fil, el: el % 3 == 0))
    # TODO 6.2: Apply a filter that removes numbers whose squared value is greater than 20
    print("Lambda square greater than 20 filter: ", filterList(testList, lambda fil, el: el * el > 20))
    # TODO 6.2: Apply a filter that removes numbers smaller than ((sum of elements of the list) / 10)
    # Hint: Use the built-in 'sum()' function from Python
    print("Lambda smaller than sum / 10 filter: ", filterList(testList, lambda fil, el: el < sum(testList) / 10))


if __name__ == '__main__':
    main()
