def main():

    testList = [1, 2, 3, 4]

    # Naive implementation. Using Functional Programming only, just for practice
    def sum(lis):
        if len(lis) == 1:
            return lis[0]
        else:
            return lis[0] + sum(lis[1:])

    def sumSquared(lis):
        if len(lis) == 1:
            return lis[0] * lis[0]
        else:
            return lis[0] * lis[0] + sumSquared(lis[1:])

    def sumCubed(lis):
        if len(lis) == 1:
            return lis[0] * lis[0] * lis[0]
        else:
            return lis[0] * lis[0] * lis[0] + sumCubed(lis[1:])

    def multiplication(lis):
        if len(lis) == 1:
            return lis[0]
        else:
            return lis[0] * multiplication(lis[1:])

    print("Naive sum: ", sum(testList))
    print("Naive squared sum: ", sumSquared(testList))
    print("Naive cubed sum: ", sumCubed(testList))
    print("Naive multiplication: ", multiplication(testList))

    # Higher Order implementation
    def reduce(lis, apply):
        accumulated = lis[0]

        for i in range(1, len(lis)):  # Makes 'i' go from '1' to 'len(lis) - 1'
            accumulated = apply(accumulated, lis[i])

        return accumulated

    def normalSum(accumulated, element):
        return element + accumulated

    def squared(accumulated, element):
        return element * element + accumulated

    def cubed(accumulated, element):
        return element ** 3 + accumulated  # Using Python's power operator

    def multiply(accumulated, element):
        return element * accumulated


    print("Function sum: ", reduce(testList, normalSum))
    print("Function squared sum: ", reduce(testList, squared))
    print("Function cubed sum: ", reduce(testList, cubed))
    print("Function multiplication: ", reduce(testList, multiply))

    # Lambdas
    print("Lambda sum: ", reduce(testList, lambda acc, el: el + acc))  # normal sum
    print("Lambda squared sum: ", reduce(testList, lambda acc, el: el ** 2 + acc))  # squared sum
    print("Lambda cubed sum: ", reduce(testList, lambda acc, el: el ** 3 + acc))  # cubed sum
    print("Lambda multiplication: ", reduce(testList, lambda acc, el: el * acc))  # multiplication
    print("Lambda division: ", reduce(testList, lambda acc, el: el / acc))  # division
    print("Lambda power: ", reduce(testList, lambda acc, el: acc ** el))  # power

    # A function that returns the double of the provided argument
    def doubleFunction(x):
        return x * 2

    # A lambda function that does the same thing, but it gets associated with a variable
    # Even though Python allows you to do this, you should use 'def' instead.
    # Creating functions by assigning variables to lambda functions is bad practice
    doubleLambda = lambda x: x * 2

    print(doubleFunction(10))  # prints 20
    print(doubleLambda(10))  # prints 20


if __name__ == '__main__':
    main()