def getN(n):
    string1 = ""
    string2 = ""
    i = 1
    original = n
    while (1):
        string2 = string1
        string1+=str(i)
        if(n - len(string1) <= 0):
            break;

        n = n - len(string1)
        i+=1

    # return string1[n-1];



if __name__ == "__main__":
    input = int(raw_input())
    output = getN(input)
    print output