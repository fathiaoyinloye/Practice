number = 7;
starBegin = number;
starEnds = number;
for count in range(1,number + 1):
    numberCheck = 1
    otherNumber = count + 1
    for counter in range(1, number * 2 + 1):
        if(counter >= starBegin and counter <= starEnds):
            if (counter <=number): 
                otherNumber-=1;
                print(f"{otherNumber}", end ="")
            else:
                numberCheck+=1
                print(f"{numberCheck}", end="")
        else:
            print(" ", end="");
            
    numberCheck += 1;
    print()
    starBegin-= 1; starEnds += 1;

  

  
  


