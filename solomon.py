#process manager: cybernete
import numpy as np
#Modified milgram experiment:King Solomon's Decision Algorithm
from random import seed
from random import randint

def keep_alive(n):
    print("\t\tKing to N Queens: Shall I stay the course or shall I dissolve the contract?\n")
    for i in range(n):
        
        a = randint(1,n)
        b = randint(1,n)       
        if a%b == 0:
            print("ClothNode says keep_alive, IronNode says dissolve contract")
        else:
            print("IronNode says dissolve_contract, ClothNode says keep alive")
        n-1





N = 5 #or log32base2
keep_alive(N)# is integer
