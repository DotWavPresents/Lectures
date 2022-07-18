def main():

    # Attempt 1: passing the next element to be analyzed
    def filterOutOddNumbers_1(lis, index):
        if len(lis) == index:
            return []
        else:
            if lis[index] % 2 == 0:
                return [lis[index]] + filterOutOddNumbers_1(lis, index + 1)
            else:
                return filterOutOddNumbers_1(lis, index + 1)

    # Attempt 2: Most common functional approach. Each recursive call passes a smaller
    # list. In this case, each recursive call passes the same list
    # without the first element
    def filterOutOddNumbers_2(lis):
        if len(lis) == 0:
            return []
        else:
            if lis[0] % 2 == 0:
                return [lis[0]] + filterOutOddNumbers_2(lis[1:])
            else:
                return filterOutOddNumbers_2(lis[1:])

    print(filterOutOddNumbers_1([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21, 43, 56, 75], 0))
    print(filterOutOddNumbers_2([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21, 43, 56, 75]))


if __name__ == '__main__':
    main()