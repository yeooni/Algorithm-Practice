def solution(myString):
    
    myString = myString.lower()
    
    if 'a' in myString or 'A' in myString:
        myString = myString.replace("a", "A")
        
    return myString