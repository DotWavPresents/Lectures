def main():

    # --- How to use Python Lists ---
    lis = [] # Creates an empty list
    lis = [1, 5, "abc", 65.6] # Creates a list with 4 elements inside
    lis += [67] # List addition: appends '67' to the list. '67' becomes the last element of the list
    lis.append(23) # Appends '23' to the end of the list
    print(lis)
    print(lis[0]) # Accessing the first element
    print(lis[2]) # Accessing the 3rd element
    lis[4] = 9 # Replacing the 5th element with '9'
    print(lis[-1]) # Accessing the last element
    print(len(lis)) # Getting the length of the list
    print(lis[1:]) # Getting all elements except the first
    print(lis[1:5]) # Getting all elements ranging from the 2nd to the 5th
    print(lis[:-1]) # Getting all elements except the last

    # How does the list store elements? How does the list access elements?
    # -It doesn't matter how it works
    # -All that matters is that it works. It does what we want: storing elements and accessing elements


if __name__ == '__main__':
    main()