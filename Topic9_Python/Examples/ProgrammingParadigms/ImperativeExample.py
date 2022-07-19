def main():
    # The list that I want to sort
    list = [4, 7, 9, 1, 4, 6, 12, 45, 99]
    # The resulting list
    filteredList = []

    # For each element...
    for element in list:
        if element % 2 == 0:
            # If it's even, keep it
            filteredList.append(element)
        # else: If it's odd, remove it. In this case, do nothing

    print(filteredList)


if __name__ == '__main__':
    main()
