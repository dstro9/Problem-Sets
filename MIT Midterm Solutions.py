
#MIT Introduction to CS Using Python
#Midterm Exam



def print_without_vowels(s):
    '''
    s: the string to convert
    Finds a version of s without vowels and whose characters appear in the 
    same order they appear in s. Prints this version of s.
    Does not return anything
    '''
    mystr = ""
    vowels = ["a", "e", "i", "o", "u","A","E","I","O","U"]
    for letter in s:
        if letter not in vowels:
            mystr += letter 
    print(mystr)



def largest_odd_times(L):
    """ Assumes L is a non-empty list of ints
        Returns the largest element of L that occurs an odd number 
        of times in L. If no such element exists, returns None """
    L = sorted(L)[::-1]
    for i in L:
        if L.count(i) % 2 == 1:
            return i
    



def dict_invert(d):
    '''
    d: dict
    Returns an inverted dictionary according to the instructions above
    '''
    mydict = {}
    for i in d.keys():
        if d[i] in mydict:
            mydict[d[i]] += [i]
        else:
            mydict[d[i]] = [i]
     
    for i in mydict.keys():
        mydict[i] = sorted(mydict[i]) 
    return mydict



def general_poly (L):
    """ L, a list of numbers (n0, n1, n2, ... nk)
    Returns a function, which when applied to a value x, returns the value 
    n0 * x^k + n1 * x^(k-1) + ... nk * x^0 """
    def poly(x):
        result = 0
        power = len(L) - 1
        for i in L:
            result += i*x**power
            power -= 1
        return result
    return poly



def is_list_permutation(L1, L2):
    '''
    L1 and L2: lists containing integers and strings
    Returns False if L1 and L2 are not permutations of each other. 
            If they are permutations of each other, returns a 
            tuple of 3 items in this order: 
            the element occurring most, how many times it occurs, and its type
    '''
    if len(L1) == len(L2) == 0:
        return(None, None, None)
    if sorted(map(str, L1)) == sorted(map(str, L2)):
        mode = 0
        value = 0
        for i in L1:
            if L1.count(i)> mode:
                mode = L1.count(i)
                value = i
        return (value, mode, type(value))
    return False
            






