
# Savings Calculator 


def savings_calculator(current, desired, interest):
    years = 0
    while True:
        current += current*(interest / 100)
        years += 1
        if current >= desired:
            break 
    print(years)
    
data = list(map(int, input("data: ").split()))
for i in range(0, len(data), 3):
    savings_calculator(data[i], data[i+1], data[i+2])
    



# Equilibrium Index 

# Brute Force (O^2 time complexity)
def equi(A):
    equi_index = []
    sum_right = 0
    sum_left = 0
    for i in range(len(A)):
        if i == 0:
            sum_left = 0
            sum_right = sum(A[i+1:])
        elif i == (len(A) - 1):
            sum_left = sum(A[:i])
            sum_right = 0
        else:
            sum_right = sum(A[i+1:])
            sum_left = sum(A[:i])
        if sum_right == sum_left:
            equi_index.append(i)
    if len(equi_index) == 0:
        return -1
    else:
        return equi_index

assert equi([-7, 1, 5, 2, -4, 3, 0])

    
     
#Equilibrium Index


# Perfect score (linear time)
def equi(A):
    sum_left, sum_right = 0, sum(A)
    for index,value in enumerate(A):
        sum_right -= value
        if sum_left == sum_right:
            print(index)
        sum_left += value

equi([-7, 1, 5, 2, -4, 3, 0])
        

a = enumerate([-7, 1, 5, 2, -4, 3, 0])
print(list(a))

#First Covering Prefix

#Slow Solution
def covering_prefix(A):
    lst = []
    for i in A:
        lst.append(i)
        if set(lst) == set(A):
            return A.index(i)
        
        

#First Covering Prefix
#Fast Solution
def covering_prefix(A):
    n = len(A)
    occurs = [False] * n # creates a list of Falses of length n
    print(occurs)
    for i in range(n): #iterating through the each possible value
        print(i)
        if occurs[A[i]] == False: #if value not in list
            occurs[A[i]] = True # mark True in list of occurences
            result = i
    return result 
     
            
    
covering_prefix([2,2,1,0,1])


# Sorting Swap

def solution(A):
    if A == sorted(A):
        return True
    count = 0
    for i in (range(len(A))):
        if A[i] != sorted(A)[i]:
              count += 1
    if count == 2:
        return True
    else:
        return False
                
             

# Parking Lot

def solution(E, L):
    enter = list(map(int, E.split(":")))
    leave = list(map(int, L.split(":")))
    hours = leave[0] - enter[0]
    if enter[1] > leave[1]:
        mins = 60 - enter[1] + leave[1]
    else:
        mins = leave[1] - enter[1]
    total_time = mins + hours*60
    
    successive_hours = 0
    if total_time <= 60:
        successive_hours = 0
    elif total_time <= 120:
        successive_hours = 1
    elif total_time > 120:
        if mins == 0:
            successive_hours = hours - 1
        else:
            successive_hours = hours
    fee = 5 + 4*successive_hours
    print(total_time, successive_hours, fee, hours)
        
    
  

def centered_average(nums):
    nums = sorted(nums)[1:len(nums) - 1])
    return sum(center) // len(center)

centered_average([100, 0, 5, 3, 4])



# Product of Integers Excluding Value at Index

def other_product(mylist):
    result = []
    for i, x in enumerate(mylist):
        mylist.remove(x)
        product = 1
        for j in mylist:
            product *= j
        result.append(product)
        mylist.insert(i, x)
    return result

other_product([1,7,3,4])



# Word Cloud

def word_cloud(words):
    mydict = {}
    for word in words.split(" "):
        count = 1
        if word.lower() not in mydict:
            mydict[word.lower()] = count
        if word.lower() in mydict:
            count += 1
            mydict[word.lower()] = count
    print(mydict)
    
            
 # Temp Tracker  

class TempTracker:
    def __init__(self,region):
        self.temps = []
        
    def insert(self, temp):
        self.temps.append(temp)
    def get_max(self, temps):
        return max(self.temps)
    def get_min():
        return min(self.temps)
    def get_mean():
        return sum(self.temps) / len(self.temps)
    
            

#Binary Gap 

#First Attempt
def Binary_Gap(N):
    gap = 0
    long = []
    binary = map(int, list(bin(N)[2:]))
    for i,x in list(enumerate(binary)):
        if x == 1:
            long.append(i)
    diff = []
    for i in (range(len(long) - 1 )):
        diff.append(abs(long[i+1] - long[i]))
    return max(diff) - 1 
        
        
        
          

# Codility Problem

def solution(N):
    words = ["Fizz", "Buzz", "Woof"]
    result = ""
    for i in range(1, N+1):
        result = ""
        if i % 3 == 0:
            result += words[0]
        if i % 5 == 0:
            result += words[1]
        if i % 7 == 0:
            result += words[2]
        if len(result) > 0:
            print(result)
        else:
            print(i)
        

# Length of Linked Index List with Cycles

def solution(A):
    head  = A[0]
    node = 0 
    nodes = []
    if head == 0:
        return node # this is assuming that the first value in the linked list is 
                    # NOT a node if it is equal to zero, because it is not pointing
    else:           # to a value in the list
        node = 1 
        nodes.append(A.index(head))
    
    
        
    """Given the problem statement, we know that the test cases for this function will
    linked lists comprised of valid successive indexed nodes. 
    
    That is, every value in A[0,...., N-1] is less than N. This means the only constraint
    on these  lists will be the first pointer that points to a node with a value of 
    -1, which terminates the linked list"""
    
    while True: # looping through list, counting valid nodes
        if node == len(A): #break condition for fully linked list
            break
        previous = head
        head = A[head]
        node += 1
        nodes.append(A.index(head))
        if head == A.index(previous):
            break
        if head in nodes: # break condition for doubly linked elements
            break
        if head == -1: #break condition for list termination on -1

            break
    return node  
        
# Length of Linked List without Cycle

def solution(L):
    count = 0
    while L:
        count += 1
        L = L.next
    return count



