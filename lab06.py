from random import randrange

def rollDice():
    '''
    (10 points)
    Function that returns the sum of rolling two six-sided dice.
    - Note that the possible sum of rolling two dice is [2-12].
    However, this distribution is not uniform (i.e. rolling a 2 does
    not have the same probability as rolling a 6). Your function must
    use randrange correctly to account for this.
    '''
    sum1 = 0
    sum1 = sum1 + randrange(1,7)
    sum1 = sum1 + randrange(1,7)
    return sum1


def rollDistribution(n):
    '''
    (10 points)
    Function that rolls a pair of dice n number of times. Returns a
    list of ints, diceTally, that keeps track of the number of times
    a certain sum occurs.
    - Use the technique discussed in lecture where you can create a
    list of 14 integers, where the index of the list represents a
    particular dice roll value, and the value of that position represents
    the number of times that dice roll occurred.
    - Note: diceTally[0] and diceTally[1] will always be 0 since
    having rolling a pair of dice will never result in 0 or 1.
    - Your algorithm should call rollDice() n number of times when
    populating your list.
    '''
    listc = []
    for y in range(0,n+1):
        listc.append(rollDice())
    listn = [0,0,0,0,0,0,0,0,0,0,0,0,0]
    for x in listc:
        listn[x] += 1
    return listn

def printDistribution(diceTally):
    '''
    (20 points)
    Function that prints the diceTally distribution in a specific
    format (see lab instructions for more details).
    - This function does not return anything since it is simply
    printing to the console.
    - Note: Your algorithm must iterate and print each dice roll value in
    a loop. Do not simply have 10 print statements for each dice roll value.
    - Be VERY PRECISE in your format. Each character matters for full credit.
    '''
    print("Distribution of dice rolls\n")
    for x in diceTally:
        if x.index() > 1:
            print(x.index().
